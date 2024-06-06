/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kel9.fproject;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;

public class DatabaseConnect {
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    static {
        try (InputStream input = DatabaseConnect.class.getClassLoader().getResourceAsStream("db.properties")) {
            Properties prop = new Properties();
            if (input == null) {
                System.out.println("Sorry, unable to find db.properties");
            }
            // Load the properties file
            prop.load(input);
            // Get the property values
            URL = prop.getProperty("db.url");
            USER = prop.getProperty("db.user");
            PASSWORD = prop.getProperty("db.password");

            // Log loaded properties for debugging (Don't log passwords in production)
            System.out.println("Database URL: " + URL);
            System.out.println("Database User: " + USER);
            // Password logging is omitted for security reasons

        } catch (IOException ex) {
            System.out.println("Error loading db.properties file: " + ex.getMessage());
        }
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
            System.out.println("Connection failed!");
        }
        return connection;
    }
    
    public static boolean authenticate(String username, String password) {
        String query = "SELECT * FROM data_user WHERE username = ? AND password = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
            return false;
        }
    }
    
    public static DefaultTableModel populatePengirimanTable() {
        DefaultTableModel model = new DefaultTableModel();

        // Add columns to the table model
        model.addColumn("No");
        model.addColumn("Kode Pemesanan");
        model.addColumn("Pelanggan");
        model.addColumn("Jenis Produk");
        model.addColumn("Biaya Kirim");
        model.addColumn("Jasa Kirim");
        model.addColumn("Tanggal Kirim");

        // SQL query to select all records from the pengiriman table
        String query = "SELECT * FROM pengiriman";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Populate the table model with data from the ResultSet
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getInt("nomor"));
                row.add(rs.getString("kode_pemesanan"));
                row.add(rs.getString("pelanggan"));
                row.add(rs.getString("jenis_produk"));
                row.add(rs.getDouble("biaya_kirim"));
                row.add(rs.getString("jasa_kirim"));
                row.add(rs.getDate("tanggal_kirim"));
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to fetch data from database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return model;
    }
    
    public static DefaultTableModel populatePermintaanTable() {
        DefaultTableModel model = new DefaultTableModel();
        
        // Add columns to the table model
        model.addColumn("No");
        model.addColumn("Kode Pemesanan");
        model.addColumn("Tanggal Pemesanan");
        model.addColumn("Jenis Produk");
        model.addColumn("Pelanggan");
        model.addColumn("Jumlah Pesanan");
        model.addColumn("Status Pemesanan");

        // SQL query to select all records from the permintaan table
        String query = "SELECT * FROM permintaan";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Populate the table model with data from the ResultSet
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getInt("nomor"));
                row.add(rs.getString("kode_pemesanan"));
                row.add(rs.getDate("tanggal_pemesanan"));
                row.add(rs.getString("jenis_produk"));
                row.add(rs.getString("pelanggan"));
                row.add(rs.getInt("jumlah_pesanan"));
                row.add(rs.getString("status_pemesanan"));
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to fetch data from database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return model;
    }

    public static DefaultTableModel populatePersediaanTable() {
        DefaultTableModel model = new DefaultTableModel();

        // Add columns to the table model
        model.addColumn("Nomor");
        model.addColumn("ID Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Kategori");
        model.addColumn("Lokasi");
        model.addColumn("Exp Date");
        model.addColumn("Jumlah");

        // SQL query to select all records from the persediaan table
        String query = "SELECT * FROM persediaan";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Populate the table model with data from the ResultSet
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getInt("nomor"));
                row.add(rs.getString("id_barang"));
                row.add(rs.getString("nama_barang"));
                row.add(rs.getString("kategori"));
                row.add(rs.getString("lokasi"));
                row.add(rs.getDate("exp_date"));
                row.add(rs.getInt("jumlah"));
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to fetch data from database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return model;
    }    
    
    public static boolean insertPengirimanRecord(String kodePemesanan, String pelanggan, String jenisProduk, String biayaKirim, String jasaKirim, String tanggalKirim) {
        String query = "INSERT INTO pengiriman (kode_pemesanan, pelanggan, jenis_produk, biaya_kirim, jasa_kirim, tanggal_kirim) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, kodePemesanan);
            pstmt.setString(2, pelanggan);
            pstmt.setString(3, jenisProduk);
            pstmt.setString(4, biayaKirim);
            pstmt.setString(5, jasaKirim);
            pstmt.setString(6, tanggalKirim);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new record has been inserted into the pengiriman table.");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to insert data into the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }
   
    public static boolean insertPermintaanRecord(String kodePemesanan, String tanggalPemesanan, String jenisProduk, String pelanggan, int jumlahPesanan, String statusPemesanan) {
        String query = "INSERT INTO permintaan (kode_pemesanan, tanggal_pemesanan, jenis_produk, pelanggan, jumlah_pesanan, status_pemesanan) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, kodePemesanan);
            pstmt.setString(2, tanggalPemesanan);
            pstmt.setString(3, jenisProduk);
            pstmt.setString(4, pelanggan);
            pstmt.setInt(5, jumlahPesanan);
            pstmt.setString(6, statusPemesanan);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new record has been inserted into the permintaan table.");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to insert data into the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }
    
    public static boolean insertPersediaanRecord(String idBarang, String namaBarang, String kategori, String lokasi, String expDate, int jumlah) {
        String query = "INSERT INTO persediaan (id_barang, nama_barang, kategori, lokasi, exp_date, jumlah) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, idBarang);
            pstmt.setString(2, namaBarang);
            pstmt.setString(3, kategori);
            pstmt.setString(4, lokasi);
            pstmt.setString(5, expDate);
            pstmt.setInt(6, jumlah);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new record has been inserted into the persediaan table.");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to insert data into the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }
    
    public static boolean modifyPersediaanRecord(String idBarang, String namaBarang, String kategori, String lokasi, String expDate, Integer jumlah) {
        if (idBarang == null || idBarang.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID Barang is mandatory.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        StringBuilder query = new StringBuilder("UPDATE persediaan SET ");
        boolean hasPrevious = false;

        if (namaBarang != null && !namaBarang.isEmpty()) {
            query.append("nama_barang = ?, ");
            hasPrevious = true;
        }
        if (kategori != null && !kategori.isEmpty()) {
            query.append("kategori = ?, ");
            hasPrevious = true;
        }
        if (lokasi != null && !lokasi.isEmpty()) {
            query.append("lokasi = ?, ");
            hasPrevious = true;
        }
        if (expDate != null && !expDate.isEmpty()) {
            query.append("exp_date = ?, ");
            hasPrevious = true;
        }
        if (jumlah != null) {
            query.append("jumlah = ?, ");
            hasPrevious = true;
        }

        // Remove the last comma and space
        if (hasPrevious) {
            query.setLength(query.length() - 2);
        } else {
            JOptionPane.showMessageDialog(null, "No fields to update.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        query.append(" WHERE id_barang = ?");

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query.toString())) {

            int index = 1;

            if (namaBarang != null && !namaBarang.isEmpty()) {
                pstmt.setString(index++, namaBarang);
            }
            if (kategori != null && !kategori.isEmpty()) {
                pstmt.setString(index++, kategori);
            }
            if (lokasi != null && !lokasi.isEmpty()) {
                pstmt.setString(index++, lokasi);
            }
            if (expDate != null && !expDate.isEmpty()) {
                pstmt.setString(index++, expDate);
            }
            if (jumlah != null) {
                pstmt.setInt(index++, jumlah);
            }

            pstmt.setString(index, idBarang);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully in the persediaan table.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No record found with the provided ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to update the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }
    
    public static boolean modifyPermintaanRecord(String kodePemesanan, String tanggalPemesanan, String jenisProduk, String pelanggan, Integer jumlahPesanan, String statusPemesanan) {
        StringBuilder queryBuilder = new StringBuilder("UPDATE permintaan SET ");
        boolean first = true;

        if (tanggalPemesanan != null && !tanggalPemesanan.isEmpty()) {
            queryBuilder.append("tanggal_pemesanan = ?");
            first = false;
        }
        if (jenisProduk != null && !jenisProduk.isEmpty()) {
            if (!first) queryBuilder.append(", ");
            queryBuilder.append("jenis_produk = ?");
            first = false;
        }
        if (pelanggan != null && !pelanggan.isEmpty()) {
            if (!first) queryBuilder.append(", ");
            queryBuilder.append("pelanggan = ?");
            first = false;
        }
        if (jumlahPesanan != null) {
            if (!first) queryBuilder.append(", ");
            queryBuilder.append("jumlah_pesanan = ?");
            first = false;
        }
        if (statusPemesanan != null && !statusPemesanan.isEmpty()) {
            if (!first) queryBuilder.append(", ");
            queryBuilder.append("status_pemesanan = ?");
        }

        queryBuilder.append(" WHERE kode_pemesanan = ?");

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(queryBuilder.toString())) {

            int paramIndex = 1;
            if (tanggalPemesanan != null && !tanggalPemesanan.isEmpty()) {
                pstmt.setString(paramIndex++, tanggalPemesanan);
            }
            if (jenisProduk != null && !jenisProduk.isEmpty()) {
                pstmt.setString(paramIndex++, jenisProduk);
            }
            if (pelanggan != null && !pelanggan.isEmpty()) {
                pstmt.setString(paramIndex++, pelanggan);
            }
            if (jumlahPesanan != null) {
                pstmt.setInt(paramIndex++, jumlahPesanan);
            }
            if (statusPemesanan != null && !statusPemesanan.isEmpty()) {
                pstmt.setString(paramIndex++, statusPemesanan);
            }

            pstmt.setString(paramIndex, kodePemesanan);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("The record has been updated in the permintaan table.");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to update data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }
    
    public static boolean modifyPengirimanRecord(String kodePemesanan, String pelanggan, String jenisProduk, String biayaKirim, String jasaKirim, String tanggalKirim) {
        StringBuilder queryBuilder = new StringBuilder("UPDATE pengiriman SET ");
        boolean first = true;

        if (pelanggan != null && !pelanggan.isEmpty()) {
            queryBuilder.append("pelanggan = ?");
            first = false;
        }
        if (jenisProduk != null && !jenisProduk.isEmpty()) {
            if (!first) queryBuilder.append(", ");
            queryBuilder.append("jenis_produk = ?");
            first = false;
        }
        if (biayaKirim != null && !biayaKirim.isEmpty()) {
            if (!first) queryBuilder.append(", ");
            queryBuilder.append("biaya_kirim = ?");
            first = false;
        }
        if (jasaKirim != null && !jasaKirim.isEmpty()) {
            if (!first) queryBuilder.append(", ");
            queryBuilder.append("jasa_kirim = ?");
            first = false;
        }
        if (tanggalKirim != null && !tanggalKirim.isEmpty()) {
            if (!first) queryBuilder.append(", ");
            queryBuilder.append("tanggal_kirim = ?");
        }

        queryBuilder.append(" WHERE kode_pemesanan = ?");

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(queryBuilder.toString())) {

            int paramIndex = 1;
            if (pelanggan != null && !pelanggan.isEmpty()) {
                pstmt.setString(paramIndex++, pelanggan);
            }
            if (jenisProduk != null && !jenisProduk.isEmpty()) {
                pstmt.setString(paramIndex++, jenisProduk);
            }
            if (biayaKirim != null && !biayaKirim.isEmpty()) {
                pstmt.setString(paramIndex++, biayaKirim);
            }
            if (jasaKirim != null && !jasaKirim.isEmpty()) {
                pstmt.setString(paramIndex++, jasaKirim);
            }
            if (tanggalKirim != null && !tanggalKirim.isEmpty()) {
                pstmt.setString(paramIndex++, tanggalKirim);
            }

            pstmt.setString(paramIndex, kodePemesanan);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("The record has been updated in the pengiriman table.");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to update data in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

}

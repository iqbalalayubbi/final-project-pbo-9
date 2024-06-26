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
import java.sql.Statement;
import java.util.Properties;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
            int i = 1;
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(i);
                row.add(rs.getString("kode_pemesanan"));
                row.add(rs.getDate("tanggal_pemesanan"));
                row.add(rs.getString("jenis_produk"));
                row.add(rs.getString("pelanggan"));
                row.add(rs.getInt("jumlah_pesanan"));
                row.add(rs.getString("status_pemesanan"));
                model.addRow(row);
                i++;
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
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbopersediaan;

/**
 *
 * @author MielM
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PBOPersediaan extends JFrame {
    private final Persediaan persediaan;
    private final BarangModelTabel barangTableModel;
    private JTable barangTable;

    private JTextField idField, namaField, kategoriField, lokasiField, tanggalField, jumlahField;

    public PBOPersediaan() {
        persediaan = new Persediaan();
        barangTableModel = new BarangModelTabel(persediaan.getAllBarang());
        initUI();
    }

    private void initUI() {
        setTitle("Manajemen Persediaan");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("ID Barang:"), gbc);

        gbc.gridx = 1;
        idField = new JTextField(20);
        panel.add(idField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Nama Barang:"), gbc);

        gbc.gridx = 1;
        namaField = new JTextField(20);
        panel.add(namaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Kategori:"), gbc);

        gbc.gridx = 1;
        kategoriField = new JTextField(20);
        panel.add(kategoriField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Lokasi:"), gbc);

        gbc.gridx = 1;
        lokasiField = new JTextField(20);
        panel.add(lokasiField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("EXP Date (yyyy-MM-dd):"), gbc);

        gbc.gridx = 1;
        tanggalField = new JTextField(20);
        panel.add(tanggalField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(new JLabel("Jumlah:"), gbc);

        gbc.gridx = 1;
        jumlahField = new JTextField(20);
        panel.add(jumlahField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton tambahButton = new JButton("Tambah Barang");
        tambahButton.addActionListener((ActionEvent e) -> tambahBarang());
        panel.add(tambahButton, gbc);

        gbc.gridy = 7;
        JButton laporanButton = new JButton("Laporan Persediaan");
        laporanButton.addActionListener((ActionEvent e) -> laporanPersediaan());
        panel.add(laporanButton, gbc);

        // Tabel
        barangTable = new JTable(barangTableModel);
        JScrollPane scrollPane = new JScrollPane(barangTable);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void tambahBarang() {
        try {
            String id = idField.getText();
            String nama = namaField.getText();
            String kategori = kategoriField.getText();
            String lokasi = lokasiField.getText();
            Date tanggalKedaluwarsa = new SimpleDateFormat("yyyy-MM-dd").parse(tanggalField.getText());
            int jumlah = Integer.parseInt(jumlahField.getText());

            Barang barang = new Barang(id, nama, kategori, lokasi, tanggalKedaluwarsa, jumlah);
            persediaan.tambahBarang(barang);
            barangTableModel.fireTableDataChanged();

            JOptionPane.showMessageDialog(this, "Barang berhasil ditambahkan!");
        } catch (ParseException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void laporanPersediaan() {
        Pengingat pengingat = new Pengingat(persediaan);
        String laporanMinimum = pengingat.cekMinimumPersediaan(10);  // Ganti nilai minimum sesuai kebutuhan
        String laporanKadaluwarsa = pengingat.cekKadaluwarsa();
        String laporan = laporanMinimum + "\n" + laporanKadaluwarsa;

        JOptionPane.showMessageDialog(this, laporan, "Laporan Persediaan", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PBOPersediaan ex = new PBOPersediaan();
            ex.setVisible(true);
        });
    }
}

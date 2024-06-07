/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kel9.fproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author x1nx3r
 */
public class PengirimanUbah extends javax.swing.JFrame {

    private DashboardUI parentUI;
    private String idSelected;
    /**
     * Creates new form PengirimanUbah
     */
    public PengirimanUbah(DashboardUI parentUI, int idSelected, JTable deliveryTable) {
        initComponents();
        this.parentUI = parentUI;  
        Map<String, String> valuesRow = parentUI.getDataRowSelected(deliveryTable, idSelected);
        this.idSelected = valuesRow.get("Kode Pemesanan");
        this.fillTextInput(valuesRow);
        // No, Kode Pemesanan, Pelanggan, Jenis Produk, Biaya Kirim, Jasa Kirim, Tanggal Kirim
    }

    private void fillTextInput(Map<String, String> valuesRow) {
        try {


            //? kode pemesanan
            this.kode_pemesanan_field.setText(valuesRow.get("Kode Pemesanan"));
            //? pelanggan
            this.pelanggan_field.setText(valuesRow.get("Pelanggan"));
            //? jenis produk
            this.jenis_produk_field.setText(valuesRow.get("Jenis Produk"));
            //? biaya kirim
            this.biaya_pengiriman_field.setText(valuesRow.get("Biaya Kirim"));
            //? jasa kirim
            this.jenis_pengiriman_field.setSelectedItem(valuesRow.get("Jasa Kirim"));
            
            //? date chooser
            String dateValue = valuesRow.get("Tanggal Kirim");
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
            this.tanggal_pengiriman_field.setDate(date);
            
       
        } catch (ParseException ex) {
            Logger.getLogger(PermintaanUbah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gap1 = new javax.swing.JSeparator();
        title_container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        code_input = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        gap2 = new javax.swing.JSeparator();
        kode_pemesanan_field = new javax.swing.JTextField();
        gap6 = new javax.swing.JSeparator();
        code_input5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        gap10 = new javax.swing.JSeparator();
        pelanggan_field = new javax.swing.JTextField();
        gap13 = new javax.swing.JSeparator();
        code_input1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        gap3 = new javax.swing.JSeparator();
        jenis_produk_field = new javax.swing.JTextField();
        gap7 = new javax.swing.JSeparator();
        code_input6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        gap11 = new javax.swing.JSeparator();
        biaya_pengiriman_field = new javax.swing.JTextField();
        gap12 = new javax.swing.JSeparator();
        code_input2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        gap4 = new javax.swing.JSeparator();
        tanggal_pengiriman_field = new com.toedter.calendar.JDateChooser();
        gap8 = new javax.swing.JSeparator();
        code_input3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        gap5 = new javax.swing.JSeparator();
        jenis_pengiriman_field = new javax.swing.JComboBox<>();
        gap9 = new javax.swing.JSeparator();
        code_input4 = new javax.swing.JPanel();
        add_btn = new javax.swing.JButton();
        gap14 = new javax.swing.JSeparator();
        code_input7 = new javax.swing.JPanel();
        delete_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        gap1.setMaximumSize(new java.awt.Dimension(32767, 100));
        gap1.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(gap1);

        title_container.setMaximumSize(new java.awt.Dimension(32767, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 173, 181));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UBAH DATA PENGIRIMAN");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title_container.add(jLabel1);

        jPanel1.add(title_container);

        code_input.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input.setLayout(new javax.swing.BoxLayout(code_input, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Kode Pemesanan");
        code_input.add(jLabel3);

        gap2.setPreferredSize(new java.awt.Dimension(50, 20));
        gap2.setRequestFocusEnabled(false);
        code_input.add(gap2);

        kode_pemesanan_field.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        kode_pemesanan_field.setMinimumSize(new java.awt.Dimension(300, 24));
        kode_pemesanan_field.setPreferredSize(new java.awt.Dimension(300, 20));
        kode_pemesanan_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_pemesanan_fieldActionPerformed(evt);
            }
        });
        code_input.add(kode_pemesanan_field);

        jPanel1.add(code_input);

        gap6.setMaximumSize(new java.awt.Dimension(32767, 30));
        gap6.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(gap6);

        code_input5.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input5.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input5.setLayout(new javax.swing.BoxLayout(code_input5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Pelanggan");
        code_input5.add(jLabel8);

        gap10.setPreferredSize(new java.awt.Dimension(50, 20));
        gap10.setRequestFocusEnabled(false);
        code_input5.add(gap10);

        pelanggan_field.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        pelanggan_field.setMinimumSize(new java.awt.Dimension(300, 24));
        pelanggan_field.setPreferredSize(new java.awt.Dimension(300, 20));
        pelanggan_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelanggan_fieldActionPerformed(evt);
            }
        });
        code_input5.add(pelanggan_field);

        jPanel1.add(code_input5);

        gap13.setMaximumSize(new java.awt.Dimension(32767, 30));
        gap13.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(gap13);

        code_input1.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input1.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input1.setLayout(new javax.swing.BoxLayout(code_input1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Jenis Produk");
        code_input1.add(jLabel7);

        gap3.setPreferredSize(new java.awt.Dimension(50, 20));
        gap3.setRequestFocusEnabled(false);
        code_input1.add(gap3);

        jenis_produk_field.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        jenis_produk_field.setMinimumSize(new java.awt.Dimension(300, 24));
        jenis_produk_field.setPreferredSize(new java.awt.Dimension(300, 20));
        jenis_produk_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_produk_fieldActionPerformed(evt);
            }
        });
        code_input1.add(jenis_produk_field);

        jPanel1.add(code_input1);

        gap7.setMaximumSize(new java.awt.Dimension(32767, 30));
        gap7.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(gap7);

        code_input6.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input6.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input6.setLayout(new javax.swing.BoxLayout(code_input6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Biaya Kirim");
        code_input6.add(jLabel11);

        gap11.setPreferredSize(new java.awt.Dimension(50, 20));
        gap11.setRequestFocusEnabled(false);
        code_input6.add(gap11);

        biaya_pengiriman_field.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        biaya_pengiriman_field.setMinimumSize(new java.awt.Dimension(300, 24));
        biaya_pengiriman_field.setPreferredSize(new java.awt.Dimension(300, 20));
        biaya_pengiriman_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biaya_pengiriman_fieldActionPerformed(evt);
            }
        });
        code_input6.add(biaya_pengiriman_field);

        jPanel1.add(code_input6);

        gap12.setMaximumSize(new java.awt.Dimension(32767, 30));
        gap12.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(gap12);

        code_input2.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input2.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input2.setLayout(new javax.swing.BoxLayout(code_input2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Tanggal Pengiriman");
        code_input2.add(jLabel10);

        gap4.setPreferredSize(new java.awt.Dimension(50, 20));
        gap4.setRequestFocusEnabled(false);
        code_input2.add(gap4);

        tanggal_pengiriman_field.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        tanggal_pengiriman_field.setMinimumSize(new java.awt.Dimension(300, 24));
        tanggal_pengiriman_field.setPreferredSize(new java.awt.Dimension(300, 24));
        code_input2.add(tanggal_pengiriman_field);

        jPanel1.add(code_input2);

        gap8.setMaximumSize(new java.awt.Dimension(32767, 30));
        gap8.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(gap8);

        code_input3.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input3.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input3.setLayout(new javax.swing.BoxLayout(code_input3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Jasa Kirim");
        code_input3.add(jLabel9);

        gap5.setPreferredSize(new java.awt.Dimension(50, 20));
        gap5.setRequestFocusEnabled(false);
        code_input3.add(gap5);

        jenis_pengiriman_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Same Day", "Cepat", "Reguler", "Kargo" }));
        jenis_pengiriman_field.setLightWeightPopupEnabled(false);
        jenis_pengiriman_field.setMaximumSize(new java.awt.Dimension(300, 32767));
        jenis_pengiriman_field.setPreferredSize(new java.awt.Dimension(300, 24));
        jenis_pengiriman_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_pengiriman_fieldActionPerformed(evt);
            }
        });
        code_input3.add(jenis_pengiriman_field);

        jPanel1.add(code_input3);

        gap9.setMaximumSize(new java.awt.Dimension(32767, 30));
        gap9.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(gap9);

        code_input4.setMaximumSize(new java.awt.Dimension(600, 40));
        code_input4.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input4.setLayout(new java.awt.CardLayout());

        add_btn.setBackground(new java.awt.Color(0, 173, 181));
        add_btn.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("UBAH");
        add_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add_btn.setMaximumSize(new java.awt.Dimension(200, 50));
        add_btn.setPreferredSize(new java.awt.Dimension(100, 24));
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        code_input4.add(add_btn, "card2");

        jPanel1.add(code_input4);

        gap14.setMaximumSize(new java.awt.Dimension(32767, 20));
        gap14.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(gap14);

        code_input7.setMaximumSize(new java.awt.Dimension(600, 40));
        code_input7.setPreferredSize(new java.awt.Dimension(1197, 60));
        code_input7.setLayout(new java.awt.CardLayout());

        delete_btn.setBackground(new java.awt.Color(255, 0, 51));
        delete_btn.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("HAPUS");
        delete_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        delete_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_btn.setMaximumSize(new java.awt.Dimension(200, 50));
        delete_btn.setPreferredSize(new java.awt.Dimension(100, 40));
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        code_input7.add(delete_btn, "card2");

        jPanel1.add(code_input7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kode_pemesanan_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_pemesanan_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_pemesanan_fieldActionPerformed

    private void jenis_produk_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_produk_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenis_produk_fieldActionPerformed

    private void biaya_pengiriman_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biaya_pengiriman_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biaya_pengiriman_fieldActionPerformed

    private void pelanggan_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelanggan_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pelanggan_fieldActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        modifyPengirimanRecord();
        this.parentUI.updateTableModel();
        this.setVisible(false);
    }//GEN-LAST:event_add_btnActionPerformed

    private void jenis_pengiriman_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_pengiriman_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenis_pengiriman_fieldActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        deletePengirimanRecord();
        this.parentUI.updateTableModel();
        this.setVisible(false);
    }//GEN-LAST:event_delete_btnActionPerformed

    private void deletePengirimanRecord(){
        boolean success = DatabaseConnect.deleteItemTable(this.idSelected, "pengiriman", "kode_pemesanan");
        if (success) {
            JOptionPane.showMessageDialog(this, "Record deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete the record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void modifyPengirimanRecord() {
        // Get input data
        String kodePemesanan = kode_pemesanan_field.getText();
        String pelanggan = biaya_pengiriman_field.getText();
        String jenisProduk = jenis_produk_field.getText();
        String biayaKirim = biaya_pengiriman_field.getText();
        String jasaKirim = (String) jenis_pengiriman_field.getSelectedItem();

        // Get the selected date from the JDateChooser
        java.util.Date rawDate = tanggal_pengiriman_field.getDate();
        String tanggalKirim = null;
        if (rawDate != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            tanggalKirim = dateFormat.format(rawDate);
        }

        // Call the database modify function
        boolean success = DatabaseConnect.modifyPengirimanRecord(kodePemesanan, pelanggan, jenisProduk, biayaKirim, jasaKirim, tanggalKirim);

        // Show success or failure message
        if (success) {
            JOptionPane.showMessageDialog(this, "Record updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update the record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // Reset fields if insertion is successful
        if (success) {
            kode_pemesanan_field.setText("");
            biaya_pengiriman_field.setText("");
            jenis_produk_field.setText("");
            biaya_pengiriman_field.setText("");
            tanggal_pengiriman_field.setDate(null); // Clear the date chooser
            jenis_pengiriman_field.setSelectedItem(null);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField biaya_pengiriman_field;
    private javax.swing.JPanel code_input;
    private javax.swing.JPanel code_input1;
    private javax.swing.JPanel code_input2;
    private javax.swing.JPanel code_input3;
    private javax.swing.JPanel code_input4;
    private javax.swing.JPanel code_input5;
    private javax.swing.JPanel code_input6;
    private javax.swing.JPanel code_input7;
    private javax.swing.JButton delete_btn;
    private javax.swing.JSeparator gap1;
    private javax.swing.JSeparator gap10;
    private javax.swing.JSeparator gap11;
    private javax.swing.JSeparator gap12;
    private javax.swing.JSeparator gap13;
    private javax.swing.JSeparator gap14;
    private javax.swing.JSeparator gap2;
    private javax.swing.JSeparator gap3;
    private javax.swing.JSeparator gap4;
    private javax.swing.JSeparator gap5;
    private javax.swing.JSeparator gap6;
    private javax.swing.JSeparator gap7;
    private javax.swing.JSeparator gap8;
    private javax.swing.JSeparator gap9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jenis_pengiriman_field;
    private javax.swing.JTextField jenis_produk_field;
    private javax.swing.JTextField kode_pemesanan_field;
    private javax.swing.JTextField pelanggan_field;
    private com.toedter.calendar.JDateChooser tanggal_pengiriman_field;
    private javax.swing.JPanel title_container;
    // End of variables declaration//GEN-END:variables
}

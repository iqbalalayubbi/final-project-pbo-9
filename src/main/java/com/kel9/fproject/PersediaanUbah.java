/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kel9.fproject;

/**
 *
 * @author x1nx3r
 */
public class PersediaanUbah extends javax.swing.JFrame {

    /**
     * Creates new form PersediaanUbah
     */
    public PersediaanUbah() {
        initComponents();
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
        jLabel10 = new javax.swing.JLabel();
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
        jumlah_pesanan_field = new javax.swing.JTextField();
        gap12 = new javax.swing.JSeparator();
        code_input2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        gap4 = new javax.swing.JSeparator();
        jumlah_pesanan_field1 = new javax.swing.JTextField();
        gap8 = new javax.swing.JSeparator();
        code_input3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        gap5 = new javax.swing.JSeparator();
        tanggal_pemesanan_field = new com.toedter.calendar.JDateChooser();
        gap9 = new javax.swing.JSeparator();
        code_input4 = new javax.swing.JPanel();
        add_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        gap1.setMaximumSize(new java.awt.Dimension(32767, 100));
        gap1.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(gap1);

        title_container.setMaximumSize(new java.awt.Dimension(32767, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 173, 181));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UBAH DATA PERSEDIAAN");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title_container.add(jLabel1);

        jPanel1.add(title_container);

        code_input.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input.setLayout(new javax.swing.BoxLayout(code_input, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID Barang");
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
        gap6.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(gap6);

        code_input5.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input5.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input5.setLayout(new javax.swing.BoxLayout(code_input5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Nama Barang");
        code_input5.add(jLabel10);

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
        gap13.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(gap13);

        code_input1.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input1.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input1.setLayout(new javax.swing.BoxLayout(code_input1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Kategori Barang");
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
        gap7.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(gap7);

        code_input6.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input6.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input6.setLayout(new javax.swing.BoxLayout(code_input6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Lokasi");
        code_input6.add(jLabel11);

        gap11.setPreferredSize(new java.awt.Dimension(50, 20));
        gap11.setRequestFocusEnabled(false);
        code_input6.add(gap11);

        jumlah_pesanan_field.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        jumlah_pesanan_field.setMinimumSize(new java.awt.Dimension(300, 24));
        jumlah_pesanan_field.setPreferredSize(new java.awt.Dimension(300, 20));
        jumlah_pesanan_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_pesanan_fieldActionPerformed(evt);
            }
        });
        code_input6.add(jumlah_pesanan_field);

        jPanel1.add(code_input6);

        gap12.setMaximumSize(new java.awt.Dimension(32767, 30));
        gap12.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(gap12);

        code_input2.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input2.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input2.setLayout(new javax.swing.BoxLayout(code_input2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Jumlah Barang");
        code_input2.add(jLabel8);

        gap4.setPreferredSize(new java.awt.Dimension(50, 20));
        gap4.setRequestFocusEnabled(false);
        code_input2.add(gap4);

        jumlah_pesanan_field1.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        jumlah_pesanan_field1.setMinimumSize(new java.awt.Dimension(300, 24));
        jumlah_pesanan_field1.setPreferredSize(new java.awt.Dimension(300, 20));
        jumlah_pesanan_field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_pesanan_field1ActionPerformed(evt);
            }
        });
        code_input2.add(jumlah_pesanan_field1);

        jPanel1.add(code_input2);

        gap8.setMaximumSize(new java.awt.Dimension(32767, 30));
        gap8.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(gap8);

        code_input3.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input3.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input3.setLayout(new javax.swing.BoxLayout(code_input3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Tanggal EXP");
        code_input3.add(jLabel9);

        gap5.setPreferredSize(new java.awt.Dimension(50, 20));
        gap5.setRequestFocusEnabled(false);
        code_input3.add(gap5);

        tanggal_pemesanan_field.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        tanggal_pemesanan_field.setMinimumSize(new java.awt.Dimension(300, 24));
        tanggal_pemesanan_field.setPreferredSize(new java.awt.Dimension(300, 24));
        code_input3.add(tanggal_pemesanan_field);

        jPanel1.add(code_input3);

        gap9.setMaximumSize(new java.awt.Dimension(32767, 30));
        gap9.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(gap9);

        code_input4.setMaximumSize(new java.awt.Dimension(600, 30));
        code_input4.setPreferredSize(new java.awt.Dimension(1197, 40));
        code_input4.setLayout(new java.awt.CardLayout());

        add_btn.setText("UBAH");
        add_btn.setMaximumSize(new java.awt.Dimension(200, 50));
        add_btn.setPreferredSize(new java.awt.Dimension(100, 24));
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        code_input4.add(add_btn, "card2");

        jPanel1.add(code_input4);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void pelanggan_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelanggan_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pelanggan_fieldActionPerformed

    private void jumlah_pesanan_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_pesanan_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_pesanan_fieldActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // insertPermintaanRecord();
    }//GEN-LAST:event_add_btnActionPerformed

    private void jumlah_pesanan_field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_pesanan_field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_pesanan_field1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersediaanUbah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersediaanUbah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersediaanUbah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersediaanUbah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersediaanUbah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JPanel code_input;
    private javax.swing.JPanel code_input1;
    private javax.swing.JPanel code_input2;
    private javax.swing.JPanel code_input3;
    private javax.swing.JPanel code_input4;
    private javax.swing.JPanel code_input5;
    private javax.swing.JPanel code_input6;
    private javax.swing.JSeparator gap1;
    private javax.swing.JSeparator gap10;
    private javax.swing.JSeparator gap11;
    private javax.swing.JSeparator gap12;
    private javax.swing.JSeparator gap13;
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
    private javax.swing.JTextField jenis_produk_field;
    private javax.swing.JTextField jumlah_pesanan_field;
    private javax.swing.JTextField jumlah_pesanan_field1;
    private javax.swing.JTextField kode_pemesanan_field;
    private javax.swing.JTextField pelanggan_field;
    private com.toedter.calendar.JDateChooser tanggal_pemesanan_field;
    private javax.swing.JPanel title_container;
    // End of variables declaration//GEN-END:variables

    private void insertPermintaanRecord() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

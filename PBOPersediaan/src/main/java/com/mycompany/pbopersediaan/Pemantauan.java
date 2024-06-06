package com.mycompany.pbopersediaan;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MielM
 */
public class Pemantauan {
    private final Persediaan persediaan;

    public Pemantauan(Persediaan persediaan) {
        this.persediaan = persediaan;
    }

    public int cekJumlahBarang(String idBarang) {
        Barang barang = persediaan.getBarangById(idBarang);
        if (barang != null) {
            return barang.getJumlah();
        }
        return 0;
    }

    public void laporanPersediaan() {
        List<Barang> barangList = persediaan.getAllBarang();
        for (Barang barang : barangList) {
            System.out.println("ID: " + barang.getId() + ", Nama: " + barang.getNama() + ", Jumlah: " + barang.getJumlah());
        }
    }
}

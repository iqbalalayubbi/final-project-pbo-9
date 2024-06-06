/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbopersediaan;

/**
 *
 * @author MielM
 */
import java.util.Date;
import java.util.List;

public class Pengingat {
    private final Persediaan persediaan;

    public Pengingat(Persediaan persediaan) {
        this.persediaan = persediaan;
    }

    public String cekMinimumPersediaan(int minimum) {
        List<Barang> barangList = persediaan.getAllBarang();
        StringBuilder laporan = new StringBuilder();
        for (Barang barang : barangList) {
            if (barang.getJumlah() < minimum) {
                laporan.append("Persediaan untuk barang ")
                       .append(barang.getNama())
                       .append(" mendekati batas minimum.\n");
            }
        }
        return laporan.toString();
    }

    public String cekKadaluwarsa() {
        List<Barang> barangList = persediaan.getAllBarang();
        Date sekarang = new Date();
        StringBuilder laporan = new StringBuilder();
        for (Barang barang : barangList) {
            if (barang.getTanggalExp().before(sekarang)) {
                laporan.append("Barang ")
                       .append(barang.getNama())
                       .append(" telah kedaluwarsa.\n");
            }
        }
        return laporan.toString();
    }
}


package com.mycompany.pbopersediaan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MielM
 */
import java.util.Date;

public class Barang {
    private final String id;
    private final String nama;
    private final String kategori;
    private final String lokasi;
    private final Date tanggalexp;
    private int jumlah;

    /**
     *
     * @param id
     * @param nama
     * @param kategori
     * @param lokasi
     * @param tanggalexp
     * @param jumlah
     */
    public Barang(String id, String nama, String kategori, String lokasi, Date tanggalexp, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.lokasi = lokasi;
        this.tanggalexp = tanggalexp;
        this.jumlah = jumlah;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public String getLokasi() {
        return lokasi;
    }

    public Date getTanggalExp() {
        return tanggalexp;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}


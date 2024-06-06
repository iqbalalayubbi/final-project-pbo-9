package com.mycompany.pbopersediaan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MielM
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Persediaan {
    private final List<Barang> barangList;

    public Persediaan() {
        this.barangList = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        barangList.add(barang);
    }

    public void hapusBarang(String idBarang) {
        barangList.removeIf(barang -> barang.getId().equals(idBarang));
    }

    public Barang getBarangById(String idBarang) {
        for (Barang barang : barangList) {
            if (barang.getId().equals(idBarang)) {
                return barang;
            }
        }
        return null;
    }

    public List<Barang> getBarangByKategori(String kategori) {
        List<Barang> result = new ArrayList<>();
        for (Barang barang : barangList) {
            if (barang.getKategori().equals(kategori)) {
                result.add(barang);
            }
        }
        return result;
    }

    public List<Barang> getBarangByLokasi(String lokasi) {
        List<Barang> result = new ArrayList<>();
        for (Barang barang : barangList) {
            if (barang.getLokasi().equals(lokasi)) {
                result.add(barang);
            }
        }
        return result;
    }

    public List<Barang> getBarangByTanggalExp(Date tanggal) {
        List<Barang> result = new ArrayList<>();
        for (Barang barang : barangList) {
            if (barang.getTanggalExp().before(tanggal)) {
                result.add(barang);
            }
        }
        return result;
    }

    public List<Barang> getAllBarang() {
        return new ArrayList<>(barangList);
    }
}


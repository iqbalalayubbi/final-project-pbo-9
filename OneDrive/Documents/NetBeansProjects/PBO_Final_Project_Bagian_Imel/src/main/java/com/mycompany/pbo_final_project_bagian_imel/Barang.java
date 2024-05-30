/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_final_project_bagian_imel;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Imel Amalia
 */
public class Barang {
    private String id;
    private String nama;
    private String kategori;
    private String lokasi;
    private Date tanggalexp;
    private int jumlah;
    
    public Barang(String id, String nama, String kategori, String lokasi, Date tanggalexp, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.lokasi = lokasi;
        this.tanggalexp = tanggalexp;
        this.jumlah = jumlah;
    }
    
    public String getid(){
        return id;
    }
    
     public String getnama(){
        return nama;
    }
    
    public String getkategori(){
        return kategori;
    }
    
    public String getlokasi(){
        return lokasi;
    }
    
    public Date gettanggalexp(){
        return tanggalexp;
    }
    
    public int getjumlah(){
        return jumlah;
    }
    
    public void setjumlah(int jumlah){
        this.jumlah = jumlah;
    }
}

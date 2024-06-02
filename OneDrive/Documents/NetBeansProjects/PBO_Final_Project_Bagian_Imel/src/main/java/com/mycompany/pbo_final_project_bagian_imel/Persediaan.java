/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_final_project_bagian_imel;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MielM
 */
public class Persediaan {
    private List<Barang> barangList;
    
    public Persediaan(){
        this.barangList = new ArrayList <>();
    }
     public void tambahBarang(Barang barang) {
         barangList.add(barang);
     }
    
     public void hapusBarang (String idBarang) {
         barangList.removeIf(barang -> barang.getid().equals(idBarang));
     }
     
     public Barang getBarangById(String idBarang){
         for (Barang barang : barangList) {
             if (barang.getid().equals(idBarang)) {
                 return barang;
             }
         }
         return null;
     }
     
     public List<Barang> getBarangByKategori(String kategori) {
         List<Barang> result = new ArrayList<>();
         for (Barang barang : barangList) {
             if (barang.getkategori().equals(kategori)) {
                 result.add(barang);
             }      
         }
         return result;
     }
     
     public List<Barang> getBarangByLokasi(String lokasi) {
         List<Barang> result = new ArrayList<>();
         for (Barang barang : barangList) {
             if (barang.getlokasi().equals(lokasi)) {
                 result.add(barang);
             }
         }
         return result;
     }
     
     public List<Barang> getBarangByTanggalEXP(Date tanggalexp) {
         List<Barang> result = new ArrayList<>();
         for (Barang barang : barangList) {
             if (barang.gettanggalexp().before(tanggalexp)) {
                 result.add(barang);
             }
         }
         return result;
     }
     
     public List<Barang> getAllBarang() {
         return new ArrayList<>(barangList);
     }
}
     


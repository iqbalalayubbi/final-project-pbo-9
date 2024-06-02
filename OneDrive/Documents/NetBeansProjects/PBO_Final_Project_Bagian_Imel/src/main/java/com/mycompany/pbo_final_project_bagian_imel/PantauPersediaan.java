/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_final_project_bagian_imel;

import java.util.List;

/**
 *
 * @author MielM
 */
public class PantauPersediaan {
    private Persediaan persediaan;
    
    public PantauPersediaan(Persediaan persediaan) {
        this.persediaan = persediaan;
    }
    
    public int cekJumlahBarang(String idBarang) {
        Barang barang = persediaan.getBarangById(idBarang);
        if(barang != null) {
            return barang.getjumlah();
        }
        return 0;
    }
    
    public void laporPersediaan(){
        List<Barang> barangList = persediaan.getAllBarang();
        for (Barang barang : barangList) {
            System.out.println(barang.getjumlah() + "Id:" + barang.getid() + ", Nama:" + barang.getnama());
        }           
    }
}

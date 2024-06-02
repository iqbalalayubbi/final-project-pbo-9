/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_final_project_bagian_imel;

import java.util.Date;
import java.util.List;

/**
 *
 * @author MielM
 */
public class ReminderPersediaan {
    private Persediaan persediaan;
    
    public ReminderPersediaan(Persediaan persediaan) {
        this.persediaan = persediaan;
    }
public void CekMinPersediaan(int minimum) {
    List<Barang> barangList = persediaan.getAllBarang();
    for (Barang barang : barangList) {
        if (barang.getjumlah() < minimum) {
            kirimPeringatan("Persediaan barang " + barang.getnama() + "mendekati batas minimum.");
            
        }
    }       
}

public void cekEXP() {
    List<Barang> barangList = persediaan.getAllBarang();
    Date sekarang = new Date();
    for (Barang barang : barangList) {
        if (barang.gettanggalexp().before(sekarang)) {
            kirimPeringatan("Barang " + barang.getnama() + " telah expired.");
        }
    }
}

private void kirimPeringatan(String pesan) {
    System.out.println("Peringatan: " + pesan);
}
}

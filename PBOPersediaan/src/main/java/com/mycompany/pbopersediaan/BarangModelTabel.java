/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbopersediaan;

/**
 *
 * @author MielM
 */
import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.List;

public class BarangModelTabel extends AbstractTableModel {
    private final List<Barang> barangList;
    private final String[] columnNames = {"ID", "Nama", "Kategori", "Lokasi", "EXP Date", "Jumlah"};
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     *
     * @param barangList
     */
    public BarangModelTabel(List<Barang> barangList) {
        this.barangList = barangList;
    }

    @Override
    public int getRowCount() {
        return barangList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Barang barang = barangList.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> barang.getId();
            case 1 -> barang.getNama();
            case 2 -> barang.getKategori();
            case 3 -> barang.getLokasi();
            case 4 -> dateFormat.format(barang.getTanggalExp());
            case 5 -> barang.getJumlah();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_penghuni;

/**
 *
 * @author dwiar
 */
public class tm_penghuni extends AbstractTableModel {
    private List<model_penghuni> list = new ArrayList<>();
    
    public void tambahData(model_penghuni modpeng) {
        list.add(modpeng);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, model_penghuni modpeng) {
        list.add(row, modpeng);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data berhasil diperbarui");
    }
    
    public void hapusData(int index) {
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
    }
    
    public void clear() {
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<model_penghuni> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_penghuni modpeng) {
        list.set(index, modpeng);
        fireTableRowsUpdated(index, index);
    }
    
    public model_penghuni getData(int index) {
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId_penghuni();    
            case 1:
                return list.get(rowIndex).getNama();    
            case 2:
                return list.get(rowIndex).getNik();    
            case 3:
                return list.get(rowIndex).getKamar().getId_kamar();
            case 4:
                return list.get(rowIndex).getKamar().getStatus();
            case 5:
                return list.get(rowIndex).getTgl_masuk();
            case 6:
                return list.get(rowIndex).getTgl_keluar();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id Kamar";
            case 1:
                return "Jenis";
            case 2:
                return "Harga";
            case 3:
                return "Status";
            default:
                return null;
        }
    }
}

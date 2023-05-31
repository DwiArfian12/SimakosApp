/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_kamar;

/**
 *
 * @author dwiar
 */
public class tm_kamar extends AbstractTableModel {

    private List<model_kamar> list = new ArrayList<>();
    
    public void tambahData(model_kamar modkam) {
        list.add(modkam);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
    }
    
    public void perbaruiData(int row, model_kamar modkam) {
        list.add(row, modkam);
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
    
    public void setData(List<model_kamar> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_kamar modkam) {
        list.set(index, modkam);
        fireTableRowsUpdated(index, index);
    }
    
    public model_kamar getData(int index) {
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId_kamar();    
            case 1:
                return list.get(rowIndex).getJenis();    
            case 2:
                return list.get(rowIndex).getHarga();    
            case 3:
                return list.get(rowIndex).getStatus();
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

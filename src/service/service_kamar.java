/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import model.model_kamar;
import java.util.*;

/**
 *
 * @author dwiar
 */
public interface service_kamar {    
    void tambahData (model_kamar mokam);
    void perbaruiData (model_kamar mokam);
    void hapusData (model_kamar mokam);
    
    model_kamar getById(int id);
    
    List<model_kamar> ambilData();
    
    List<model_kamar> pencarian(int id);
    
    String nomor();
}

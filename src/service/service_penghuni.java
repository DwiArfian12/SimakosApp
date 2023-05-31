/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_penghuni;

/**
 *
 * @author dwiar
 */
public interface service_penghuni {
    void tambahData (model_penghuni mopeng);
    void perbaruiData (model_penghuni mopeng);
    void hapusData (model_penghuni mopeng);
    
    model_penghuni getById(int id);
    
    List<model_penghuni> ambilData();
    
    List<model_penghuni> pencarian(int id);

    String nomor();

}

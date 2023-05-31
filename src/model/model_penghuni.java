/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author dwiar
 */
public class model_penghuni {
    private int id_penghuni;
    private String nama;
    private String nik;
    private model_kamar kamar;
    private Date tgl_masuk;
    private Date tgl_keluar;
    
    public int getId_penghuni() {
        return id_penghuni;
    }

    public void setId_penghuni(int id_penghuni) {
        this.id_penghuni = id_penghuni;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public model_kamar getKamar() {
        return kamar;
    }

    public void setKamar(model_kamar kamar) {
        this.kamar = kamar;
    }

    public Date getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(Date tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public Date getTgl_keluar() {
        return tgl_keluar;
    }

    public void setTgl_keluar(Date tgl_keluar) {
        this.tgl_keluar = tgl_keluar;
    }
}

package com.example.daftarmakanan;

public class FoodDetailsItem {
    String judul;
    String deskripsi;
    String gambar;

    public FoodDetailsItem(String judul, String deskripsi, String gambar) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getGambar() {
        return gambar;
    }
}

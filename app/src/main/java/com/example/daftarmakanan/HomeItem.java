package com.example.daftarmakanan;

public class HomeItem {
    private String judul;
    private String gambar;

    public HomeItem(String judul, String gambar) {
        this.judul = judul;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public String getGambar() {
        return gambar;
    }
}

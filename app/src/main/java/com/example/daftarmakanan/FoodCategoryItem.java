package com.example.daftarmakanan;

public class FoodCategoryItem {
    String id;
    String judul;
    String gambar;

    public FoodCategoryItem(String id, String judul, String gambar) {
        this.id = id;
        this.judul = judul;
        this.gambar = gambar;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getGambar() {
        return gambar;
    }
}

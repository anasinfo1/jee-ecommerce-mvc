package com.ecom.ecomv2.beans;

public class Article {
    private int codeArticle;
    private String designation;
    private double prix;
    private int stock;
    private int categorie;
    private String photo;
    public Article(String designation, double prix, int stock, int categorie, String photo) {
        this.designation = designation;
        this.prix = prix;
        this.stock = stock;
        this.categorie = categorie;
        this.photo = photo;
    }
    public int getCodeArticle() {
        return codeArticle;
    }
    public void setCodeArticle(int codeArticle) {
        this.codeArticle = codeArticle;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getCategorie() {
        return categorie;
    }
    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Article{" +
                "codeArticle=" + codeArticle +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                ", stock=" + stock +
                ", categorie=" + categorie +
                ", photo='" + photo + '\'' +
                '}';
    }
}


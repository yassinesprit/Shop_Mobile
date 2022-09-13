/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.entities;

/**
 *
 * @author SBS
 */
public class Panier {

    private int id_prod;
    private String title;
    private float prix;
    private int quantite;
    private int quantiteProd;
    private float total;

    public Panier() {
    }

    public int getQuantiteProd() {
        return quantiteProd;
    }

    public void setQuantiteProd(int quantiteProd) {
        this.quantiteProd = quantiteProd;
    }
    
    
    public Panier(int id_prod,String title,float prix, int quantite, float total) {
        this.id_prod = id_prod;
        this.title = title;
        this.prix = prix;
        this.quantite = quantite;
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Panier{" + "id_prod=" + id_prod + ", quantite=" + quantite + ", total=" + total + '}';
    }

        
        
    
}

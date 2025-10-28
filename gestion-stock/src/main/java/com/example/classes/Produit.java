package com.example.classes;

import com.example.classes.Categorie;

import javax.persistence.*;


@Entity
@NamedQuery(name = "Produit.findByPrixSup100",
        query = "FROM Produit p WHERE p.prix > 100")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String reference;
    private double prix;

    @ManyToOne
    private Categorie categorie;

    public Produit() {}
    public Produit(String reference, double prix, Categorie categorie) {
        this.reference = reference;
        this.prix = prix;
        this.categorie = categorie;
    }

    public int getId() { return id; }
    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }
    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
    public Categorie getCategorie() { return categorie; }
    public void setCategorie(Categorie categorie) { this.categorie = categorie; }
}


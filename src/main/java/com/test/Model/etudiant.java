/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Model;

/**
 *
 * @author MOY
 */
public class etudiant {
 int CNE  ;
    String nom ,prenom,filiere,departement,telephone;

    public etudiant() {
    }

    public etudiant(int CNE, String nom, String prenom, String filiere, String departement, String telephone) {
        this.CNE = CNE;
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
        this.departement = departement;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "etudiant{" + "CNE=" + CNE + ", nom=" + nom + ", prenom=" + prenom + ", filiere=" + filiere + ", departement=" + departement + ", telephone=" + telephone + '}';
    }

    public int getCNE() {
        return CNE;
    }

    public void setCNE(int CNE) {
        this.CNE = CNE;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}

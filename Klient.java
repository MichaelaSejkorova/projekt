/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

// Třída Klient představuje klienta, který má pojištění.
public class Klient {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int kontakt;

    public Klient(String jmeno, String prijmeni, int vek, int kontakt) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.kontakt = kontakt;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public int getKontakt() {
        return kontakt;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " (vek: " + vek + ", kontakt: " + kontakt + ")";
    }
}
    


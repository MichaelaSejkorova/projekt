/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

import java.util.ArrayList;
import java.util.List;

// Třída Database představuje databázi klientů s pojištěním.
public class Databaze {
    private List<Klient> pojisteni;

    public Databaze() {
        pojisteni = new ArrayList<>();
    }

    public void pridejKlienta(Klient klient) {
        pojisteni.add(klient);
    }
    
    public void vypisSeznamKlientu() {
        if (pojisteni.isEmpty()) {
            System.out.println("Seznam pojištěných je prázdný.");
        } else {
            System.out.println("Seznam pojištěných:");
            for (Klient klient : pojisteni) {
                System.out.println(" " + klient.toString());
            }
        }
    }

    public Klient najdiKlienta(String jmeno, String prijmeni) {
        for (Klient k : pojisteni) {
            if (k.getJmeno().equals(jmeno) && k.getPrijmeni().equals(prijmeni)) {
                
                return k;
            }
        }
    return null;
    }
}


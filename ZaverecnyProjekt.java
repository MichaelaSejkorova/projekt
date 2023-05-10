/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cz.itnetwork.zaverecnyprojekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Třída pro evidenci klientů v pojišťovně
 */
public class ZaverecnyProjekt {

    public static void main(String[] args) {

        List<Klient> seznamKlientu = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Databaze databaze = new Databaze(); // instance třídy Databaze pro uložení klientů
        String vstupUzivatele = "";

        while (!vstupUzivatele.equals("4")) { // cyklus pro opakované zadávání akcí, dokud uživatel nezvolí "Konec"
            System.out.println("EVIDENCE POJIŠTĚNÍ");
            System.out.println("------------------");
            System.out.println("Vyberte číslo pro akci:");
            System.out.println("1. Přidat klienta");
            System.out.println("2. Zobraz seznam klientů");
            System.out.println("3. Najít klienta");
            System.out.println("4. Konec");

            vstupUzivatele = sc.nextLine();

            switch (vstupUzivatele) {
                case "1" -> {
                    System.out.println("Zadejte jméno: ");
                    String jmeno = sc.nextLine();
                    System.out.println("Zadejte příjmení: ");
                    String prijmeni = sc.nextLine();
                    System.out.println("Zadejte věk: ");
                    int vek = Integer.parseInt(sc.nextLine());
                    System.out.println("Zadejte telefonní číslo: ");
                    int kontakt = Integer.parseInt(sc.nextLine());

                    Klient klient = new Klient(jmeno, prijmeni, vek, kontakt); // vytvoření instance klienta

                    databaze.pridejKlienta(klient); // přidání klienta do databáze
                    System.out.println("Klient byl vytvořen.");
                }
                case "2" -> {
                    databaze.vypisSeznamKlientu(); // výpis seznamu klientů uložených v databázi              
                }
                case "3" -> {
                    System.out.println("Zadejte jméno a příjmení klienta (s mezerou): ");

                    String jmenoAPrijmeni = sc.nextLine();
                    String[] jmenoPrijmeni = jmenoAPrijmeni.split(" ");

                    String hledaneJmeno = jmenoPrijmeni[0];
                    String hledanePrijmeni = jmenoPrijmeni[1];

                    Klient nalezenyKlient = databaze.najdiKlienta(hledaneJmeno, hledanePrijmeni); // vyhledání klienta v databázi podle jména a příjmení

                    if (nalezenyKlient != null) {
                        System.out.println("Klient nalezen: " + nalezenyKlient.toString());
                    } else {
                        System.out.println("Klient nenalezen.");
                    }

                }
                case "4" -> {
                    System.out.println("Konec");
                }
                default -> {
                    System.out.println("Neplatná volba.");
                }
            }
        }
    }
}

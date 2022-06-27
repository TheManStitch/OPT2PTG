package Model;

import Model.Abstraction.AbstractGebruiker;
import Model.Persoon.Gebruiker;

import java.util.ArrayList;

public class Organisatie {

    public static ArrayList<Gebruiker> AlleGebruikers = new ArrayList<>();

    public static AbstractGebruiker[] AlleGebruikers() {
    }

    public ArrayList<Gebruiker> GetAlleGebruikers(){
        return AlleGebruikers;
    }
    //public Gebruiker(String naam){
        //this.naam = naam;

        // Gebruiker Gebruiker4 = new Gebruiker("Karel L The Genius");
        // Gebruiker Gebruiker3 = new Gebruiker("Adam 3ezi");
        // Gebruiker Gebruiker2 = new Gebruiker("Emre Liqui Soldaat");
        // Gebruiker Gebruiker1 = new Gebruiker("Siddhart Parbo");
        // lijstGebruikers.add(Gebruiker4);
        // lijstGebruikers.add(Gebruiker3);
        // lijstGebruikers.add(Gebruiker2);
        //lijstGebruikers.add(Gebruiker1);

    }



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
}


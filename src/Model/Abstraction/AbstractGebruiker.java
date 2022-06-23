package Model.Abstraction;

import java.util.ArrayList;

public abstract class AbstractGebruiker {
    private String naam;
    private String email;
    private String wachtwoord;

    public AbstractGebruiker(String naam, String email, String wachtwoord){
        this.naam = naam;
        this.email = email;
        this.wachtwoord = wachtwoord;
    }
    public String GetNaam(){
        return naam;
    }

    public String GetEmail(){
        return email;
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
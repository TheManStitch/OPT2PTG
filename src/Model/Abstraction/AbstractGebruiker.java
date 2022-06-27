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











}
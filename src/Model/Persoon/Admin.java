package Model.Persoon;

import Model.Abstraction.AbstractGebruiker;
import Model.Organisatie;

public class Admin extends AbstractGebruiker {

    public Admin(String naam, String email, String wachtwoord) {
        super(naam, email, wachtwoord);
    }

    public void addGebruiker(String name, String email, String wachtwoord) {

    }


    public void verwijderGebruiker(String email) {
        for (AbstractGebruiker Gebruiker : Organisatie.AlleGebruikers()) {
            if (Gebruiker.GetEmail().equalsIgnoreCase(email)) {
                Gebruiker.remove(Gebruiker);//verwijderen uit organisation allegebruikers
            }
        }
    }
}
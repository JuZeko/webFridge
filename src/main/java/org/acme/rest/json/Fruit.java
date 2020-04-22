package org.acme.rest.json;

public class Fruit {

    public String pavadinimas;
    public String Galiojimas;
    public int kiekis;

    public Fruit() {
    }

    public Fruit(String pavadinimas, String Galiojimas, Integer kiekis) {
        this.pavadinimas = pavadinimas;
        this.Galiojimas = Galiojimas;
        this.kiekis = kiekis;
    }
}

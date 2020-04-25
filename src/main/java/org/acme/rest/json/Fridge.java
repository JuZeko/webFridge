package org.acme.rest.json;

public class Fridge {

    public String pavadinimas;
    public String Galiojimas;
    public int kiekis;

    public Fridge() {
    }

    public Fridge(String pavadinimas, String Galiojimas, Integer kiekis) {
        this.pavadinimas = pavadinimas;
        this.Galiojimas = Galiojimas;
        this.kiekis = kiekis;
    }

	public int length() {
		return 0;
	}
}

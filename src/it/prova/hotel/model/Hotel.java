package it.prova.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String ragioneSociale;
    private int stelle;
    private List<Stanza> stanze = new ArrayList<>();

    public Hotel(String ragioneSociale, int stelle) {
        this.ragioneSociale = ragioneSociale;
        this.stelle = stelle;
    }

    public Hotel() {
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public int getStelle() {
        return stelle;
    }

    public void setStelle(int stelle) {
        this.stelle = stelle;
    }

    public float calcolaConto(Stanza input) {
        if (input == null) return -1;
        float sommaTotaleDaPagare = 0;
        for (Cliente cliente: input.getClienti()) {
            if (!cliente.stanza.equals(input) || cliente.stanza == null) return -1;
            sommaTotaleDaPagare += cliente.sommaRealeDaPagare();
        }
        return sommaTotaleDaPagare;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "ragioneSociale='" + ragioneSociale + '\'' +
                ", stelle=" + stelle +
                ", stanze=" + stanze +
                '}';
    }
}

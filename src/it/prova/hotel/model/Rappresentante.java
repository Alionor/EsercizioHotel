package it.prova.hotel.model;

public class Rappresentante extends Cliente {

    public Rappresentante(String nome, String cognome, Stanza stanza) {
        super(nome, cognome, stanza);
    }

    public Rappresentante() {
    }

    /** Restituisce quanto deve pagare il Rappresentante per una stanza: il 20% in meno del prezzo totale **/
    @Override
    public float sommaRealeDaPagare() {
        float totaleDaPagare = stanza.getQuantoAPersona() - (stanza.getQuantoAPersona() * 20 / 100);
        return totaleDaPagare;
    }

}

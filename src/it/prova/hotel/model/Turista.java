package it.prova.hotel.model;

public class Turista extends Cliente {

    public Turista(String nome, String cognome, Stanza stanza) {
        super(nome, cognome, stanza);
    }

    public Turista() {
    }

    /**Restituisce l'importo totale da pagare a persona per una stanza.**/
    @Override
    public float sommaRealeDaPagare() {
        return stanza.getQuantoAPersona();
    }

}

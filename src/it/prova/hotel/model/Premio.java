package it.prova.hotel.model;

public class Premio extends Cliente {

    public Premio(String nome, String cognome, Stanza stanza) {
        super(nome, cognome, stanza);
    }

    public Premio() {
    }

    /**Restituisce "0" perchè per il Cliente Premio la stanza è gratis.**/
    @Override
    public float sommaRealeDaPagare() {
        return 0;
    }

}

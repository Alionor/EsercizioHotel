package it.prova.hotel.model;

public class Premio extends Cliente {

    /**Restituisce "0" perchè per il Cliente Premio la stanza è gratis.**/
    @Override
    public float sommaRealeDaPagare() {
        return 0;
    }

}

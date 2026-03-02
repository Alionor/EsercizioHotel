package it.prova.hotel.model;

public class Turista extends Cliente {

    /**Restituisce l'importo totale da pagare a persona per una stanza.**/
    @Override
    public float sommaRealeDaPagare() {
        return stanza.getQuantoAPersona();
    }

}

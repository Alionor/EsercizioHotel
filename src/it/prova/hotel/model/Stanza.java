package it.prova.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Stanza {

    private String numeroStanza;
    private float quantoAPersona;
    private Hotel hotel;
    private List<Cliente> clienti = new ArrayList<>();

    public Stanza(String numeroStanza, float quantoAPersona, Hotel hotel, List<Cliente> clienti) {
        this.numeroStanza = numeroStanza;
        this.quantoAPersona = quantoAPersona;
        this.hotel = hotel;
        this.clienti = clienti;
    }

    public Stanza() {
    }

    public String getNumeroStanza() {
        return numeroStanza;
    }

    public void setNumeroStanza(String numeroStanza) {
        this.numeroStanza = numeroStanza;
    }

    public float getQuantoAPersona() {
        return quantoAPersona;
    }

    public void setQuantoAPersona(float quantoAPersona) {
        this.quantoAPersona = quantoAPersona;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Cliente> getClienti() {
        return clienti;
    }

    public void setClienti(List<Cliente> clienti) {
        this.clienti = clienti;
    }

    @Override
    public String toString() {
        return "Stanza{" +
                "numeroStanza='" + numeroStanza + '\'' +
                ", quantoAPersona=" + quantoAPersona +
                ", hotel=" + hotel +
                '}';
    }
}

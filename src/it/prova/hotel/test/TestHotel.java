package it.prova.hotel.test;
import it.prova.hotel.model.*;

import java.util.*;

public class TestHotel {

        public static void main(String[] args) {

            //INIZIALIZZAZIONI
            Hotel hotel1 = new Hotel("Hotel Paradiso", 4);
            Hotel hotel2 = new Hotel("Hotel Paradiso", 4);
            Hotel hotel3 = new Hotel("Hotel Paradiso", 4);

            List<Cliente> clientiStanza1 = new ArrayList<>();
            List<Cliente> clientiStanza2 = new ArrayList<>();
            List<Cliente> clientiStanza3 = new ArrayList<>();


            Stanza stanza1 = new Stanza("101", 200, hotel1, clientiStanza1);
            Stanza stanza2 = new Stanza("102", 39, hotel2, clientiStanza2);
            Stanza stanza3 = new Stanza("201", 110, hotel3, clientiStanza3);

            clientiStanza1.add(new Turista("Gianfranco", "Polline", stanza1));
            clientiStanza1.add(new Rappresentante("Gianfranco", "Polline", stanza1));

            clientiStanza2.add(new Premio("Gianfranco", "Polline", stanza2));
            clientiStanza2.add(new Turista("Gianfranco", "Polline", stanza2));
            clientiStanza2.add(new Rappresentante("Gianfranco", "Polline", stanza2));

            clientiStanza3.add(new Turista("Gianfranco", "Polline", stanza3));
            clientiStanza3.add(new Premio("Gianfranco", "Polline", stanza3));
            clientiStanza3.add(new Turista("Gianfranco", "Polline", stanza3));
            clientiStanza3.add(new Turista("Gianfranco", "Polline", stanza3));


            //TEST
            System.out.println(hotel1.calcolaConto(stanza1));
            System.out.println(hotel2.calcolaConto(stanza2));
            System.out.println(hotel3.calcolaConto(stanza3));


            //Domanda sulla dipendenza circolare tra stanza e clienti e come evitarla.

    }
}

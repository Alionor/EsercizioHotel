package it.prova.hotel.model;

public abstract class Cliente {

    protected String nome;
    protected String cognome;
    protected Stanza stanza;

    public Cliente(String nome, String cognome, Stanza stanza) {
        this.nome = nome;
        this.cognome = cognome;
        this.stanza = stanza;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Stanza getStanza() {
        return stanza;
    }

    public void setStanza(Stanza stanza) {
        this.stanza = stanza;
    }

    public abstract float sommaRealeDaPagare();

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", stanza=" + stanza +
                '}';
    }
}

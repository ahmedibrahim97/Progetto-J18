package model;

public class Cliente {


    private String username;
    private String password;

    private String indirizzo;
    private String email;
    private String nome;
    private String cognome;
    private String sesso;
    private String dataNascita;


    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }



    public String getIndirizzo() { return indirizzo; }

    public void setIndirizzo(String indirizzo) { this.indirizzo = indirizzo; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getCognome() { return cognome; }

    public void setCognome(String cognome) { this.cognome = cognome; }

    public String getSesso() { return sesso; }

    public void setSesso(String sesso) { this.sesso = sesso; }
    public String getDataNascita() { return dataNascita; }

    public void setDataNascita(String dataNascita) { this.dataNascita = dataNascita; }
}
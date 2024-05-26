package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class RegistraceForm {

    @NotBlank(message = "povinný údaj")
    private String jmeno;

    @NotBlank(message = "povinný údaj")
    private String prijmeni;

    @NotNull(message = "povinný údaj")
    private LocalDate datumNarozeni;

    @NotNull(message = "zvolte - povinný údaj")
    private String pohlavi;

    @NotNull(message = "vyberte turnus")
    private Turnus turnus;

    private String email;

    private String telefon;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(String pohlavi) {
        this.pohlavi = pohlavi;
    }

    public Turnus getTurnus() {
        return turnus;
    }

    public String getTurnusDate() {
        return turnus.getTitle();
    }

    public void setTurnus(Turnus turnus) {
        this.turnus = turnus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getFormatovaneDatum() {
        return getDatumNarozeni().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    }

}

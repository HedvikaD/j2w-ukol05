package cz.czechitas.java2webapps.ukol5.controller;

public enum Turnus {
    turnus1 ("od 1. do 15. 7. 2024"),
    turnus2("od 15. do 30. 7. 2024"),
    turnus3("od 1. do 15. 8. 2024");

    private final String title;

    Turnus(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}

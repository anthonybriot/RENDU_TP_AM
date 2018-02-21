package com.example.anthony.anthonybriot_listperso;

/**
 * Created by Anthony on 07/02/2018.
 */
public class Sport {
    private int color;
    private String pseudo;
    private String text;

    public Sport(int color, String pseudo, String text) {
        this.color = color;
        this.pseudo = pseudo;
        this.text = text;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

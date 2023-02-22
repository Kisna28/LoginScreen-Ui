package com.example.constrain_layout.model;

public class Data_Binding {
    String Name,Text,Getst,Syntext;

    public Data_Binding(String name, String text, String getst, String syntext) {
        Name = name;
        Text = text;
        Getst = getst;
        Syntext = syntext;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getGetst() {
        return Getst;
    }

    public void setGetst(String getst) {
        Getst = getst;
    }

    public String getSyntext() {
        return Syntext;
    }

    public void setSyntext(String syntext) {
        Syntext = syntext;
    }
}

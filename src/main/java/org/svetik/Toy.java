package org.svetik;

public class Toy {
    private int toyId;
    private String toyName;
    private int winFrequency;

    public Toy() {

    }

    public Toy(int toyId, String toyName, int winFrequency) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.winFrequency = winFrequency;
    }

    public int getToyId() {
        return toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public int getWinFrequency() {
        return winFrequency;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }


    public void setWinFrequency(int winFrequency) {
        this.winFrequency = winFrequency;
    }
}

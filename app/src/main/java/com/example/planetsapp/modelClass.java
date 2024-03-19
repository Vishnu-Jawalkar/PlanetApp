package com.example.planetsapp;

import java.security.PrivateKey;

public class modelClass {

    private String PlanetName;
    private String countMoon;
    private int PlanetImg;


    //Constructor
    public modelClass(String planetName, String countMoon, int planetImg) {
        this.PlanetName = planetName;
        this.countMoon = countMoon;
        this.PlanetImg = planetImg;
    }

    //Getter
    public String getPlanetName() {
        return PlanetName;
    }

    public String getCountMoon() {
        return countMoon;
    }

    public int getPlanetImg() {
        return PlanetImg;
    }

    //Setter

    public void setPlanetName(String planetName) {
        PlanetName = planetName;
    }

    public void setCountMoon(String countMoon) {
        this.countMoon = countMoon;
    }

    public void setPlanetImg(int planetImg) {
        PlanetImg = planetImg;
    }
}

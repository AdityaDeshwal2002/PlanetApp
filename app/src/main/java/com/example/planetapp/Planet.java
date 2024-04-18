package com.example.planetapp;

import android.widget.ImageView;
import android.widget.TextView;

public class Planet {
    private int planetImage;
    private String planetName , planetMoons;

    public Planet(int planetImage, String planetName, String planetMoons) {
        this.planetImage = planetImage;
        this.planetName = planetName;
        this.planetMoons = planetMoons;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getPlanetMoons() {
        return planetMoons;
    }

    public void setPlanetMoons(String planetMoons) {
        this.planetMoons = planetMoons;
    }
}

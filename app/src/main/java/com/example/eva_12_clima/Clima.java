package com.example.eva_12_clima;

public class Clima {

    private int img;
    String Ciudad ,Des;
    private double temp;

    public Clima() {
        this.img = R.drawable.sunny;
        this.Ciudad = "Chihuahua";
        this.temp = 27.3;
        this.Des = "Rojo atardecer con crepusculos arrebolados";
    }

    public Clima(int img, String Ciudad, double temp, String Des) {
        this.img = img;
        this.Ciudad = Ciudad;
        this.temp = temp;
        this.Des = Des;
    }

    public int getImg() {
        return img;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getDes() {
        return Des;
    }

    public double getTemp() {
        return temp;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public void setDes(String des) {
        Des = des;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }


}

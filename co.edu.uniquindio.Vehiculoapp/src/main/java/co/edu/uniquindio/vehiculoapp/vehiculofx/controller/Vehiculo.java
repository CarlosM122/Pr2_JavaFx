package co.edu.uniquindio.vehiculoapp.vehiculofx.controller;

public class Vehiculo {
    private String placa;
    private String color;
    private String ejes;
    private String blindaje;

    public static VehiculoBuilder builder(){
        return new VehiculoBuilder();
    }

    public Vehiculo() {
    }

    public Vehiculo(String placa, String color, String ejes, String blindaje) {
        this.placa = placa;
        this.color = color;
        this.ejes = ejes;
        this.blindaje = blindaje;
    }

    public String getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }

    public String getEjes() {
        return ejes;
    }

    public String getBlindaje() {
        return blindaje;
    }


}

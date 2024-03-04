package co.edu.uniquindio.vehiculoapp.vehiculofx.controller;

public class VehiculoBuilder {
    protected String placa;
    protected String color;
    protected String ejes;
    protected String blindaje;

    public VehiculoBuilder placa(String placa){
        this.placa = placa;
        return this;
    }
    public VehiculoBuilder color(String color){
        this.color = color;
        return this;
    }
    public VehiculoBuilder ejes(String ejes){
        this.ejes = ejes;
        return this;
    }
    public VehiculoBuilder blindaje(String blindaje){
        this.blindaje = blindaje;
        return this;
    }

    public Vehiculo build(){
        return new Vehiculo(color,placa,blindaje,ejes);
    }

}

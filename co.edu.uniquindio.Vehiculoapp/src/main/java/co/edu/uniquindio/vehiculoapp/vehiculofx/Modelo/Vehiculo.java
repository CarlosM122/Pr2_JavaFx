package co.edu.uniquindio.vehiculoapp.vehiculofx.Modelo;

public class Vehiculo {
    private String placa;
    private String color;
    private String ejes;
    private String blindaje;
    private int capacidadCarga;
    private int capacidadPasajeros;


    public Vehiculo() {
    }

    public Vehiculo(String placa, String color, String ejes, String blindaje, int capacidadCarga, int capacidadPasajeros) {
        this.placa = placa;
        this.color = color;
        this.ejes = ejes;
        this.blindaje = blindaje;
        this.capacidadCarga = capacidadCarga;
        this.capacidadPasajeros = capacidadPasajeros;
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

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getcapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEjes(String ejes) {
        this.ejes = ejes;
    }

    public void setBlindaje(String blindaje) {
        this.blindaje = blindaje;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", color='" + color + '\'' +
                ", ejes='" + ejes + '\'' +
                ", blindaje='" + blindaje + '\'' +
                ", capacidadCarga=" + capacidadCarga +
                ", CapacidadPasajeros=" + capacidadPasajeros +
                '}';
    }
}

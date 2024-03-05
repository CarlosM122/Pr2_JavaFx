package co.edu.uniquindio.vehiculoapp.vehiculofx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.vehiculoapp.vehiculofx.Modelo.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class VehiculoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AgregarVehiculobtn;

    @FXML
    private RadioButton VehiculoCargabtn;

    @FXML
    private RadioButton VehiculoTransportebtn;

    @FXML
    private TextField txtBlindaje;

    @FXML
    private TextField txtCapacidadCarga;

    @FXML
    private TextField txtCapacidadPasajeros;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtNumeroEjes;

    @FXML
    private TextField txtPlaca;
    @FXML
    private TextArea txtArearResultado;
    private RadioButton radioBtnSeleccionado;

    @FXML
    void onAgregarVehiculobtn(ActionEvent event) {
        agregarVehiculo();
    }

    @FXML
    void onVehiculoCarga(ActionEvent event) {
    }

    @FXML
    void onVehiculoTransporte(ActionEvent event) {
    }

    @FXML
    void initialize() {
    }


    private void agregarVehiculo() {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setPlaca(txtPlaca.getText());
        vehiculo.setBlindaje(txtBlindaje.getText());
        vehiculo.setEjes(txtNumeroEjes.getText());
        vehiculo.setColor(txtColor.getText());
        vehiculo.setCapacidadCarga(Integer.parseInt(txtCapacidadCarga.getText()));
        vehiculo.setCapacidadPasajeros(Integer.parseInt(txtCapacidadPasajeros.getText()));

        // Dependiendo del radio button seleccionado, se agrega el mensaje correspondiente
        if (VehiculoCargabtn.isSelected()) {
            txtArearResultado.setText("Vehículo de tipo carga:\n" +
                    "\nPlaca: " + vehiculo.getPlaca() +
                    "\nColor: " + vehiculo.getColor() +
                    "\nEjes: " + vehiculo.getEjes() +
                    "\nBlindaje: " + vehiculo.getBlindaje() +
                    "\nCapacidad de carga: " + vehiculo.getCapacidadCarga());
        } else if (VehiculoTransportebtn.isSelected()) {
            txtArearResultado.setText("Vehículo de tipo transporte:\n" +
                    "\nPlaca: " + vehiculo.getPlaca() +
                    "\nColor: " + vehiculo.getColor() +
                    "\nEjes: " + vehiculo.getEjes() +
                    "\nBlindaje: " + vehiculo.getBlindaje() +
                    "\nCapacidad de pasajeros: " + vehiculo.getcapacidadPasajeros());
        } else {
            // En caso de que ninguno esté seleccionado, se muestra un mensaje de error o manejas la situación según tus necesidades.
            txtArearResultado.setText("Por favor, selecciona el tipo de vehículo.");
        }
    }

}
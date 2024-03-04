package co.edu.uniquindio.cliente.clienteapp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Clientecontroller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregrarCliente;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefonoFijo;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onAgregarCliente(ActionEvent event) {
        agregarCliente();
    }

    @FXML
    void initialize() {

    }

    private void agregarCliente() {
        String datosCliente="";
        datosCliente +=txtNombre.getText();
    }



}


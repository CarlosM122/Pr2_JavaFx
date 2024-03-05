module co.edu.uniquindio.vehiculoapp.vehiculofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.vehiculoapp.vehiculofx to javafx.fxml;
    exports co.edu.uniquindio.vehiculoapp.vehiculofx;

    opens co.edu.uniquindio.vehiculoapp.vehiculofx.controller;
    exports co.edu.uniquindio.vehiculoapp.vehiculofx.controller;
    exports co.edu.uniquindio.vehiculoapp.vehiculofx.Modelo;
    opens co.edu.uniquindio.vehiculoapp.vehiculofx.Modelo;
}
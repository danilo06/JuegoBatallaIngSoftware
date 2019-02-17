package JuegoBatalla.Vista;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private AnchorPane Panel1ComenzarBatalla;

    @FXML
    private AnchorPane Panel2GnerarTropas;

    @FXML
    private Button Panel2BtnGenerarTropas;

    @FXML
    private AnchorPane Panel3Batalla;

    @FXML
    private Button Panel3BtnAtacarEquipoRojo;

    @FXML
    private Button Panel3BtnAtacarEquipoAzul;

    @FXML
    private ImageView Panel3ImgEquipoAzul;

    @FXML
    private ImageView Panel3ImgEquipoRojo;

    @FXML
    private AnchorPane Panel4NuevaPartida;

    @FXML
    private Button Panel4BtnNuevaPartida;

    @FXML
    private ImageView Panel4ImgYouWin;

    @FXML
    private Button Panel1BtnComenzarBatalla;

    @FXML
    void Panel1BtnComenzarBatallaAction(ActionEvent event) {
    	Panel2GnerarTropas.setLayoutX(0);
    	
 
    }

    @FXML
    void Panel2BtnGenerarTropasAction(ActionEvent event) {
    	Panel3Batalla.setLayoutX(0);
    }

    @FXML
    void Panel3BtnAtacarEquipoAzulAction(ActionEvent event) {
    	Panel4NuevaPartida.setLayoutX(0);
    }

    @FXML
    void Panel3BtnAtacarEquipoRojoAction(ActionEvent event) {

    }

    @FXML
    void Panel4BtnNuevaPartidaAction(ActionEvent event) {

    }

}

package JuegoBatalla.Vista;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable{

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
    private Image imagenBueno;
    
    @FXML
    private Image imagenMalo;
    
    
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
    	/*
    	imagenBueno = new Image("2bueno.gif");
    	imagenMalo = new Image("2malo.gif");
    	Panel3ImgEquipoAzul.setImage(imagenBueno);
    	Panel3ImgEquipoRojo.setImage(imagenMalo);
    	*/
    }

    @FXML
    void Panel3BtnAtacarEquipoRojoAction(ActionEvent event) {
    	//pbRed.setStyle("-fx-accent: red;"); 
    }

    @FXML
    void Panel4BtnNuevaPartidaAction(ActionEvent event) {
    	Panel2GnerarTropas.setLayoutX(1700);
		Panel3Batalla.setLayoutX(1700);
		Panel4NuevaPartida.setLayoutX(1700);
    	
    }

	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}

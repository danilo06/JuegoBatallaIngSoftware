package JuegoBatalla.Vista;

import java.net.URL;
import java.util.ResourceBundle;

import JuegoBatalla.Juego.Batalla;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
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
    private Button Panel2BtnComenzar;

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
    
    private Batalla batalla;
    
    @FXML
    private ProgressBar BarraVidaTeamAzul;

    @FXML
    private ProgressBar BarraVidaJugadorAzul;

    @FXML
    private ProgressBar BarraVidaTeamRojo;

    @FXML
    private ProgressBar BarraVidaJugadorRojo;
    
    
    @FXML
    void Panel1BtnComenzarBatallaAction(ActionEvent event) {
    	Panel2GnerarTropas.setLayoutX(0);
    	
 
    }

    @FXML
    void Panel2BtnGenerarTropasAction(ActionEvent event) {
    	Panel2BtnComenzar.setDisable(false);
    }
    
    @FXML
    void Panel2BtnComenzarAction(ActionEvent event) {
    	Panel3Batalla.setLayoutX(0);
    }


    @FXML
    void Panel3BtnAtacarEquipoAzulAction(ActionEvent event) {
    	if (BarraVidaTeamRojo.getProgress()<0.03) {
    		BarraVidaTeamRojo.setProgress(BarraVidaTeamRojo.getProgress()-0.07);
        	BarraVidaJugadorRojo.setProgress(BarraVidaJugadorRojo.getProgress()-0.14);
    	}else {
    		Panel4NuevaPartida.setLayoutX(0);
    	}
    }

    @FXML
    void Panel3BtnAtacarEquipoRojoAction(ActionEvent event) {
    	if (BarraVidaTeamAzul.getProgress()<0.03) {
    		BarraVidaTeamAzul.setProgress(BarraVidaTeamAzul.getProgress()-0.07);
        	BarraVidaJugadorAzul.setProgress(BarraVidaJugadorAzul.getProgress()-0.14);
    	}else
    	{
    		Panel4NuevaPartida.setLayoutX(0);
    	}
    }


    @FXML
    void Panel4BtnNuevaPartidaAction(ActionEvent event) {
    	Panel2GnerarTropas.setLayoutX(1700);
		Panel3Batalla.setLayoutX(1700);
		Panel4NuevaPartida.setLayoutX(1700);
    	
    }

	public void initialize(URL arg0, ResourceBundle arg1) {
		batalla = new Batalla();
		int aux3 =batalla.getPrimerAtacante();
		if (aux3==1) {
			Panel3BtnAtacarEquipoRojo.setDisable(false);
			Panel3BtnAtacarEquipoAzul.setDisable(true);
		}else
		{
			Panel3BtnAtacarEquipoAzul.setDisable(false);
			Panel3BtnAtacarEquipoRojo.setDisable(true);
		}
		Panel2BtnComenzar.setDisable(true);
		BarraVidaTeamAzul.setStyle("-fx-accent: green;");
		BarraVidaJugadorAzul.setStyle("-fx-accent: green;");
		BarraVidaTeamRojo.setStyle("-fx-accent: green;");
		BarraVidaJugadorRojo.setStyle("-fx-accent: green;");
		String aux = batalla.getEjercito1().getUnidades().get(0).getTipo();
		String aux2 = batalla.getEjercito2().getUnidades().get(0).getTipo();
		switch (aux) {
			case "Caballero":
				imagenBueno = new Image("2bueno.gif");
				break;
			case "Infanteria":
				imagenBueno = new Image("3bueno.gif");
				break;
			case "Lancero":
				imagenBueno = new Image("4bueno.gif");
				break;
		}
		switch (aux2) {
		case "Caballero":
			imagenMalo = new Image("2malo.gif");
			break;
		case "Infanteria":
			imagenMalo = new Image("3malo.gif");
			break;
		case "Lancero":
			imagenMalo = new Image("4malo.gif");
			break;
	}	
		Panel3ImgEquipoAzul.setImage(imagenBueno);
    	Panel3ImgEquipoRojo.setImage(imagenMalo);
		

		
	}

}
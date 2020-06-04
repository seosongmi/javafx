package media_pack;
//p.916
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//MediaControl.fxml
//MediaController.java
public class MediaMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MediaControl.fxml")); 
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();;
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}

package panes.vbox_hbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primarystage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Root.fxml"));
		Scene scene = new Scene(root);
		primarystage.setTitle("VBox HBox  예제");
		primarystage.setScene(scene);
		primarystage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

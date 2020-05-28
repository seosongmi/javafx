package fxml;
//p.858 hbox대신 root입력
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox(); //hbox는 컨트롤들을 옆으로 길게 늘어놓는 컨테이너
		root.setPadding(new Insets(10));
		root.setSpacing(10);

		TextField textField = new TextField();
		textField.setPrefWidth(200);

		Button button = new Button();
		button.setText("확인");

		ObservableList list = root.getChildren();
		list.add(textField);
		list.add(button);

		Scene scene = new Scene(root);

		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

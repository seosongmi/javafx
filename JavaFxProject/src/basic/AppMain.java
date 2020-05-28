package basic;

//p.java2 856
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {

	public AppMain() {
		System.out.println(Thread.currentThread().getName() + " : AppMain() 실행.");
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : init() 실행.");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + " : start() 실행.");
		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER); 
		root.setSpacing(20);

		Label label = new Label(); // 컨트롤
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50));

		Button button = new Button(); // 컨트롤
		button.setText("확인");
		button.setOnAction((event) -> Platform.exit());//람다표현식 사용-소스 간단하게

		root.getChildren().add(label);
		root.getChildren().add(button);

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : stop() 실행.");
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

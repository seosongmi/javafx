package fxml;

//p.858 hbox대신 root입력
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox(); // hbox는 컨트롤들을 옆으로 길게 늘어놓는 컨테이너
		root.setPadding(new Insets(10));
		root.setSpacing(10);
		root.setPrefSize(700, 300);

		TextField textField = new TextField();
		textField.setPrefWidth(200);
		textField.setPrefHeight(100);

		Button button = new Button();
		button.setText("확인");

		button.setPrefSize(100, 100);
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				textField.setText("확인을 눌렀습니다");
			}
		});

		Button button1 = new Button();
		button1.setText("취소");

		button1.setPrefSize(100, 100);
		button1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				textField.setText(null);
			}
		});

		ObservableList list = root.getChildren();
		list.add(textField);
		list.add(button);
		list.add(button1);

		Scene scene = new Scene(root);

		primaryStage.setTitle("레이아웃");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent event) {
				System.out.println("닫기 버튼 클릭");
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}

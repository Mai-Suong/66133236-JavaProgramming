package msuong;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// muon co giao dien do hoa trong du an thi dung "extends App
public class HelloJaVa_FX01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// tao mot nut bam - button
		Button btn = new Button();
		
		// thiet lap tieu de - thuoc tinh
		btn.setText("xin chao Java_FX");
		
		// tao khung rong ben ngoai - cửa sổ
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		
		// man hinh/phan canh hien thi ung dung
		Scene scn = new Scene(root, 400, 250);   // voi 400 - do rong, 250 chieu cao
		
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

	

}

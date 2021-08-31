package listview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application {

	@Override
		// 리스트 형태로 나오는 것 ListView
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ListView<String> listView = new ListView<String>();
		
		listView.getItems().addAll("item1","item2","item3");	// 리스트 내용
		listView.setPrefSize(100, 100);		//사이즈 설정
		listView.setLayoutX(20);
		listView.setLayoutY(20);
		
		ap.getChildren().add(listView);		// ap에 저장
		
		
		
		arg0.setScene(new Scene(ap,300,200));
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

package imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {

		// 이미지를 넣는 것	ImageView
		AnchorPane ap = new AnchorPane();
		ImageView iv = new ImageView("/img/smilerere.png");
	//	iv.setImage(new Image("/img/calendar.png")); <= 이렇게 만들어도 가능
		
		iv.setFitHeight(100);		// 가로 늘리기
		iv.setFitWidth(50);			// 세로 늘리기
	//	iv.setPreserveRatio(true);	// 하나만 설정해서 그 값으로 가로 세로를 맞춰줌
		iv.setRotate(45);			// 이미지 회전
		
		ap.getChildren().add(iv);
		
		arg0.setScene(new Scene(ap, 300,200));
		arg0.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

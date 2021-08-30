package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
						// Stage = 무대라고 생각(기본틀)
		// 모두 fx꺼로 임폴트하기
		
		Label lb = new Label("Hello World!!");
		lb.setFont(new Font(20));	// 글씨 크기 조정
			
		Scene scene = new Scene(lb, 200,100); // Scene = 글씨 넣기,가로,세로사이즈
						// 컨테이너를 만들고 컨테이너에 글씨,그림,동영상등을 넣고 1b자리에 넣음
		
		arg0.setScene(scene);	// 글씨 넣기
		arg0.setTitle("연습중");	// 타이틀 설정
		arg0.show();	// 화면을 띄우겠다는 뜻, 기본 틀을 보여줘라
					
	
	}
	
	public static void main(String[] args) {
		launch(args);	// 무조건 이걸로 실행해야 start가 실행됨
		
	}

	
	
}
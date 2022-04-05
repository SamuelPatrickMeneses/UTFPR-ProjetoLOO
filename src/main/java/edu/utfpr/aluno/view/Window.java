package edu.utfpr.aluno.view;

import javafx.application.Application;
import javafx.stage.Stage;

public class Window extends Application implements VisualWindow {
    public Window(){
        setLayouts();
        setComponents();
        setEvents();
    }
    public void setLayouts(){}
	public void setComponents(){}
	public void setEvents(){}
    @Override
    public void start(Stage palco) throws Exception {
        GUIManeger gui = GUIManeger.getIntance();
        gui.setPalco(palco);
        gui.initLogin();
        
        /*AnchorPane a = new AnchorPane();
        a.setPrefSize(800, 600);
        TextField tf = new TextField();
        tf.setPromptText("Usuario");
        PasswordField pf = new PasswordField();
        pf.setPromptText("Senha");
        Button b = new Button();
        b.setText("login");
        a.getChildren().addAll(tf,pf,b);
        Scene s = new Scene(a);
        palco.setScene(s);*/

    }
    public static void main(String[] args) {
        //new Main(args);
        launch(args);
    }
    @Override
    public void doAdjustmentLayout() {
        // TODO Auto-generated method stub
        
    }
    
    
}
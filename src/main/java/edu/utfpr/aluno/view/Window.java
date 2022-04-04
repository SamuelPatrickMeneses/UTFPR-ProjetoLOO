package edu.utfpr.aluno.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
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
        GUIManeger.getIntance().setPalco(palco);
        Pane root = FactorePanel.getLoginScreen();
        Scene s = new Scene(root);
        root.layout();
        palco.setScene(s);
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
        palco.show();
    }
    public static void main(String[] args) {
        //new Main(args);
        launch(args);
    }
    
}
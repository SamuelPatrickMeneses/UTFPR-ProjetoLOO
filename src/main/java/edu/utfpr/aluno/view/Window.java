package edu.utfpr.aluno.view;

import edu.utfpr.aluno.view.telas.LoginPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
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
        
        LoginPane lp = new LoginPane();
        lp.setLayouts();
        lp.setComponents();
        Scene s = new Scene(lp);
        palco.setScene(s);
        palco.show();

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
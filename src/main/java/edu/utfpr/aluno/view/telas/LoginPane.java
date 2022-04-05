package edu.utfpr.aluno.view.telas;

import edu.utfpr.aluno.view.VisualWindow;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class LoginPane extends AnchorPane implements VisualWindow{

    private TextField user;
    private PasswordField senha;
    private Button blogin;
    private VBox div;
    public LoginPane(){
        user = new TextField();
        senha = new PasswordField();
        blogin = new Button();
    }

    @Override
    public void setLayouts() {
        setPrefSize(800, 600);
        user.getStyleClass().add("tf");
        user.setPromptText("Usuario");
        senha.getStyleClass().add("tf");
        senha.setPromptText("Senha");
        blogin.getStyleClass().add("bl");
        blogin.setText("login");
        getStylesheets().add("ude/utfpr/aluno/view/telas/css/login.css");

        
    }

    @Override
    public void setComponents() {
        // TODO Auto-generated method stub
        getChildren().addAll(user,senha,blogin);
    }

    @Override
    public void setEvents() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void doAdjustmentLayout() {
        
        
    }
}
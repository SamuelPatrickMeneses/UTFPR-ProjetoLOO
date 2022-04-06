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
        div = new VBox();
    }

    @Override
    public void setLayouts() {
        setPrefSize(300, 150);
        user.getStyleClass().add("tf");
        user.setPromptText("Usuario");
        senha.getStyleClass().add("tf");
        senha.setPromptText("Senha");
        blogin.getStyleClass().add("bl");
        blogin.setText("login");
        div.getStyleClass().add("div");
        getStyleClass().add("main");
        //setStyle("-fx-background-color: gray");
        getStylesheets().add("edu/utfpr/aluno/view/telas/login.css");

        
    }

    @Override
    public void setComponents() {
        // TODO Auto-generated method stub
        div.getChildren().addAll(user, senha, blogin);
        getChildren().addAll(div);
    }

    @Override
    public void setEvents() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void doAdjustmentLayout() {
        div.setLayoutX((this.getWidth()-div.getWidth())/2);
        div.setLayoutY((this.getHeight()-div.getHeight())/2);
        /*user.setLayoutX((this.getWidth()-user.getWidth())/2);
        user.setLayoutY(30);
        senha.setLayoutX((this.getWidth()-senha.getWidth())/2);
        senha.setLayoutY(60);
        blogin.setLayoutX((this.getWidth() - blogin.getWidth())/2);
        blogin.setLayoutY(100);*/
        
    }
}

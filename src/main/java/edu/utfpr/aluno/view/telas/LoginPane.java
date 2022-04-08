package edu.utfpr.aluno.view.telas;

import edu.utfpr.aluno.view.VisualWindow;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class LoginPane extends AnchorPane implements VisualWindow{

    private TextField user;
    private PasswordField senha;
    private Button blogin;
    private VBox div;
    private Font bfont;
    private Font tfont;
    private Button bcadastro;
    private Label h1;
    public LoginPane(){
        h1 = new  Label();
        user = new TextField();
        senha = new PasswordField();
        blogin = new Button();
        bcadastro = new Button();
        bfont = new Font("calibre", 24);
        tfont = new Font("calibre",36);
        div = new VBox();
    }

    @Override
    public void setLayouts() {
        setPrefSize(800, 600);
        h1.setText("Login");
        h1.getStyleClass().add("h1");
        user.getStyleClass().add("tf");
        user.setPromptText("Usuario");
        senha.getStyleClass().add("tf");
        senha.setPromptText("Senha");
        blogin.getStyleClass().add("button");
        blogin.setText("login");
        bcadastro.setText("cadastrar");
        bcadastro.getStyleClass().add("button");
        div.getStyleClass().add("div");
        getStyleClass().add("main");
        //setStyle("-fx-background-color: gray");
        getStylesheets().add("edu/utfpr/aluno/view/telas/login.css");

        
    }

    @Override
    public void setComponents() {
        // TODO Auto-generated method stub
        h1.setFont(tfont);
        blogin.setFont(bfont);
        bcadastro.setFont(bfont);
        div.getChildren().addAll(h1, user, senha, blogin, bcadastro);
        getChildren().addAll(div);
    }

    @Override
    public void setEvents() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void doAdjustmentLayout() {

        blogin.setPrefWidth(div.getWidth());
        bcadastro.setPrefWidth(div.getWidth());
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

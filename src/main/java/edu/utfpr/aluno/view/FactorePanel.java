package edu.utfpr.aluno.view;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class FactorePanel {
    public static Pane getLoginScreen(){
        StackPane a = new StackPane();
        a.setPrefSize(800, 600);
        TextField tf = new TextField();
        tf.setStyle("-fx-display: block;");
        tf.setPromptText("Usuario");
        tf.setStyle("-fx-margin:50px");
        PasswordField pf = new PasswordField();
        pf.setPromptText("Senha");
        Button b = new Button();
        b.setText("login");
        b.setStyle("-fx-positon:relative;-fx-top:50px;");
        FlowPane a2 = new  FlowPane();
        a2.getChildren().addAll(tf,pf,b);
        a2.setStyle("-fx-margin: 100px auto; -fx-padding: 20px; -fx-background-color: black;");
        a.setStyle("-fx-padding:200px;");
        a.getChildren().add(a2);
        return a;
    }
}

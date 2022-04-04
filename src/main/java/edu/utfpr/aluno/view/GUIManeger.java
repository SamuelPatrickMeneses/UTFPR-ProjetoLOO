package edu.utfpr.aluno.view;
import javax.crypto.SealedObject;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class GUIManeger implements VisualWindow{
    private Stage palco;
    private static GUIManeger intance;
    private GUIManeger(){
        setLayouts();
        setComponents();
        setEvents();
    }
    public static GUIManeger getIntance(){
        if(GUIManeger.intance == null)
            return new GUIManeger();
        return intance;
    }

    @Override
    public void setLayouts() {
        

        
    }

    @Override
    public void setComponents() {
        
        
    }

    @Override
    public void setEvents() {
        // TODO Auto-generated method stub
        
    }
    public void setPalco(Stage s){
        palco = s;
    }

}
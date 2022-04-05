package edu.utfpr.aluno.view;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SealedObject;
import javafx.scene.Parent;
import edu.utfpr.aluno.view.telas.LoginPane;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class GUIManeger implements VisualWindow{
    private Stage palco;
    private static GUIManeger intance;
    private LoginPane login;
    private Map<String,VisualWindow> screens;
    private GUIManeger(){
        screens = new HashMap<>();
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
    public void initLogin(){
        /*if(screens.get("login") == null)
            screens.put("login", new LoginPane()) ;
        Scene cena = new Scene((Parent)screens.get("login"));*/
        login = new LoginPane();
        login.setLayouts();
        login.setComponents();
        Scene cena = new Scene(login);
        palco.setResizable(false);
        palco.show();
        login.doAdjustmentLayout();
    }
    public void setPalco(Stage s){
        palco = s;
    }
    @Override
    public void doAdjustmentLayout() {
        /*VisualWindow p = (VisualWindow) palco.getScene().getRoot();
        for(String k : screens.keySet()){
            VisualWindow pa = screens.get(k);
            if(pa.equals(p))
                 pa.doAdjustmentLayout();*/
        login.doAdjustmentLayout();
        }
            
        
    }

}
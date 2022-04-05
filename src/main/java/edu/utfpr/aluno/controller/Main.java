package edu.utfpr.aluno.controller;
import edu.utfpr.aluno.view.GUIManeger;
import  edu.utfpr.aluno.view.Window;
public class Main {
    private GUIManeger gm;
    public Main(String[] args){
        Window.main(args);
        gm = GUIManeger.getIntance();
    }
    public static void main(String[] args) {
        new Main(args);
        
    }
}

package edu.utfpr.aluno.view;

import edu.utfpr.aluno.controller.uirequest.UserRequestListener;

public class RequestManeger {
    private static UserRequestListener login;
     public void setLogin(UserRequestListener login){
        this.login = login;
     }
     static boolean login(String name, String password){
       return login.has(RequestFactory.getUserReuqest(name, password));
     }

}

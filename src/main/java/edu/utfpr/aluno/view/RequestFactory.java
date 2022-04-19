package edu.utfpr.aluno.view;

import edu.utfpr.aluno.controller.uirequest.UserRequest;
import edu.utfpr.aluno.controller.uirequest.UserRequestListener;

public class RequestFactory {
    static UserRequest getUserReuqest(String name, String password){
        return new ConcretUserReqstue(name, password);
    }
}
class  ConcretUserReqstue implements UserRequest{
     private String name;
     private String password;
    public ConcretUserReqstue(String name, String password){
        this.name = name;
        this.password = password;
    }
    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }
} 

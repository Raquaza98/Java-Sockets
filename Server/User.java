/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gasperini Luca
 */
public class User {
    public String c;
    public String s;
    public boolean o;
    
    public User(String c, String s, boolean o){
        this.c=c;
        this.s=s;
	this.o=o;
    }
    
    public void setAddress(String c){
    this.c =c;
}
    public String getAddress(){
        return c;
    }
    
    public void setNickname(String s){
        this.s=s;
    }
    
    public String getNickname(){
        return s;
    }

    public boolean getStatus(){
	return o;
	}

	public void setStatus(boolean o){
		this.o=o;
	}
}

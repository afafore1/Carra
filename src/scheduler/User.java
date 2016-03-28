/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Ayomitunde
 */
public class User implements Serializable{
    private String username;
    private String password;
    private String email;
    private Color customColor; // this should be moved away from here
    private boolean logged;
    private boolean isAdmin;
    
    public User(String user, String pass, String email){
        this.username = user;
        this.password = pass;
        this.email = email;
        this.isAdmin = false;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public Color getCustomColor(){
        return this.customColor;
    }
    
    public boolean getLogged(){
        return logged;
    }
    
    public void setCustomecolor(Color color ){
        this.customColor = color;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
    
    public void setLogged(){
        logged = true;
    }
    
    public void makeAdmin(boolean bool){
        this.isAdmin = bool;
    }
    
    public boolean isAdmin(){
        return isAdmin;
    }
    
}

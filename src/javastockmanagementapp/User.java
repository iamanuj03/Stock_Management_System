/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastockmanagementapp;

/**
 *
 * @author Anuj
 */
public class User {
    public String sUserID;
    public String sUserName;
    
    public User(String id,String nm){
        this.sUserID = id;
        this.sUserName = nm;
    }
    public String getUserInfo(){
        return "UserID: "+sUserID+" User Name: "+sUserName;
    }
  }

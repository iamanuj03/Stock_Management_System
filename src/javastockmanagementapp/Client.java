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
public class Client extends User {
    
    public Client(String id, String nm) {
        super(id, nm);
    }
    public Client getClient(){
        return new Client(this.sUserID,this.sUserName);
    }
    public void getPromotions(){
        //to be implemented
    }
}

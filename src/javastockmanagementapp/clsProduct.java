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
public class clsProduct {
    
    String pdtID;
    String pdtName;
    String pdtRefNum;
    float pdtUnitPrice;

    public clsProduct(String pdtID,String pdtName,String pdtRefNum,float pdtUnitPrice){
        this.pdtID = pdtID;
        this.pdtName = pdtName;
        this.pdtRefNum = pdtRefNum;
        this.pdtUnitPrice = pdtUnitPrice;
    }
    
}

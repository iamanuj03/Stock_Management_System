/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastockmanagementapp.Interfaces;

import javastockmanagementapp.clsProduct;
/**
 *
 * @author Anuj
 */
public interface Stock extends TABLE_FILLER{
    public abstract java.util.HashMap<String,Integer> getProductsToOrder(javax.swing.JTable tbl);
    public abstract clsProduct getProduct(String pdtName);
}

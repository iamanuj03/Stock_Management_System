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
public interface Stock {
    public abstract java.util.HashMap<String,Integer> getProductsToOrder();
    public abstract clsProduct getProduct(String pdtName);
}

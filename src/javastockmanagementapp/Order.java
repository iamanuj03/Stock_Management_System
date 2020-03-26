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
public interface Order {
    public static java.util.Map<String,Integer> DIC_CURRENT_STOCK = null;
    public abstract String getSelectedProducts();
    public abstract String getNextOrderID();
    public abstract void verifyStock();
}

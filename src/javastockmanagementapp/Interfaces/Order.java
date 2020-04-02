/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastockmanagementapp.Interfaces;

import java.util.HashMap;

/**
 *
 * @author Anuj
 */
public interface Order extends DROPDOWN_UPDATER {
    public static java.util.Map<String,Integer> DIC_CURRENT_STOCK = new HashMap<>();
    public abstract String getSelectedProducts(javax.swing.JTable tbl);
    public abstract String getNextOrderID();
    public abstract void verifyStock();
    public abstract javastockmanagementapp.User getActiveUser(javax.swing.JComboBox<String> dd);
}

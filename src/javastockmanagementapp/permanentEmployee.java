/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastockmanagementapp;

/**
 *
 * @author Azhar
 */
public class permanentEmployee extends clsEmployee{

    public permanentEmployee(int id, String name) {
        super(id, name);
    }
    
    @Override
    public double CalculateBonus(double salary) {
        return salary*0.1;
    }
}

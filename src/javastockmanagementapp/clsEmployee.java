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
public abstract class clsEmployee {
    public int ID;
    public String Name;
    
    public clsEmployee(int id,String name)
    {
        this.ID=id;
        this.Name=name;
    }
    
    public abstract double CalculateBonus(double salary);
    
    public String ToString()
    {
        return String.format("ID:{0} Name: {1}", this.ID,this.Name);
    }
}

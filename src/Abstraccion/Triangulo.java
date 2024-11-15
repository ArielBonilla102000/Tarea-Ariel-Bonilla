/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Nombre: Ariel Bonilla
//Asignatura: Facultativa I
//Trimestre: 3er
package Abstraccion;
import javax.swing.JOptionPane;
public class Triangulo extends FigurasGeometricas{
    @Override
    public void AreaF()
    {
        System.out.println("Area del Triangulo");
        
        Base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base del Triangulo"));
        AltT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura del Triangulo"));   
        Area = (Base * AltT)/ 2;      
        System.out.println("Base: " +Base);
        System.out.println("Altura: " +AltT);
        System.out.println("Formula: (Base * Altura)/ 2 ");        
        System.out.println("El area del Triangulo es: " +Area);
    }
}

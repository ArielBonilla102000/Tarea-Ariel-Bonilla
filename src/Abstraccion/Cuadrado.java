/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Nombre: Ariel Bonilla
//Asignatura: Facultativa I
//Trimestre: 3er
package Abstraccion;
import javax.swing.JOptionPane;
public class Cuadrado extends FigurasGeometricas{
    @Override
    public void AreaF()
    {
        System.out.println("Area del Cuadrado");
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Lado del Cuadrado"));
        Area = lado * lado;
        System.out.println("Lado: " +lado);
        System.out.println("Formula: LADO * LADO");
        System.out.println("El area del Cuadrado es: " +Area);
    }
}


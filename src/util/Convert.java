/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Jfc01
 */
public class Convert {
    public static double currencyConverter(double dollarToday, double money){
        double value = money * dollarToday; 
        return value + (value * 6/100);
    }
}

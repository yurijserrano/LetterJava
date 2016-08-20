/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo2;

/**
 *
 * @author Yuri Serrano
 */
public class LetterPrinter 
{
    public static void main(String[] args)
    {
        Letter carta = new Letter("Romario","Yuri");
    
        carta.addLine("Yuri");
        carta.addLine("LPI - Java");
        carta.addLine("Lab e Teoria");
        
        System.out.print(carta.getText());
    
    }
}

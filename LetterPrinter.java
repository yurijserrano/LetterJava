/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuri Serrano
 */
import java.util.*;

public class LetterPrinter 
{
    public static void main(String[] args)
    {
        Letter carta = new Letter("Yuri Jose","Leandro Pupo");
        
        carta.addLine("Eu participo de um grupo de leitura chamado Inklings na Universidade de");
        carta.addLine("Oxford. Gostaria de convidá-lo a participar também.");
        carta.addLine("Fico no aguardo de uma resposta.");
        
        String Texto = carta.getText();
        
        carta.LetterPrinter(Texto);
    }
    
}

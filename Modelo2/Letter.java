/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo2;

/**
 *
 * @author Yuri Serrano
 */

import java.util.*;

public class Letter 
{
    private ArrayList Lines;
    private String rem="";
    private String dest="";
    private String text="";
    
    
    /**
     * Construtor da Classe Letter
     */
    public Letter(String dest,String rem)
    {
        this.rem=this.rem.concat("\n").concat("\n").concat("Atenciosamente,").concat("\n");
        this.rem=this.rem.concat(rem).concat("\n");
        this.dest=this.dest.concat("Caro ");
        this.dest=this.dest.concat(dest);
        this.dest=this.dest.concat(":").concat("\n").concat("\n");
        Lines=new ArrayList();
    }
    
    /**
     * Adiciona uma linha na carta
     */
    public void addLine(String s)
    {
        Lines.add(s);
    }
    
    /**
     * Retorna a carta completa
     */
    public String getText()
    {
        this.text=this.text.concat(this.dest);
        
        for(int i=0;i<Lines.size();i++)
        {
            this.text=this.text.concat(Lines.get(i).toString()).concat("\n");
        }
        
        this.text=this.text.concat(this.rem);
        
        return text;
        
        
    }
    
}

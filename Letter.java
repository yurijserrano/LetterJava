/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuri Serrano
 */
public class Letter 
{
    private String from="";
    private String to="";
    private String text="";
    private String body="";
    
    /**
     * Construtor da Classe Letter
     */
    public Letter(String from,String to)
    {
        
        this.from=this.from.concat("\n").concat("\n").concat("Atenciosamente,").concat("\n");
        this.from=this.from.concat(from).concat("\n");
        this.to=this.to.concat("Caro ");
        this.to=this.to.concat(to);
        this.to=this.to.concat(":").concat("\n").concat("\n");
        
    }    
    
    /** 
     * Adiciona uma linha a carta
     */
    public void addLine(String line)
    {
        this.body=this.body.concat(line);
        this.body=this.body.concat("\n");        
    }
    
    /**
     * Retorna todo o texto da carta
     */
    public String getText()
    {
        this.text=this.to+this.body+this.from;
        return this.text;
    }
    
    /**
     * Imprime o conteúdo da carta
     */
    public void LetterPrinter(String Text)
    {
        System.out.print(Text);
    }
}

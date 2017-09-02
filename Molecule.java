import java.util.*;
/**
 * Write a description of class Molecule here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Molecule
{
    // instance variables - replace the example below with your own
    
    
    
    
    private Rectangle molecule;
   
    private ArrayList ref;
    private Rectangle pr;
    private String tipo;
    private Rectangle actual;
    private String lectura;
    private String cadena; 
    
 


        
    /**
     * 
     * El tipo de molécula permitido debe contener los caráctres:
     * "A","B","C","D" acompañadas de "+", "-" y el símbolo "00".
     * 
     * Ejemplo de molécula permitida:
     * ("A+ B- C+ D-") separado por espacios " ".
     */
    public Molecule()
    {
        
        
              molecule = new Rectangle();
        
        
           
        makeVisible();
       
        
    }
     
    
    
    public String getType(){
        //System.out.println(tipo);
        return tipo;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void makeVisible(){
        molecule.makeVisible();
        
    }
    
    public void makeInvisible(){
        molecule.makeInvisible();
        
        }
    
   
     
    
       
    public void moveRight(){
        
        makeInvisible();
        molecule.moveHorizontal(20);
       
        
        makeVisible();
    }
    
    public void moveDown(){
        makeInvisible();
        molecule.moveVertical(20);
       
        
        makeVisible();
    }
    //esta funcion debe recibir cuanto moverse hacia la derecha desde  otro lado en molecula
    public void slowMoveHorizontal(int distance){
        molecule.slowMoveHorizontal(distance);
        
        
    }
    //esta funcion debe recibir cuanto moverse hacia la derecha desde  otro lado en molecula
    public void slowMoveVertical(int distance){
        molecule.slowMoveVertical(distance);
       
       
    }
}

 
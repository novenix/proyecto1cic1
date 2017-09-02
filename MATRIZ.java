import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Write a description of class MATRIZ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MATRIZ
{
    // instance variables - replace the example below with your own
    private int x;
    private Rectangle fig;
    private Rectangle ant;
    private Rectangle matriz2[][];
    
    public int der;
    public int abj;
    private List<Rectangle> coord=new ArrayList<Rectangle>();
    private List<Rectangle> coord_mag=new ArrayList<Rectangle>();
    /**
     * Constructor for objects of class MATRIZ
     */
    public MATRIZ() throws FileNotFoundException, IOException
    {
      
        
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Por favor ingrese su nombre");
        String tamaño = br.readLine(); 
        String[] partes= tamaño.split(" ");
        String partes1=
        System.out.println(tamaño+" tamaño");
        List<String> lTamaño=new ArrayList<String>();
        lTamaño.add()
        String entrada = br.readLine(); */
        

        
       

        Rectangle matriz[][] = new Rectangle[300][300];
        String contador = ".";
        
        for (int x=0; x < matriz.length; x++) {
          for (int y=0; y < matriz[x].length; y++) {
            fig=new Rectangle();
            System.out.println(fig);
            /*//fig.makeVisible();*/
            matriz[x][y] = fig;
            //matriz[x][y].changeColor("magenta");
            int cont=0;
            int contx=0;
            while (cont<y){
                matriz[x][y].moveRight();
                
                cont++;
            }
            while (contx <x ){
                matriz[x][y].moveDown();
                contx++;
            }
            System.out.print (matriz[x][y]);
            if (y!=matriz[x].length-1) System.out.print("\t");
            //contador++;
          }
          System.out.println("|");  
        }
        
        der=10;
        abj=10;
        int num=0;
        for (int x=0; x < abj; x++) {
          for (int y=0; y <der; y++) {
             matriz[x][y].setNumnex(num);
            System.out.println( matriz[x][y].getNumnex());
            matriz[x][y].makeVisible(); 
            num+=1;
          }
          System.out.println("|");
        }
        //System.out.println(x,y);
        matriz2=matriz;
   }
   /**escoger numeros desde 1 hasta el limite de altura y anchura
      */
   public void fill(int x,int y){
    matriz2[y-1][x-1].changeColor("black");
    matriz2[x-1][y-1].setNumnex(-1);
    }
   public void flip(int x, int y){
       if (matriz2[x-1][y-1].getColor().equals("black")){
           matriz2[x-1][y-1].changeColor("magenta");
           matriz2[x-1][y-1].setNumnex(0);
           }
       else if (matriz2[x-1][y-1].getColor().equals("magenta")){
           matriz2[x-1][y-1].changeColor("black");
           matriz2[x-1][y-1].setNumnex(-1);
           }
       
       }
    
   public void replicateWithoutBug(){
      int cont=0;
        for (int x=0;x<abj;x++){
            for (int y=0;y<der;y++){
                if(  matriz2[x][y].isVisibles()==true){
                    //validation rell=new validation(matriz2[x][y]);
                    //rell.validation();
                    //int rell= matriz2[x][y].validation(matriz2[x][y]);
                    //matriz2[x][y].changeColor("blue");
                cont=0;
                System.out.println(x);
                System.out.println(y);
                //System.out.println(matriz2[x-1][y-1].getColor());
                //break;
                System.out.println(matriz2[x][y].getColor());
                    if (matriz2[x][y].getColor()=="black"){
                        cont++;
                        System.out.println(cont);
                }
               if (x != 0){ 
                 if (y!=0){
                    if (matriz2[x-1][y-1].getColor()=="black"){
                           cont++;
                          
                           
                     }
                  }
                 if (y!=der){
                  if (matriz2[x-1][y+1].getColor()=="black"){
                   cont++;
                  }
                    }
                 if (matriz2[x-1][y].getColor()=="black"){
                   cont++;
                  }
                
                }
                  
                if (y!=0){
                    if (matriz2[x][y-1].getColor()=="black"){
                   cont++;
                    //matriz2[x][y].changeColor("green");
                  }
                }
               if (x!=abj-1){
                   if(y!=0){   
                     if (matriz2[x+1][y-1].getColor()=="black"){
                         cont++;
                        }
                   }
                   if (y!=der){
                       if (matriz2[x+1][y+1].getColor()=="black"){
                           cont++;
                        }
                    }
                   if (matriz2[x+1][y].getColor()=="black"){
                       cont++;
                   }
                }
               if (y!=der){
                 if (matriz2[x][y+1].getColor()=="black"){
                   cont++;
                }
               }
              
          }
          System.out.println(cont+" contador total");
          
          if (cont%2 !=0 &&cont!=0){
                    //matriz2[x][y].changeColor("black");
                    coord.add(matriz2[x][y])  ;  
                    
                    }
          if (cont%2==0 && cont!=0){
                       //matriz2[x][y].changeColor("magenta");
                       coord_mag.add(matriz2[x][y]);
          }
        }
         
      }
      
      for (int m=0;m<coord_mag.size();m++){
            System.out.println(coord_mag);
            System.out.println(coord_mag.get(m));
            Rectangle pos=coord_mag.get(m);
            pos.changeColor("magenta");
        }
        for (int m=0;m<coord.size();m++){
            System.out.println(coord);
            System.out.println(coord.get(m));
            Rectangle pos=coord.get(m);
            pos.changeColor("black");
        }
       
         coord=new ArrayList<Rectangle>();
         coord_mag=new ArrayList<Rectangle>();
   }
 
    /**ingrese el color y la posicon del nexo
       
       */ 
   public void nexus(String color,int x,int y){
        //matriz2[x][y];
        boolean b = true;
        int k=1;
        int cont=0;
        int p = 1;
        int c1 = 2;
        int lim = 0;
            while (b==true){
                if(matriz2[x][y].isVisibles()==true){
                    cont=0;
                    if (matriz2[x][y].getColor()=="black"){
                        cont++;
                                        
                }
               if (x != 0){ 
                 if (y!=0){
                    if (matriz2[x-k][y-k].getColor().equals("black")){
                           cont++;
                          
                           
                     }
                  }
                 if (y!=der){
                  if (matriz2[x-k][y+k].getColor().equals("black")){
                   cont++;
                  }
                    }
                 if (matriz2[x-k][y].getColor().equals("black")){
                   cont++;
                  }
                
                }
                  
                if (y!=0){
                    if (matriz2[x][y-k].getColor().equals("black")){
                   cont++;
                    //matriz2[x][y].changeColor("green");
                  }
                }
               if (x!=abj-1){
                   if(y!=0){   
                     if (matriz2[x+k][y-k].getColor().equals("black")){
                         cont++;
                        }
                   }
                   if (y!=der){
                       if (matriz2[x+k][y+k].getColor().equals("black")){
                           cont++;
                        }
                    }
                   if (matriz2[x+1][y].getColor().equals("black")){
                       cont++;
                   }
                }
               if (y!=der){
                 if (matriz2[x][y+k].getColor().equals("black")){
                   cont++;
                }
               }
              
          }
          else{break;}
          p = p+(4*c1);
          if (cont==p){
                    lim = x+k;  
                    
                    }
          else if (cont!=p){
              break;
          }          
          c1+=2;
          k+=1;
          System.out.println(cont);
        }
        System.out.println(p);
        
        if (lim!=0) {
            for (int m=x-k;m<lim;m++){
                for (int n=y-k;n<lim; n++){
                    matriz2[m][n].changeColor("magenta");
                }
            }
            for (int m=x-k;m<lim;m++){
                for (int n=y-k;n<lim; n++){
                    matriz2[m][n].changeColor(color);
                }
            }        
        }
        else{error();}
      
      
        
       
         coord=new ArrayList<Rectangle>();
         coord_mag=new ArrayList<Rectangle>(); 
    
    
    }
    
    private String error(){
        return "Error";
        }
    
   private static void recurrence(){
    
    
    } 
}
   /*private int validation(Rectangle matriz2){
           int cont=0;
           if (matriz2[x-1][y-1].getColor()=="black"){
               cont++;
            }
           if (matriz2[x][y-1].getColor()=="black"){
               cont++;
            }
           if (matriz2[x+1][y-1].getColor()=="black"){
               cont++;
            }
           if (matriz2[x-1][y].getColor()=="black"){
               cont++;
            }
           if (matriz2[x+1][y].getColor()=="black"){
               cont++;
            }
           if (matriz2[x-1][y+1].getColor()=="black"){
               cont++;
            }
           if (matriz2[x][y+1].getColor()=="black"){
               cont++;
            }
           if (matriz2[x+1][y+1].getColor()=="black"){
               cont++;
            }
           return cont;
           
       }*/
   


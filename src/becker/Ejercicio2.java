/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;



/**
 *
 * @author ESTUDIANTE
 */
public class Ejercicio2 {
    public static void avanzar (Robot Karel, int n){
         for (int i=0; i<n;i++){
             Karel.move();
         };
       }

     public static void girarderecha(Robot Karel){
         for (int i=0; i<3;i++){
             Karel.turnLeft();
         };
       }
     public static void girarizquierda(Robot Karel){
         
             Karel.turnLeft();
         
       }
           
        public static void voltear (Robot Karel){
         for (int i=0; i<2;i++){
             Karel.turnLeft();
         };
       }
        public static void tomar (Robot Karel, int n){
         for (int i=0; i<n;i++){
             Karel.pickThing();
         };
       }
         public static void poner (Robot Karel, int n){
         for (int i=0; i<n;i++){
             Karel.putThing();
         };
       }
   public static void main(String[] args)
   {  
       City prague = new City();
      for (int i=1; i<3; i++){
          Wall p= new Wall  (prague, 1, i, Direction.NORTH);
      };
       for (int i=1; i<3; i++){
          Wall p= new Wall  (prague, i, 1, Direction.WEST);
      };
      for (int i=1; i<2; i++){
          Wall p= new Wall  (prague, i, 2, Direction.EAST);
      };
      for (int i=1; i<2; i++){
          Wall p= new Wall  (prague, 2, i, Direction.SOUTH);
      };
      for (int i=2; i<3; i++){
          Wall p= new Wall  (prague, 1, i, Direction.SOUTH);
      };
       Robot karel = new Robot(prague, 1, 2, Direction.SOUTH,1);
       Thing periodico = new Thing(prague, 2, 2); 
       
      girarderecha (karel);
      avanzar (karel, 1);
      girarizquierda (karel);
      avanzar (karel,1);
      girarizquierda (karel);
      avanzar (karel,1);
      tomar (karel, 1);
      voltear (karel);
      avanzar (karel,1);
      girarderecha (karel);
      avanzar (karel,1);
      girarderecha (karel);
      avanzar (karel,1);
      girarderecha (karel);
      poner (karel, 1);
      
      
      
       
   };
    
}

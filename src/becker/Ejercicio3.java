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
public class Ejercicio3 {
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
         public static void base (Robot Karel, int n){
         avanzar (Karel,n);
         girarderecha(Karel);
         avanzar (Karel,n);
          girarderecha(Karel);
       }
         public static void espiral (Robot Karel, int n){
         for (int i=n; i!=0; i--){
             base (Karel,i);
         };
         }
         
   public static void main(String[] args)
   { City prague = new City();
      Robot karel = new Robot(prague, 1, 0, Direction.EAST,1);
      
      
      espiral (karel,5);
      girarizquierda (karel);
   
   }
    
}

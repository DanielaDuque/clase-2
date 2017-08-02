package becker;

import becker.robots.*;

public class DeliverParcel
{public static void avanzar (Robot Karel, int n){
         for (int i=0; i<n;i++){
             Karel.move();
         };
       }

     public static void girarderecha(Robot Karel){
         for (int i=0; i<3;i++){
             Karel.turnLeft();
         };
       }
        public static void voltear (Robot Karel){
         for (int i=0; i<2;i++){
             Karel.turnLeft();
         };
       }
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      for (int i=1; i<3; i++){
          Wall p= new Wall  (prague, 1, i, Direction.NORTH);
      };
      for (int i=1; i<3; i++){
          Wall p= new Wall  (prague, 2, i, Direction.SOUTH);
      };
      for (int i=1; i<3; i++){
          Wall p= new Wall  (prague, i, 1, Direction.WEST);
      };
      for (int i=1; i<3; i++){
          Wall p= new Wall  (prague, i, 2, Direction.EAST);
      };
            
     
      Robot karel = new Robot(prague, 0, 2, Direction.WEST,5);
     
      // Direct the robot to the final situation
      
      voltear (karel);	
      avanzar (karel,1);
      girarderecha (karel);
      avanzar (karel,3);
      girarderecha (karel);
      avanzar (karel,3);
      girarderecha (karel);
      avanzar (karel,3);
      girarderecha (karel);
      avanzar (karel,2);
      voltear (karel);
      System.out.println(karel.countThingsInBackpack());
   }
}

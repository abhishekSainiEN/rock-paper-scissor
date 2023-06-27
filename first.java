package rock paper scissor;

import java.util.*;

// Compiler version JDK 11.0.2

class Dcoder
{
   public static void main(String args[])
   {
    System.out.println("Hello, Dcoder!");
     Scanner sc=new Scanner(System.in);
     Random c=new Random();
     System.out.println("1 for rock");
     System.out.println("2 for paper");
     System.out.println("3 for scissor");
    
    
     System.out.println("start playing game");
     int userInput=sc.nextInt();
     int computerInput=c.nextInt(3);
     if(userInput==1&&computerInput==3||userInput==2&&computerInput==1||userInput==1&&computerInput==3){
       System.out.println("congratulation you win this game and computer lost this game");
    
     }else if(userInput==computerInput){
       System.out.println("draw");
       }
       else if(computerInput==1&&userInput==2||computerInput==3&&userInput==1||computerInput==2&&userInput==3){
         System.out.println("computer win");
     }  else{
         System.out.println("invalid");
      
      
         }
    
   }
}
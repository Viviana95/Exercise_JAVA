package com.example;

public class Kata{
    

    public static boolean oddNumber(int number) {
        return number % 2 != 0;
    }
    public String Type(int number) {
      String message="";
        if(
          (oddNumber(number)) ||
          (!oddNumber(number) && number <=20 && number >=6)
          )                
          message = "Weird";
        
        else
        
           message = "Not Weird";
        
        return message;
    }

}

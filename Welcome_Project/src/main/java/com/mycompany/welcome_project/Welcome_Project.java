/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.welcome_project;

import java.io.Console;

/**
 *
 * @author robot
 */
public class Welcome_Project {

    public static void main(String[] args) {
        
      
         Scanner data=new Scanner(System.in);
        Console console = System.console();
        
        String first_name, last_name, email, password, phone_number, ident_number, birth_date, res;
        int age, i=0;
        boolean status, status_yes;
        status_yes=true;
        status=true;
        
        while(status){
           //Get data
           System.out.println("First name: ");
           first_name=data.nextLine();
           System.out.println("Last name: ");
           last_name=data.nextLine();
           System.out.println("E-mail: ");
           email=data.nextLine();
           
           System.out.println("Password without encrypt: ");
           password=data.nextLine();
           
           char[] passwd = console.readPassword("Password with encrypt: ");
           System.out.println("Your encrypt password is: " + passwd);
           
           System.out.println("Phone number: ");
           phone_number=data.nextLine();
           System.out.println("Identification number: ");
           ident_number=data.nextLine();
           System.out.println("Birth date: ");
           birth_date=data.nextLine();
           
           i+=1;
           System.out.println("\nTotal users: " + i);
           
           status_yes = true;
           while(status_yes){
                System.out.println("Do you want to register other user(Y/y/N/n): ");
                res=data.nextLine();
                
                // Validate if res is not Y,y,N,n
                if(!res.equals("Y") && !res.equals("y") && !res.equals("N") && !res.equals("n")) {
                    System.out.println("Invalid option. Try again !!!");
                }else{
                    //Validate if res is N or n
                    if(res.equals("N") || res.equals("n")){
                        status_yes=false;
                        status=false;
                        //break;
                    }else{
                        status_yes=false;
                    }
                }
            }
        }
    }
}
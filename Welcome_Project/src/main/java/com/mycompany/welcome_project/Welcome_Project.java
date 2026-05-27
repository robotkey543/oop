/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.welcome_project;

/**
 *
 * @author robot
 */
public class Welcome_Project {

    public static void main(String[] args) {
        
        Scanner data = new Scanner(System.in);
                String firstname, lastname, email, password, phone_number, ident_number, birth_date;
                int age, i=0;
                boolean status,status_res;
                status_res=true;
                status=true;
                System.out.println("firstname: ");
                firstname= data.nextLine();
                while(status){
                    System.out.println("firstname");
                    firstname= data.nextLine();
                    System.out.println("lastname");
                    lastname=data.nextLine();
                    i+=1;
                    while(status_res){
                    System.out.println("Do you want to register other user (y/y/n/n):");
                    res= data.nextLine();
                    (res.equals("N") || res.equals("n")){
                    status_res= false;
                    status= false;
                    if (res=="Y" || res=="y");
                    status_res=false;
                            if(res!="Y" || res!="y" || res!="N" || res!="n");
                            System.out.println("Invalid option.try again (Y/y/N/n);
                           
                }
               
               
               
               
               
                //System.out.println("Ingrese su primer nombre: ");
                //String firstName = data.nextLine();
               
                //System.out.println("Ingrese su Apellido: ");
                //String lastName = data.nextLine();
               
                //System.out.println("Ingrese su correo: ");
                //String Email = data.nextLine();
               
                //System.out.println("Ingrese su contraseña: ");
                //String Password = data.nextLine();
               
                //System.out.println("Ingrese su numero celular: ");
                //String phoneNumber = data.nextLine();
               
                //System.out.println("Ingrese su numero de identidad: ");
                //String identNumber = data.nextLine();
               
                //System.out.println("Ingrese su fecha de nacimiento: ");
                //String birthDate = data.nextLine();
               
                //System.out.print("Ingrese su edad: ");
                //age = data.nextInt();
               
               
                //for(int i= 0;i<= 10;i++){
                    //System.out.println(i);
                    //for(int j= 10;j>= 1;j--)
    //System.out.println(j);
                }
   }
}
}



    }
}

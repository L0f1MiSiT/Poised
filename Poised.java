/**
 * The above class is a class that is used to create objects of the class personObjects and
 * poisedObjects
 */
 // imported libraries
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Poised {

   // The main method of the program.
   // used a scanner method to get input.
   static Scanner global = new Scanner(System.in);
   public static void main(String[] args){
     // created lists
      List<String> listPerson = new ArrayList<String>(); 
      List<String> listSurname = new ArrayList<String>(); 
      List<String> listTell = new ArrayList<String>();
      
      // Creating a loop that will run twice.
      int i = 0;
      personObjects peoplePro = new personObjects("","",0,"","");
   
      while (i < 2){
         // used a global scope to store variables
         global = new Scanner(System.in);
         System.out.println("Enter the name of Architect and lastley Customer, first the entering the name, like  name enter, surname enter ect. :");
         String namePerson = global.nextLine();
         System.out.println(namePerson);
       
         global = new Scanner(System.in);
         System.out.println("Enter the surname of Architect and lastley  Customer, first the entering the name, like  name enter, surname enter ect.:");
         String surnamePerson = global.nextLine();
         System.out.println(surnamePerson);
        
         global = new Scanner(System.in);
         System.out.println("Enter the telephone number of Architect and lastley Customer, first the entering the name, like  name enter, surname enter ect. :");
         int telefonePerson = global.nextInt();
         System.out.println(telefonePerson);
        
         global = new Scanner(System.in);
         System.out.println("Enter the email address of Architect and lastley Customer, first the entering the name, like  name enter, surname enter ect. :");
         String emailPerson = global.nextLine();
         System.out.println(emailPerson);
         
         global = new Scanner(System.in);
         System.out.println("Enter the physical address of Architect and lastley Customer, first the entering the name, like  name enter, surname enter ect. :");
         String addressPerson = global.nextLine();
         System.out.println(addressPerson);
         
         //  created a project
         peoplePro = new personObjects(namePerson,surnamePerson,telefonePerson,emailPerson,addressPerson);
         
         
         i += 1;
         
         listPerson.add(peoplePro.contrString());
         listSurname.add(peoplePro.getSurname());
         //listTell.add(peoplePro.)
      }
      //System.out.println("*** yessirrr ****");
      System.out.println(listPerson);
      System.out.println(listSurname);
      
      global = new Scanner(System.in);
      System.out.println("Enter the name of contractor :");
      String nameOfCon = global.nextLine();
      System.out.println(nameOfCon);
       
      global = new Scanner(System.in);
      System.out.println("Enter the surname of contractor :");
      String surnameOfCon = global.nextLine();
      System.out.println(surnameOfCon);
        
      global = new Scanner(System.in);
      System.out.println("Enter the telephone number of contractor:");
      int telefoneOfCon = global.nextInt();
      System.out.println(telefoneOfCon);
        
      global = new Scanner(System.in);
      System.out.println("Enter the email address of contractor :");
      String emailOfCon = global.nextLine();
      System.out.println(emailOfCon);
         
      global = new Scanner(System.in);
      System.out.println("Enter the physical address of contractor :");
      String addressOfCon = global.nextLine();
      System.out.println(addressOfCon);
         
      // Creating a new object of the class personObjects and then calling the method contrString() on
      // the object.
      // Creating a new object of the class personObjects and then calling the method contrString() on
      //  craeted an object called contractorObjectPhone.
      personObjects contractorObjectPhone = new personObjects(nameOfCon,surnameOfCon,telefoneOfCon,emailOfCon,addressOfCon);
      String objectVar = contractorObjectPhone.contrString();
         
   
      global = new Scanner(System.in);
      System.out.println("Enter Project no. :");
      int projectNum = global.nextInt();
      
      System.out.println(projectNum);
      
      
      global = new Scanner(System.in);
      System.out.println("Enter the type of building :");
      String projectBuild = global.nextLine();
      
      System.out.println(projectBuild);
      
      // the statement is ture than the code below will be executed
      global = new Scanner(System.in);
      System.out.println("Enter Project name :");
      String projectName = global.nextLine();
      if (projectName.length() == 0){
         projectName = listSurname.get(2);
         System.out.println(projectBuild + " " + projectName);
      } else{
         System.out.println(projectName);
      }
   
      
      global = new Scanner(System.in);
      System.out.println("Enter physical address for project :");
      String projectAddress = global.nextLine();
      System.out.println(projectAddress);
      
      global = new Scanner(System.in);
      System.out.println("Enter Erf number :");
      int projectEfr = global.nextInt();
      System.out.println(projectEfr);
      
      global = new Scanner(System.in);
      System.out.println("Enter the total fee charged :");
      int projectFee = global.nextInt();
      System.out.println(projectFee);
      
      global = new Scanner(System.in);
      System.out.println("Enter the total amount fee paid to date :");
      int projectPaidToDate = global.nextInt();
      System.out.println(projectPaidToDate);
      
      global = new Scanner(System.in);
      System.out.println("Enter the deadline for the project like yyyy-mm-dd eg.(2010-05-17) :");
      String projectDeadLine = global.nextLine();
      LocalDate date1 = LocalDate.parse(projectDeadLine);
      System.out.println(date1);
      
   
      
      
      poisedObjects projectObjects = new poisedObjects(projectNum,projectName,projectBuild,projectAddress,projectEfr,projectFee,projectPaidToDate,projectDeadLine,listPerson.get(0),listPerson.get(1),objectVar);
      System.out.println(projectObjects.toString());
      
      global = new Scanner(System.in);
      
      // created a while loop to keep asking the question
      while (true) {
         System.out.println("Choose a number from the menu:\n" +
            "1 - Change the Deadline: + \n"  +
            "2 - Change the amount of the total fee paid to date:\n" + 
            "3 - Update contractor details:\n" + 
            "4 - To exit:" );
         int menu = global.nextInt();
         
         if (menu == 1){
            System.out.println("To what date would you like to change the deadline to?: ");
            System.out.println("Input new deadline date for the project like yyyy-mm-dd eg.(2010-05-17): ");
            global = new Scanner(System.in);
            String newDeadlineDate = global.nextLine();
            projectObjects.setDeadLine(newDeadlineDate);
            LocalDate deadLineNew = LocalDate.parse(newDeadlineDate);
            System.out.println(projectObjects.toString());
         } else if (menu == 2){
            System.out.println("To what number total amount would you like to change the total amount to date?: ");
            global = new Scanner(System.in);
            int amountNewTotal = global.nextInt();
            projectObjects.setTotalDate(amountNewTotal);
            System.out.println(projectObjects.toString());
         } else if (menu == 3){
            System.out.println("To what number telephone number ofbthe contractor would you like to change to?: ");
            global = new Scanner(System.in);
            int newConNumber = global.nextInt();
            contractorObjectPhone.setTel(newConNumber);
            System.out.println(contractorObjectPhone.contrString());
         } else if (menu == 4){
            break;
         }
      }
      
      
      
   }

}
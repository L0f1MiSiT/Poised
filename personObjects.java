class personObjects{

  // created the following attributes
   public String name;
   public String surname;
   public int telephoneNumber;
   public String emailAddress;
   public String physicalAddress;
   
    
    // created a constructor
   public personObjects(String name,String surname,int telephoneNumber,String emailAddress,String physicalAddress){
      this.name = name;
      this.surname = surname;
      this.telephoneNumber = telephoneNumber;
      this.emailAddress = emailAddress;
      this.physicalAddress = physicalAddress;
   }
   
   // created a setter called setTel()
   public void setTel(int newTel){
      this.telephoneNumber = newTel;
   }
       // created a function to get the name
   public String getSurname(){
      return this.surname;
   }
   // A function that returns a string.
   
   public String contrString(){
      String output = "Details";
      output += "\nName: " + name;
      output += "\nSurname:"  + surname;
      output += "\nTelephone number: " + telephoneNumber;
      output += "\nEmail address: " + emailAddress;
      output += "\nPhysical address: " + physicalAddress; 
      
      // return the output
      return output;
   }
   
}
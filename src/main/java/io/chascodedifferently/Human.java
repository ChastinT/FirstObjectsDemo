package io.chascodedifferently;

public class Human 
{
    private String firstName;
    private String lastName;
     int maxEnergy = 100;
     int energy = 50;

     public Human()
     {
         firstName = "John";
         lastName = "Doe";
     }
     public Human(String firstName,String lastName)
     {
        this.firstName = firstName; 
        this.lastName = lastName;

     }

     public void eat(Fruit fruit)
     {
         this.energy += fruit.energyValue;
     }
     
     public void work(int hours)
     {
         int energyUsed = (hours * 10);
         if (this.energy - energyUsed < 0)
         {
             System.out.println("Not enough energy");
         }
         else
         {
        this.energy -= energyUsed;
         }
     }

     public int getEnergy()
     {
         return energy;
     }

     public String getFirstName()
     {
         return firstName;
     }

     public String getLastName()
     {
         return lastName;
     }


}
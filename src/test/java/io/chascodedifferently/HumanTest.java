package io.chascodedifferently;


import org.junit.Assert;
import org.junit.Test;
public class HumanTest 
{

   @Test
   public void constructorTest()
   {
      String firstName = "Fred";
      String lastName = "Flintstone";
        int energy = 50;

       Human testHuman = new Human(firstName,lastName);
       String actualFirst = testHuman.getFirstName();
       String actualLast = testHuman.getLastName();
       int actualEnergy = testHuman.getEnergy();
       

       Assert.assertEquals(firstName, actualFirst);
       Assert.assertEquals(lastName, actualLast);
       Assert.assertEquals(energy, actualEnergy);

   }

   @Test
   public void eatTest()
   {
       Fruit pineapple = new Fruit("Pineapple",10);
       int expectedEnergy = 60;
       
       Human testHuman = new Human("Barney","Rubble");
       testHuman.eat(pineapple);
       int actualEnergy = testHuman.energy;

       Assert.assertEquals(expectedEnergy, actualEnergy);

   }

   @Test
   public void workTest()
   {
    Human testHuman = new Human("Barney","Rubble");
    int expectedEnergy = 30;

    testHuman.work(2);
   int actualEnergy = testHuman.energy;


   Assert.assertEquals(expectedEnergy, actualEnergy);
   }

   @Test
   public void workMin()
   {
    Human testHuman = new Human("Betty","Rubble");

    testHuman.work(6);
    int actualEnergy = testHuman.getEnergy();

    Assert.assertEquals(50, actualEnergy);
   }
}
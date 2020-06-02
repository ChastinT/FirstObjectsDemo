package io.chascodedifferently;

import org.junit.Assert;
import org.junit.Test;
public class FruitTest 
{
    @Test
    public void constructorTest()
    {
       String type = "Pear";
         int energyValue = 25;
 
        Fruit testFruit = new Fruit(type,energyValue);
        String actualType = testFruit.type;
        int actualEnergy = testFruit.energyValue;
        
 
        Assert.assertEquals(type, actualType);
        Assert.assertEquals(energyValue, actualEnergy);
 
    }
}
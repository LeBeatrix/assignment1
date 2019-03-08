package ac.za.cput.projects;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest
{

    @Test
    public void shouldCreateAnimalAndReturnName()
    {
        //Given Name
        String name = "Silvester";

        //When
        Animal animal = new Cat(name);

        //Then
        Assert.assertTrue(animal.getName().equals(name));

    }
}

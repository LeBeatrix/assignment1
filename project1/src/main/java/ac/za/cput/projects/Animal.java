package ac.za.cput.projects;

public abstract class Animal
{
    private String name;

    Animal(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setNAme(String name)
    {
        this.name = name;
    }
}


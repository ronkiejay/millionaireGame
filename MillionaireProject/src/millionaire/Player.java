package millionaire;

public class Player {
    private String firstName;
    private String lastName;

    public Player()
    {

    }

    public Player(String firstName)
    {
        this.firstName = firstName;
    }

    public Player(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return (firstName + " " + lastName);
    }
}

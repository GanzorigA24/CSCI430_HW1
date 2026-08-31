public class Person {
    private String firstName;
    private String lastname;
    private String id;

    public Person(String firstName, String lastname, String id) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return firstName + " " + lastname + " " + id;
    }
}
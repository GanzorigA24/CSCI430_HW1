import java.util.LinkedList;
import java.util.Scanner;
import java.io.PrintWriter;

public class PersonList {

    private LinkedList<Person> persons;

    public PersonList() {
        persons = new LinkedList<Person>();
    }
    
    public void storePersons(Scanner input) {
        while (input.hasNext()) {
            String firstname = input.next();
            String lastname = input.next();
            String id = input.next();

            Person person = new Person(firstname, lastname, id);
            persons.add(person);
        }
    }

    public void displayPersons(PrintWriter output) {
        for (Person person : persons) {
            output.println(person);
        }
    }

    public int findPerson(String sid) {
        for (int i=0; i < persons.size(); i++) {
            if(persons.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }

}
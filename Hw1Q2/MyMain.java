import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyMain {

    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<Person> persons = new LinkedList<Person>();

        Scanner input = new Scanner(new File("persons.txt"));
        storePersons(input, persons);
        
        PrintWriter output = new PrintWriter(System.out);
        
        displayPersons(output, persons);
        output.flush();

        System.out.println("Person with ID 1002 is at index: " + findPerson("1002", persons));
        System.out.println("Person with ID 1005 is at index: " + findPerson("1005", persons));
        System.out.println("Person with ID 9999 is at index: " + findPerson("9999", persons));

        output.flush();
        input.close();
    }

    public static void storePersons(Scanner input, LinkedList<Person> persons) {
        while (input.hasNext()) {
            String firstname = input.next();
            String lastname = input.next();
            String id = input.next();

            Person person = new Person(firstname, lastname, id);
            persons.add(person);
        }
    }
    public static void displayPersons(PrintWriter output, LinkedList<Person> persons) {
    for (Person person: persons) {
        output.println(person);
        }
    }
    public static int findPerson(String sid, LinkedList<Person> persons) {
        for(int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}


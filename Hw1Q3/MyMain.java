import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) throws FileNotFoundException {
        PersonList persons = new PersonList();

        Scanner input = new Scanner(new File("persons.txt"));
        persons.storePersons(input);

        PrintWriter output = new PrintWriter(System.out);

        persons.displayPersons(output);
        output.flush();

        System.out.println("Person with ID 1002 is at index: " + persons.findPerson("1002"));
        System.out.println("Person with ID 1005 is at index: " + persons.findPerson("1005"));
        System.out.println("Person with ID 9999 is at index: " + persons.findPerson("9999"));

        input.close();
    }
}
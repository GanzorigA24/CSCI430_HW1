import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) throws FileNotFoundException {
        PersonList persons = new PersonList();

        Scanner input = new Scanner(new File("persons.txt"));
        persons.storePersons(input);
    }
}
import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Pawel Gawel", 15);
            people[2] = new Person("Tomasz Lis", 44);
            people[3] = new Person("Andrzej Duda", 54);
            people[4] = new Person("Jerzy Urban", 62);
        } catch (InvalidAgeException e) {
            System.out.println("Age is invalid: " + e.getMessage());
        }

        EmailMessenger emailMessenger = new EmailMessenger();

        for (Person person : people) {
            if (person != null) {
                int value = MathUtils.add(person.getAge(), b);
                emailMessenger.sendMessage(person.getName() + " value: " + value);
            }
        }
    }
}
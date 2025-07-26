import java.util.Scanner;

public class Relationships {
    public static class Person{
        String name;
        int age;
        int income;
        public Person(String theirName){
            name = theirName;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of person 1:");
        String name1 = scanner.nextLine();
        Person person1 = new Person(name1);

        System.out.println("Enter the name of person 2:");
        String name2 = scanner.nextLine();
        Person person2 = new Person(name2);
        possibleRelationships(person1, person2);
    }
    static void possibleRelationships(Person p1, Person p2){
        String[] possibilities = {"friends", "colleagues", "enemies", "siblings", "chums"};
        int index = (int)(Math.random() * possibilities.length);
        String relationship = possibilities[index];
        System.out.println(p1.name + " and " + p2.name + " are " + relationship + ".");
    }
}
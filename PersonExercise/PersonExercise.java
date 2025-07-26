import java.util.Scanner;

public class PersonExercise {
    public static class Person{
        String name;
        int age;
        int income;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person thePerson = new Person();
        int whichOne = 1;
        switch(whichOne){
            case 1:
                System.out.println("What is your name?");
                String theName = scanner.nextLine();
                thePerson.name = theName;
                myName(thePerson);
                whichOne +=1;
            case 2:
                System.out.println("What is your Age?");
                int theAge = scanner.nextInt();
                thePerson.age = theAge;
                myAge(thePerson);
                whichOne +=1;
            case 3:
                System.out.println("What is your income?");
                int theIncome = scanner.nextInt();
                thePerson.income = theIncome;
                myIncome(thePerson);            
        }       
    }
    
    static void myName(Person p) {
        System.out.println("My name is " + p.name);
    }

    static void myAge(Person p) {
        System.out.println("I'm " + p.age + " years old");
    }

    static void myIncome(Person p) {
        System.out.println("I make " + p.income + " per year");
    }
}
public class PersonList {
    public static class Person{
        String name;
        int age;
        int income;
        public Person(String theirName, int theirAge){
            name = theirName;
            age = theirAge;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Bob", 1);
        Person person2 = new Person("Bill", 2);
        Person person3 = new Person("Billy", 3);
        Person person4 = new Person("Yuvin Marasini", 4);
        Person person5 = new Person("Bishop", 5);

        printPerson(person1);
        printPerson(person2);
        printPerson(person3);
        printPerson(person4);
        printPerson(person5);
    }
    static void printPerson(Person p) {
        System.out.println("Name: " + p.name + ", Age: " + p.age);
        if (p.name.equals("Yuvin Marasini")) {
            System.out.println("You are the youngest person ever!");
        }
    }
}
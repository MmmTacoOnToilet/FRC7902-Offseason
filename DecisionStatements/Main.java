import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner whatDoYouWant = new Scanner(System.in);  // Create a Scanner object
    System.out.println("What do you want? 1 for fruit, 2 for drink.");
    int drinkOrFruit = whatDoYouWant.nextInt();
    switch(drinkOrFruit){
        case 1:
            Scanner whichFruit = new Scanner(System.in);
            System.out.println("Which fruit do you want? Pick a number from 1 to 5.");
            int fruits = whichFruit.nextInt();  // Read user input
            switch(fruits){
                case 1:
                    System.out.println("The apple is one dollar.");
                    break;
                case 2:
                    System.out.println("The orange is two dollars.");
                    break;
                case 3:
                    System.out.println("The pear is three dollars.");
                    break;
                case 4:
                    System.out.println("The grape is four dollars.");
                    break;
                case 5:
                    System.out.println("The mango is five dollars.");
                    break;
                default:
                    System.out.println("We don't have that :(");
            } // Outputs a price based on which fruit
            break;
        case 2:
            Scanner whichDrink = new Scanner(System.in);
            System.out.println("Which drink do you want? Pick a number from 1 to 5.");
            int drinks = whichDrink.nextInt();  // Read user input
            switch(drinks){
                case 1:
                    System.out.println("The water is one dollar.");
                    break;
                case 2:
                    System.out.println("The orange juice is two dollars.");
                    break;
                case 3:
                    System.out.println("The milkshake is three dollars.");
                    break;
                case 4:
                    System.out.println("The pepsi is four dollars.");
                    break;
                case 5:
                    System.out.println("The coke is five dollars.");
                    break;
                default:
                    System.out.println("We don't have that :(");
            }
            break;
    }
  }
}
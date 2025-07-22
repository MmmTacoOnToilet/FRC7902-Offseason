import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int incNum = 5;
        do{
            System.out.println(incNum);
            incNum += 3;
            // prints the number and increases it by 3 while the number is less than or equal to 100
        }
        while (incNum<=100);
        Scanner userPhrase = new Scanner(System.in);
        System.out.println("Input a phrase");
        String phrase = userPhrase.nextLine();
        if(phrase.length() > 0 ){
            while(phrase.length() > 0){
                System.out.println(phrase);
                phrase = phrase.substring(1);
            }
        }
    }
}
// java is OOP 

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("f");
        System.out.println("f");
        // I print f twice
        // box 
        int x = 5;
        long y = 5;
        double z = 7.0;
        char c = 'c';
        Boolean check = true;
        String s = "geg"; //.compareTo
        // ==
        // Decision Statements
        // if-else
        if (x == (int)y){
            System.out.println("This works!");
        }
        else if (x > (int)y){
            System.out.println("x is greater than y");
        }
        else {
            System.out.println("This doesn't work");
        }
        // switch-case
        switch (x){
            case 1:
                System.out.println("Type Shit");
                break;
            default:
                System.out.println("H");
                break;
        }
        // Ternary 
        int p = check ? 4 : 3;

        // Arrays

        int[] arr1 = new int[4];
        ArrayList<int[]> arr2 = new ArrayList<>();
        // Loops 
        // for looop, while loop, do-while loop
        for (int i = 0 ; i < 5; i++){
            System.out.println(i);
        }
        for (int i : arr1){
            System.out.println(i);
        }
        while (y < (long)z){
            y++;
            System.out.println (y);
        }
        do {
            System.out.print(z);
        } while(y > (long)z);

        //Scanner
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = Integer.parseInt(sc.nextLine());
        sc.close();

    }

}
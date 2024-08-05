import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//public class AryLIst {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        ArrayList <Integer> list = new ArrayList <>();
//        int n= sc.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++) {
//            list.add(n);
//        }
//        // Output:
////        for(int i = 0 ; i < n ; i++){
////            System.out.print(list.get(i)+" ");
////        }
//        // Alternative
//        for(Integer i:list) {
//            System.out.print(i+" ");
//        }
//    }
//}

public class AryLIst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        scanner.close();

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
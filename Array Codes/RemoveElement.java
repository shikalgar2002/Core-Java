package arays;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int num[] = new int[5];
//        System.out.println("Enter the elements in the array:");
//        for (int i = 0; i < num.length; i++) {
//            System.out.println("Enter number " + (i + 1) + ":");
//            num[i] = sc.nextInt();
//        }
        int num[]= {12,23,34,45,56};
//        for (int i = 0; i < num.length; i++) {
////			System.out.println();
//		}
        System.out.println("Original array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

//        System.out.println("Enter the element to remove:");
//        int remove = sc.nextInt();
        
        int remove=89;
        boolean found = false;
        int newArray[] = new int[num.length - 1];
        int index = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == remove) {
                found = true;
                continue;
            }
            if (index < newArray.length) {
                newArray[index++] = num[i];
            }
        }

        if (found) {
            System.out.println("After removing element " + remove + ":");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Element " + remove + " not found in array.");
        }
        
        sc.close();
    }
}

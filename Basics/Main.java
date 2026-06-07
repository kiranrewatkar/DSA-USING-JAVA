//PRINTING
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello world");
//         //printing Z using print
//         System.out.println("*****");
//         System.out.println("    *");
//         System.out.println("   *");
//         System.out.println("  *");
//         System.out.println(" *");
//         System.out.println("*****");
        
//     }
// }

//? Variables

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         int x = 15;
//         int y = 10;
//         System.out.println("Sum of X and y is "+(x+y));
//         System.out.println("Expression: x*y/x+y = "+(x*y/x+y));
//     }
// }
//======================================================
//? Conditional

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         String name = "Kiran";
//         if (name=="Kiran") {
//             System.out.println("True");
//         }
//         else
//             System.out.println("False");
//     }
// }
//=====================================================
//? grading (if-else)

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         double marks = 80;
//         if (marks >= 90) {
//             System.out.println("Excellent");
//         }
//         else if(marks >= 80 && marks < 90) {
//             System.out.println("Good");
//         }
//         else if(marks >= 70 && marks < 80) {
//             System.out.println("Fair");
//         }
//         else if(marks >= 60 && marks < 70) {
//             System.out.println("Meets Expectation");
//         }
//         else {
//             System.out.println("Below Par");
//         }
//     }
// }
//=========================================================

//! Loops

//Printing 0 to 10
// import java.util.*;
// class Main{
// public static void main(String[] args) {
//     //? While loop
//     int i = 0;  //initialization
//     while(i <= 10) {   //condition
//         System.out.println(i);
//         i = i+1; //or i++    increment/decrement
//     }
//     //? For loop
//     for(int j = 0; j <= 5; j++) {
//         System.out.println(j);
//     }
// //? Input from user
//     System.out.print("Enter number of choice: ");
//     Scanner obj = new Scanner(System.in);
//? integer input
//     int n = obj.nextInt();
 
//     for(int k = 0; k <= n; k++) {
//         System.out.println(k);
//     }
// // --------------------------------------------------
//         System.out.print("Enter your name: ");
//         Scanner sc = new Scanner(System.in);
// // String input        
//         String name = sc.nextLine();
//         System.out.println("Hello "+name);
// ///--------------------------------------------------
// //? Both int/String
    // Scanner obj = new Scanner(System.in);

    // System.out.println("Enter no : ");
    // int n = Integer.parseInt(obj.nextLine()); //int
    // System.out.println("ENter Name : ");
    // String name = obj.nextLine();             //String
    
    // System.out.println("Hello "+name+" Your Counting is");
    // for(int i=0; i<=n; i++) {
    //     System.out.println(i);
    // }
// }}

// //? Check prime number
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         int n, count = 0;;
//         System.out.print("Enter any number: ");
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         for(int i=1; i<=n; i++) {
//             if(n % i == 0) {
//                 count++;
//             }
//         }
//         if (count == 2) {
//             System.out.println("Prime");
//         }
//         else{
//             System.out.println("Not Prime");
//         }
//     }
// }
//? Print all prime till n
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a number (n): ");
//         int n = sc.nextInt();
        
//         System.out.println("Prime numbers up to " + n + ":");
        
//         for (int num = 2; num <= n; num++) {
//             boolean isPrime = true;

//             for (int i = 2; i * i <= num; i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
            
//             if (isPrime) {
//                 System.out.print(num + " ");
//             }
//         }
        
//         sc.close();
//     }
// }
// -------------------------------------------------------
//? Prime from (lower) to (upper)
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter starting number: ");
//         int low = sc.nextInt();
//         System.out.println("Enter Ending number: ");
//         int high = sc.nextInt();
//         System.out.println("Prime numbers between "+low+" to "+high+" is/are:");

//         for(int n = low; n <= high; n++) {
//             int count = 0;
//             for(int div = 2; div*div <= n; div++) {
//                 if (n % div == 0) {
//                     count++;
//                     break;
//                 }
//             }
//             if (count == 0) {
//                 System.out.println(n);
//             }
//         }
        

//         sc.close();
//     }
// }
//----------------------------------------------------
//? Fibonacci 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt(); 
        
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
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

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number: ");
//         int n = sc.nextInt(); 
        
//         int a = 0;
//         int b = 1;
//         for(int i = 0; i < n; i++){
//             System.out.println(a);
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }
// }
//--------------------------------------------------------
// //? Count number of digits
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number: ");
//         int n = sc.nextInt();
//         System.out.println("Here is the count of number: ");

//         int count = 0;
//         while(n != 0) {
//             n = n/10;
//             count++;
//         }
//         System.out.println(count);

//         sc.close();
//     }
// }
//------------------------------------------------------
// //? Digits of a number
/*
Input: 123 
Output: 
1
2
3
*/

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int num = sc.nextInt();

//         // Step 1: Count digits
//         int temp = num;
//         int digitCount = 0;
//         while(temp != 0) {
//             temp = temp / 10;
//             digitCount++;
//         }

//         // Step 2: Print digits one by one
//         int divisor = (int)Math.pow(10, digitCount - 1);
//         while(divisor > 0) {
//             int digit = num / divisor;   // extract leftmost digit
//             System.out.println(digit);
//             num = num % divisor;         // remove that digit
//             divisor = divisor / 10;      // move to next place
//         }

//         sc.close();
//     }
// }
//-------------------------------------------------
// //? Reverse of number
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a numbr: ");
//         int n = sc.nextInt();

//         while(n > 0) {
//             int r = n % 10; //store remainder
//             n = n / 10;      // reduces number length by 1 
//             System.out.println(r);
//         }
        

//         sc.close();
//     }
// }
//---------------------------------------------------------
// //? Inverse of number
/*
i/p: 21453
o/p: 23154
*/
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int n = sc.nextInt();
//         int inv = 0;
//         int op = 1;
//         while(n != 0) {
//             int od = n % 10;
//             int id = op;
//             int ip = od;

//             inv = inv + id * (int)Math.pow(10, ip - 1);

//             n = n / 10;
//             op++;
//         }
//         System.out.println(inv);
        

//         sc.close();
//     }
// }
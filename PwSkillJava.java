                  /*Lecture-1 */

// public class PwSkillJava {
//     public static void main(String[] args) {
//         System.out.println("Hello PwSkill");
        
//     }
// }





// public class PwSkillJava{
//     public static void main(String[] args) {
//         int money = 2000;
//         System.out.println(money);  //before change
//         money = 50000;
//         System.out.println(money);   //after change
//     }
// }





                       /* Lecture-2 */

// import java.util.Scanner;   // or import java.util.*;

// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         // System.out.print("Enter your luck number: "); 
//         // int num_1 = in.nextInt();                          //number
//         // System.out.println("Your lucky number is "+num_1);

//         // System.out.print("Enter your name: ");
//         // String name = in.next();                         //first name
//         // System.out.println("Your name is "+name);

//         System.out.print("Enter your full name: ");
//         String fullName = in.nextLine();               //Full Name
//         System.out.println("Your full name is "+fullName);
//     }
// }





/*  Simple intrest */

// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sg = new Scanner(System.in);

//         System.out.print("Enter Principal: ");
//         float p = sg.nextFloat();
//         System.out.println("Your enter principal is "+p);

//         System.out.print("Enter Rate Of Intrest: ");
//         float r = sg.nextFloat();
//         System.out.println("You enter rate of intrest is "+r);

//         System.out.print("Enter Time: ");
//         float t = sg.nextFloat();

//         float si = (p*r*t)/100;

//         System.out.println("Simple intrest is "+si);
//     }
// }




// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sg = new Scanner(System.in);
//         String p = sg.next();
//         int q = sg.nextInt();       //missmatch error
//         System.out.print(p+" "+q);
//     }
// }



               /* Lecture-5 */
// public class PwSkillJava{
//     public static void main(String[] args) {
//         int a = 20, b = 13;

//         System.out.println(a+b);
//         System.out.println(a-b);
//         System.out.println(a*b);
//         System.out.println(a/b);
//         System.out.println(a%b);
//     }
// }




/* RelationalOperators */
// public class PwSkillJava{
//     public static void main(String[] args) {
//         int a = 10, b = 15;
//         System.out.println(a == b); //false
//         System.out.println(a != b); //true
//         System.out.println(a <= b); //true
//         System.out.println(a >= b); //false
//         System.out.println(a < b); //true
//         System.out.println(a > b); //false
        
//     }
// }



/* Logical Operators */


// public class PwSkillJava{
//     public static void main(String[] args) {
//         int a = 15, b = 10, c = 6;

//         //&& Operator
//         System.out.println((a>b) && (a>c)); //true
//         System.out.println((a>b) && (a<c)); //false


//         // || Operator
//         System.out.println((c<b) || (a<b)); //true
//         System.out.println((a>b) || (b>c));//true
//         System.out.println((c<b) || (b<c));//true

//         // ! Operator
//         System.out.println(!(a == b));//ture
//         System.out.println(!(a > b));//flase
//     }
// }



/* Assignment Operators */
// public class PwSkillJava{
//     public static void main(String[] args) {
//         int p = 10;
//         int q;

//         // =
//         q = p;
//         System.out.println(q); //Ans. q = 10

//         // +=
//         p += q;
//         System.out.println(p); //Ans. p = p + q => p = 10 + 10 = 20

//         // -=
//         p -=q;
//         System.out.println(p); //Ans. p = p - q => p = 20 - 10

//         p *=q;
//         System.out.println(p); //Ans. p = p*q => p = 10*10 => p = 100

//         p /=q;
//         System.out.println(p); //Ans. p = p/q => p = 100/10 => p = 10
//     }
// }



/* ***Java Unary Operators***  ----> Note

+ Unary plus
- Unary minus
++ increment operator
-- Decrement operator
! Logical complement operator

post -> Increment operator (x++)
 |
 V
1.Assign/compute. 2.Increment.
Pre -> Increment operator (++x)
 |
 V
1.Increment. 2.Assign.
*/


/*   Unary Operators  */
// public class PwSkillJava{
//     public static void main(String[] args) {
//         int p = 5, q = 5;

//         System.out.println(p++); //5
//         System.out.println(p); //6

//         System.out.println(++q); //6
//         System.out.println(q); //6

//         int x = p++; 
//         int y = ++q;

//         System.out.println(x); //6
//         System.out.println(y); //7

//         System.out.println(p); //7
//         System.out.println(q); //7
//     }
// }


                /*Lecture-6 Condition*/

//## Odd Even
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number: ");

//         int num = sc.nextInt();
//         if(num%2 == 0)
//         {
//             System.out.println(num + " is Even");
//         }
//         else{
//             System.out.println(num + " is Odd");
//         }
//     }
// }


///*Age Group */

// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age: ");
//         int age = sc.nextInt();

//         if(age<=12)
//         {
//             System.out.println(age+" You are Child");
//         }
//         else if(age>12 && age <18)
//         {
//             System.out.println(age +" you are Teenager");
//         }
//         else{
//             System.out.println(age+ " you are adult");
//         }
//     }
// }



/* Ternary operator */

// import java.util.Scanner;

// import javax.naming.spi.DirStateFactory.Result;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value: ");
//         int num = sc.nextInt();
//         String Result;

//         Result = (num%2 == 0) ? "Even" : "Odd";
//         System.out.println(Result);
//     }
// }



/* Conditional Operators */

/*Q) Write a program to print the value if it is even and divisible by 3 */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int value = sc.nextInt();

//         if(value %2 ==0 && value%3==0)
//         {
//             System.out.println("Answer is "+value);

//         }
//         else{
//             System.out.println("Wrong value "+value);
//         }
//     }
// }


/*Q) Write a program to print the value if it is divisible by 3 or 5. */

// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value: ");
//         int value = sc.nextInt();

//         if( value %3 == 0 || value%5==0)
//         {
//             System.out.println("Your value "+value+" is divisible by 3 or 5 ");
//         }
//         else{
//             System.out.println("your value "+value+"2 is not divisible by 3 or 5");
//         }
//     }
// }



/* Switch Case */

/*Q) Write a program to print the day based on the day number. */

// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the day number: ");
//         int day = sc.nextInt();

//         switch(day){
//             case 1:
//             System.out.println("Monday");
//             break;
//             case 2:
//             System.out.println("Tuesday");
//             break;
//             case 3:
//             System.out.println("Wednesday");
//             break;
//             case 4:
//             System.out.println("Thursday");
//             break;
//             case 5:
//             System.out.println("Friday");
//             break;
//             case 6:
//             System.out.println("Saturday");
//             break;
//             case 7:
//             System.out.println("Sunday");
//             break;
//             default:
//             System.out.println("Invalid day number. Please try again! ");
//         }

//     }
// }





                   /* Lecture - 7      Loop */
//While loop
// import java.util.Scanner;
// //print 1 to n
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int num = 1;

//         while(num <= n)
//         {
//             System.out.println(num);
//             /*num = num + 1;  OR */num++;
//         }
//     }
// }



/*Q) Print the sum of the first n natural numbers, where n is the input. */

// import java.util.Scanner;

// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int num = 1;

//         while(num <= n)
//         {
//             sum = sum + num;
//             num++;
//         }
//         System.out.println(sum);
//     }
// }





/* For Loop */
/*Q) Print the sum of the first n natural numbers, where n is the input. */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int n = sc.nextInt();
        
//         for(int num = 1; num <= n; num++)
//         {
//             System.out.println(num);
//         }
//     }
// }



/*Sum for loop */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int num = 1; num <=n; num++)
//         {
//             sum = sum + num;
//         }
//         System.out.println(sum);
//     }
// }


/* reverse */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int n = sc.nextInt();
//         for(int num = n; num >=1; num -=1)
//         {
//             //num -=2, num = num-2
//             System.out.println(num);
//         }
//     }
// }




// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         int num =20;
//         do{
//             System.out.println(num);
//             num++;
//         }while(num <=10);
//     }
// }




/*Q) Print the sum of the stream of integers in the input. */

// import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value: ");
//         int num = sc.nextInt();
//         int sum = 0;
//         // do{
//         //     sum += num;
//         //     num = sc.nextInt();
//         // }while(num != -1);
//         while(num != -1)
//         {
//             sum +=num;
//             num = sc.nextInt();
//         }
//         System.out.println(sum);
// }
//     }
    


    /*Break keyword */
/*Q) Print the first multiple of 5 which is also a multiple of 7 */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int num = sc.nextInt();

//         while(true){
//             if((num %5 == 0) && (num %7 == 0))
//             {
//                 System.out.println("Found answer: "+num);
//                 break;
//             }
//             num++;
//         }
//     }
// }




/*Continue Keyword */
/*Q) Print all the values between 1 and 50 except for the multiples of 3. */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         // for(int num = 1; num <= 50; num++)
//         // {
//         //     if(num%3 == 0){
//         //         continue;
//         //     }
//         //     System.out.println(num);
//         // }
//         int num = 1;
//         while(num <= 50)
//         {
//             if (num %3 == 0)
//             {
//                 num++;
//                 continue;
//             }
//             System.out.println(num);
//             num++;
//         }
//     }
// }





/* Q) Count the number of digits for a given number n */

// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the value: ");
//         int num = sc.nextInt();
//         int numDigits = 0;
//         int orignal_n = num;

//         while(num > 0)
//         {
//             num = num / 10;
//             numDigits++; //numDigits = numDigits + 1
//         }
//         System.out.println("Number of digits in "+ orignal_n + " = "+ numDigits);
//     }
// }



/* Q) Find the sum of digits in a given. */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value: ");
//         int num = sc.nextInt();
//         int SumOfDigits = 0;
//         int Orignal_n = num;

//         while(num> 0)
//         {
//             SumOfDigits += num%10;
//             num = num /10;
//         }
//         System.out.println("Sum of Digits in "+ Orignal_n + " = " + SumOfDigits);
//     }
// }



/*Q) Reverse the digits of a number. */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int num = sc.nextInt();
//         int orignal_n = num;
//         int ans = 0;
//         while(num>0)
//         {
//             ans = ans * 10 + num%10;
//             num /= 10;
//         }
//         System.out.println("The reverse of "+ orignal_n + " = "+ ans);
//     }
// }



/*Q) Find the sum of the following series */  /* series = 1 - 2 + 3 - 4 - ... ---+ n */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int num = sc.nextInt();

//         int ans = 0;
//         for(int i = 1; i<= num; i++)
//         {
//             if(i %2 == 0)
//             {
//                 ans -= i;
//             }
//             else{
//                 ans += i;
//             }
//         }
//         System.out.println("You value is "+ans);
//     }
// }



/*Q) Print the first n factorial numbers. */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int num = sc.nextInt();
//         int fact = 1;
//         for(int i = 1; i<=num; i++)
//         {
//             fact = fact * i;
//             System.out.println("Factorial of "+i+": " +fact);
//         }
//     }
// }



/*Q) Given 2 numbers a and b. Find to the power b. */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the value: ");
//         int a = sc.nextInt(), b = sc.nextInt();
//         int ans = 1;
//         for(int i = 1; i<=b; i++)
//         {
//             ans *= a;
//         }
//         System.out.println(ans);
//     }
// }





                       /* Lecture - 8      Loop part-2 */
/*Q) Pattern printing: Rectangular pattern. */

// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Column: ");
//         int column = sc.nextInt();
//         System.out.print("Enter the value of Row: ");
//         int row = sc.nextInt();

//         for(int i = 1; i<=column ; i++)
//         {
//             for(int j = 1; j<=row; j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


/*Q) Rectangular Pattern   * * * * * *
                           *         *
                           *         *
                           * * * * * *        */
                    
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Column: ");
//         int column = sc.nextInt();
//         System.out.print("Enter the value of Row: ");
//         int row = sc.nextInt();

//         for(int i = 1; i<=column; i++)
//         {
//             for(int j = 1; j<=row; j++)
//             {
//                 if(i == 1 || i == row || j == 1 || j==Column){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();
//         }
//     }
// }




/*Q) Triangular pattern
 *
 * *
 * * *
 * * * *      */

// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Column: ");
//         int column = sc.nextInt();

//         for(int i = 1; i<= column; i++)
//         {
//             for(int j = 1; j<= i; j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



/*Q) Try printing this pattern 
 * * * *
 * * *
 * *
 *              */

//  import java.util.Scanner;
//  public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of Column: ");
//         int column = sc.nextInt();

//         for(int i = 1; i<= column; i++)
//         {
//             for(int j = 1; j<=(column+1-i); j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//  }





/*     *
     * * *
   * * * * *
 * * * * * * *
                       */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Column: ");
//         int column = sc.nextInt();
//         for(int i = 1; i<= column; i++) //treversing over column
//         {
//             //print r - 1 spaces
//             for(int j = 1; j<= column -i; j++)
//             {
//                 System.out.print(" ");
//             }
//             //print 2 * i - 1
//             for(int k = 1; k<= 2*i-1; k++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




/*Q) Numerical Rectangular pattern 
 1 2 3 4 5 6 7
 2 3 4 5 6 7 1
 3 4 5 6 7 1 2
 4 5 6 7 1 2 3
 5 6 7 1 2 3 4
 6 7 1 2 3 4 5
 7 1 2 3 4 5 6
*/

// import java.util.Scanner;
// public class PwSkillJava{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value column: ");
//         int column = sc.nextInt();
//         for(int i = 1; i<= column; i++)
//         {
//             for(int j = i; j <= column; j++)
//             {
//                 System.out.print(j);
//             }
//             for(int k = 1; k<= i-1; k++)
//             {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }



/* 121212
   212121
   121212
   212121
 */


//  import java.util.Scanner;
//  public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Column: ");
//         int column = sc.nextInt();
//         System.out.print("Enter the value of Row: ");
//         int row = sc.nextInt();
//         for(int i = 1; i <= column; i++)
//         {
//             for(int j = 1; j<= row; j++)
//             {
//                 if((i+j)%2 == 0)
//                 {
//                     System.out.print(1);
//                 }
//                 else{
//                     System.out.print(2);
//                 }
//             }
//             System.out.println();
//         }
//     }
//  }



 /*Q) Numerical Triangular pattern. 
  1
  12
  123
  1234       */
// import java.util.Scanner;
// public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Column: ");
//         int column = sc.nextInt();
//         for(int i = 1; i<= column; i++)
//         {
//             for(int j = 1; j <= i; j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



/*Q) Try this
    1
   121
  12321
 1234321      */

//  import java.util.Scanner;
//  public class PwSkillJava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Column: ");
//         int column = sc.nextInt();
//         for(int i = 1; i<= column; i++)
//         {
//             for(int j = 1; j<= column-i; j++)
//             {
//                 System.out.print(" ");
//             }
//             //print 1 to i
//             for(int k = 1; k<= i; k++)
//             {
//                 System.out.print(k);
//             }

//             //print i - 1 to 1
//             for (int l = i - 1; l>= 1; l--)
//             {
//                 System.out.print(l);
//             }
//             System.out.println();
//         }

//     }
//  }


 /*Q) Try this
      1
     2 2
    3   3
   4444444     */
// import java.util.Scanner;
// public class PwSkillJava{                          /* Wrong */
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Column: ");
//         int column = sc.nextInt();
//         for(int i = 1; i<= column; i++)
//         {
//             for(int j = 1; j<= i; j++)
//             {
//                 if(i == j)
//                 {
//                     System.out.print(i);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }




/* --------------------------X-------------------------X---------------------------------------X----------------------------------------X-------------------------*/
                         /*      Lecture- 9  NUMBER SYSTEM   */


/*Binary To Decimal */
// import java.util.Scanner;
// public class PwSkillJava{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the binary number: ");
//     int binary_num = sc.nextInt();

//     int ans = 0; //converted decimal number
//     int pw = 1; //2^0 = 1 power of 2

//     while(binary_num > 0)
//     {
//       int unit_digit = binary_num%10;
//       ans += (unit_digit * pw);
//       binary_num /= 10;
//       pw *= 2;
//     }
//     System.out.println("Your decimal number is "+ans);
//   }
// }





/*Decimal To Binary */
// import java.util.Scanner;
// public class PwSkillJava{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the decimal number: ");
//     int decimal_num = sc.nextInt();
//     int ans = 0;
//     int pw = 1;

//     while(decimal_num > 0){
//       int parity = decimal_num%2;
//       ans += (parity *pw);

//       pw *=10;
//       decimal_num /= 2;
//     }
//     System.out.println("Your Binary number is "+ans);
//   }
// }





/* --------------------------X-------------------------X---------------------------------------X----------------------------------------X-------------------------*/
                         /*      Lecture- 10   Oops  */
// class student{
//   int rollNo;
//   String studentName;
// }
// public class PwSkillJava{
//     public static void main(String[] args) {
//     PwSkillJava obj1 = new PwSkillJava();
//     System.out.println(obj1.rollNo);
//     System.out.println(obj1.studentName);

//   }
// }


/* -------------------------X-----------------------------------x--------------------------------x----------------------------x-------------------------- */
/*Q) Java program to add number using method */
// import java.util.Scanner;
// class Add{
//   int add(int a, int b){
//     int ans = a + b;
//     return ans;
//   }
// }

// public class PwSkillJava{
//   public static void main(String[] args){
//     Add obj = new Add();
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter first value: ");
//     int x = sc.nextInt();
//     System.out.print("Enter Second value: ");
//     int y = sc.nextInt();

//     System.out.print("Sum of input numbers is ");
//     int ans = obj.add(x,y);
//     System.out.println(ans);
//   }
// }



// import java.util.Scanner;
// class Algebra{
//   int add(int a, int b){
//     int ans = a + b;
//     return ans;
//   }
// }
// public class PwSkillJava{
//   public static void main(String[] args) {
//     Algebra obj = new Algebra();
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter value: ");
//     int num = sc.nextInt();
//     System.out.println(Math.sqrt(num));     //sqrt = square root
//     System.out.println(Math.floor(num));    //floor = lower value like: 5.6:- 5
//     System.out.println(Math.ceil(num));    //ceil = upper value like: 98.5:- 99
//   }
// }




// import java.util.Scanner;
// class Algebra{
//   int a;
//   int b;
//   Algebra(int x, int y)
//   {
//     System.out.println("Construct of Algebra class called");
//   }
//   int add(){
//     int ans=a+b;
//     return ans;
//   }

//   int sub(){
//     return a-b;
//   }

//   int multiple(){
//     return a*b;
//   }
// }

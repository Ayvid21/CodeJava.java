import java.util.Scanner;

public class javaAssignment1 {
  public static void main(String args[]) {
// print a msg
    System.out.println("Hii this is divya!");

//add 2 nos
    int x = 13;
    int y = 45;
    int z = x + y;
    System.out.println(z);

// add 3 nos
    int a = 5;
    int b = 65;
    int c = 85;
    int d = a + b + c;
    System.out.println(d);

// greatest among 2nos
    if(x > y) 
      System.out.println(x + " is greater"+ y);
    else
    System.out.println(y + " is greater"+ x);

// greatest among 3nos

    if(a > b && a>c) {
      System.out.println(a + ": a is greatest");
    }
    if(b > a && b > c) {
      System.out.println(b + ": b is greatest");
    }
    else {
      System.out.println(c + ": c is greatest");
    }

// to check whether the given number is even or odd
  if(x % 2 == 0) {
    System.out.println(x + " is even");
  }
  else {
    System.out.println(x + " is odd");
  }
  
// print the division of the student after calculating the %, afeter getting the marks into 5 subjects
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the marks of Hindi");
    int hindi = s.nextInt();
    System.out.println("Enter the marks of English");
    int english = s.nextInt();
    System.out.println("Enter the marks of Maths");
    int maths = s.nextInt();
    System.out.println("Enter the marks of Physics");
    int physics = s.nextInt();
    System.out.println("Enter the marks of Chemistry");
    int chemistry = s.nextInt();

    int totalMarksScored = hindi + english + maths + physics + chemistry;
    System.out.println("Total is : " + totalMarksScored);
    double percentage = totalMarksScored * 100 / 500;
    System.out.println("Percentage is : " + percentage);

// to print 1 2 3 4 5 6 ... 40
    for(int i=1; i<=40; i++) {
      System.out.print(i + " ");
    }
    System.out.println();

// print the sum 1+2+3+...20
    int sum = 0;
    for(int r=1; r<=20; r++) {
      sum = sum + r;
    }
    System.out.println("Sum is : " + sum);

// to print all the odd nos from 40 to 50
  for(int p=40; p<=50; p++) {
    if(p % 2 != 0) {
      System.out.println(p);
    }
  }

// to get a and b from the user and print a raise to power b
  System.out.println("Enter the values for finding power");
  System.out.println("Enter the value for base: ");
  int A = s.nextInt();
  System.out.println("Enter the value for exponent/power: ");
  int B = s.nextInt();
  // double q = Math.pow(A,B);
  long result = 1;
  for(; B !=0; --B) {
    result *= A;
  }
  System.out.println("Result: " + result);

// to print the factorial of the given no
  int fact = 1;
    for(int q=1; q<=a; q++) {
      fact = fact * q;
    }
    System.out.println("Factorial of a = " + a + " is : " + fact);

// to print the sum of all the digits of the given no
    int digit = 12345;
    // for(){}

// to print prime numbers from 1 to 100
    for(int prime=1; prime<=100; prime++) {
      // if(prime %)
    }
  }
}

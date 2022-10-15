class Main {
  public static void main(String[] args) {

    String str = "Radar", reverseStr = "";
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }
}
Run Code
Output

Radar is a Palindrome String.
In the above example, we have a string "Radar" stored in str. Here, we have used the

1. for loop to reverse the string

The loop runs from the end to the beginning of the string.
The charAt() method accesses each character of the string.
Each character of the string is accessed in reverse order and stored in reverseStr.
2. if statement to compare str and reverseStr

The toLowerCase() method converts both str and reverseStr to lowercase. This is because Java is case sensitive and 'r' and 'R' are two different values.
The equals() method checks if two strings are equal.
Example 2: Java Program to Check Palindrome Number
class Main {
  public static void main(String[] args) {
    
    int num = 3553, reversedNum = 0, remainder;
    
    // store the number to originalNum
    int originalNum = num;
    
    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}
Run Code
Output

3553 is Palindrome.
In the above example, we have a number 3553 stored in num and originalNum variables. Here, we have used the

while loop to reverse num and store the reversed number in reversedNum
if...else to check if reversedNum is same as the originalNum
Share on:
Did you find this article helpful?
Related Examples
Java Example

Reverse a Number

Java Example

Reverse a Sentence Using Recursion

Java Example

Check Armstrong Number

Java Example

Differentiate String == operator and equals() method


Join our newsletter for the latest updates.
Enter Email Address*
Join


Tutorials
Python 3 Tutorial
JavaScript Tutorial
SQL Tutorial
C Tutorial
Java Tutorial
Kotlin Tutorial
C++ Tutorial
Swift Tutorial
C# Tutorial
Go Tutorial
DSA Tutorial
Examples
Python Examples
JavaScript Examples
C Examples
Java Examples
Kotlin Examples
C++ Examples
Company
About
Advertising
Privacy Policy
Terms & Conditions
Contact
Blog
Youtube
Apps
Learn Python
Learn C Programming
Learn Java
© Parewa Labs Pvt. Ltd. All rights reserved.

   

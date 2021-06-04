/*
 * UCF COP 3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Charlene Creighton
 */

/*
Create a simple program that validates user login credentials.
The program must prompt the user for a username and password.
The program should compare the password given by the user to a known password.
 If the password matches, the program should display “Welcome!”
 If it doesn’t match, the program should display “I don’t know you.”

Example Output
What is the password? 12345
I don't know you.
Or
What is the password? abc$123
Welcome!

Constraints
Use an if/else statement for this problem.
Make sure the program is case sensitive.
 */

package Exercise_15;

import java.util.Scanner;
public class ex15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String passw = "abc$123";

        System.out.print("\nWhat is the password? ");
        String password = input.nextLine();

        if (password.equals(passw))
            System.out.println("\nWelcome!");

        else
            System.out.println("\nI don't know you.");
    }
}

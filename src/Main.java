import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//  01. Prompt user for input, display the cube of all numbers up to that bound.

      int num1 = 0;
      int numCube = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an positive integer:  ");
        num1 = input.nextInt();
        System.out.println();

        for(int i = 1; i <= num1; i++) {

            //numCube = Math.pow(num1,3);
            numCube = i * i * i;

            System.out.println(i + "\t" + numCube);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




//  02. Prompt user for input, display the multiplication table for that number up to 10.
//  i.e. 1 x 15 = 15

        int num2 = 0;
        int numTable = 0;

        System.out.println("Enter an positive integer:  ");
        num2 = input.nextInt();
        System.out.println();

        for(int i = 1; i <= 10; i++) {

            //numCube = Math.pow(num1,3);
            numTable = i * num2;

            System.out.println(i + " x " + num2 + " = " + numTable);
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



//  03. Prompt user for input, output all odd numbers up to that bound and then the sum of those odd numbers.

        int num3 = 0;
        int oddSum = 0;
        int oddModulus = 0;


        System.out.println("Enter an positive integer:  ");
        num3 = input.nextInt();
        System.out.println();

        for(int i = 1; i <= num3; i++){


            oddModulus = i % 2;

            if (oddModulus != 0) {
                System.out.println(i);
                oddSum = oddSum + i;
            }


        }
            System.out.println();
            System.out.println("The sum of the odd numbers from 1 to " + num3 + " = " + oddSum);


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

// 04. Prompt user for input, output all even numbers up to that bound and then the sum of those even numbers.

        int num4 = 0;
        int evenSum = 0;
        int evenModulus = 0;


        System.out.println("Enter an positive integer:  ");
        num4 = input.nextInt();
        System.out.println();

        for(int i = 1; i <= num4; i++){


            evenModulus = i % 2;

            if (evenModulus == 0) {
                System.out.println(i);
                evenSum = evenSum + i;
            }


        }
        System.out.println();
        System.out.println("The sum of the even numbers from 1 to " + num4 + " = " + evenSum);


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



// 06. Prompt user for input, Write a loop to display the following:

/*
        1
        12
        123
        1234
        12345*/

        int num6 = 0;

        System.out.println("Enter an positive integer:  ");
        num6 = input.nextInt();
        System.out.println();

        for(int i = 1; i <= num6; i++){


            for (int j = 1; j <= i; j++) {

                System.out.print(j);

            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


// 07. Prompt user for input, Write a loop to display the following:

/*
        1
        22
        333
        4444
        55555*/

        int num7 = 0;

        System.out.println("Enter an positive integer:  ");
        num7 = input.nextInt();
        System.out.println();

        for(int i = 1; i <= num7; i++){


            for (int j = 1; j <= i; j++) {

                System.out.print(i);

            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


// 11. Write a program to sum all the integers between 100 and 200 that is divisible by 9.


        int nineModulus = 0;
        int nineSum = 0;



        for(int i = 100; i <= 200; i++){


            nineModulus = i % 9;

            if (nineModulus == 0) {
                System.out.println(i);
                nineSum = nineSum + i;
            }


        }
        System.out.println();
        System.out.println("The sum of the numbers from 100 to 200 that are divisible by 9 = " + nineSum);


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();





    }
}

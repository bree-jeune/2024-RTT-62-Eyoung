package PA_303__2_1;

public class Homework303_2_1 {
    public static void main(String[] args) {
//        Write a program that declares two integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.

        int num1 = 45;
        int num2 = 30;
        int sum = num1 + num2;
        System.out.println(sum);

//        Write a program that declares two double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.

        double dnum1 = 2.55;
        double dnum2 = 10.233;
        double dsum = dnum1 + dnum2;
        System.out.println(dsum);

//        Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?

        int num3 = 8;
        double dnum3 = 1.23;
        double sum2 = num3 + dnum3;
        System.out.println(sum2);

//        Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?

//        int num4 = 1000;
//        int num5 = 70;
//        int numDiv = num4 / num5;
//        System.out.println(numDiv);

        double num4 = 1000.0;
        int num5 = 70;
        double numDiv = num4 / num5;
        System.out.println(numDiv);

//        Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.

        double doub1 = 5.5;
        double doub2 = 10.233;
        double result = doub2 / doub1;
        System.out.println(result);
        int newResult = (int) result;
        System.out.println(newResult);

//        Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.

        int x = 5;
        int y = 6;
        int q = y/x;
        System.out.println(q);
        q = (int) (float) y;
        System.out.println(q);




    }

}

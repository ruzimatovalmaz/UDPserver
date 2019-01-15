package com.company;

public class Main {

    public static int getSum(int num)
    {
        if(num == 1)
        {
            return 1;
        }
        else {
            return (num + getSum(num-1));
        }
    }


    public static int getFactorial(int number)
    {
        if(number == 1)
        {
            return 1;
        }
        else {
            return (number * getFactorial(number -1));
        }
    }



    public static void main(String[] args) {

        int number = 4;

        number = getFactorial(number);

        System.out.println(number);



    }
}

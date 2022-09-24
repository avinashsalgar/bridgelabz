package com.bridgelabzday2;

public class problem1 {
    static void printValue(char digit) {
        switch (digit){
            case '0' :
                System.out.println("zero");
                break;
            case '1' :
                System.out.println("one");
                break;
            case '2' :
                System.out.println("two");
                break;
            case '3' :
                System.out.println("Three");
                break;
            case '4' :
                System.out.println("four");
                break;
            case '5' :
                System.out.println("five");
                break;
            case '6' :
                System.out.println("six");
                break;
            case '7' :
                System.out.println("seven");
                break;
            case '8' :
                System.out.println("eight");
                break;
            case '9' :
                System.out.println("nine");
                break;
        }
    }
    static void printWord(String N)
    {
        int i, lenght = N.length();
        for (i = 0; i< lenght; i++) {
            // print the digir in word
            printValue(N.charAt(i));
        }
    }

    //Drive code
    public static void main(String[] args) {
        String N = "123";
        printWord(N);
    }
}



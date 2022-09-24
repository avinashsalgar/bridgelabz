package com.bridgelabzday2;

import java.util.Scanner;

public class vowel {
    public static void main(String[ ] arg)
    {
        boolean Vowel=false;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=scanner.next().charAt(0);
        scanner.close();
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                Vowel = true;
        }
        if(Vowel == true) {
            System.out.println(" is  a Vowel" +ch);
        }
        else {
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                System.out.println(ch+" is a Consonant");
            else
                System.out.println("Input is not an alphabet");
        }
    }
}

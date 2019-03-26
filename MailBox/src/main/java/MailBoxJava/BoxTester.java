package MailBoxJava;

import java.util.Scanner;

public class BoxTester {

    public static void main(String[] args) {
        float length;
        int height;
        float width;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter length: ");
        length =scanner.nextInt();
        System.out.println("Please enter height: ");
        height =scanner.nextInt();
        System.out.println("Please enter width: ");
        width =scanner.nextInt();

        MailBoxes box3 = new Box3();
        MailBoxes box5 = new Box5();
        if(box3.validate(length,width,height))
        {
            System.out.println("box3 is fine");
        }
        else if(box5.validate(length,width,height))
        {
            System.out.println("box5 is fine");
        }
        else
        {
            System.out.println("you need some bigger box");
        }


    }
}

package week1;

import java.util.Scanner;

public class PracticeMain {
    static int count = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        PracticeMain main = new PracticeMain();
        main.moveDisk("1", "2", "3" , number);
        System.out.println("result :" + count);

    }


    public void moveDisk(String first, String center, String last, int number){
        //first : ������ �ִ� ž
        //center : �߰� ��ġ ž
        //last : ���ݵ��� �ű� ������ ž

        if(number == 1){
            ++ count;
            System.out.println(number + " : " + first + " -> " + last);
        } else{
            moveDisk(first, last, center, number -1);
            ++ count;
            System.out.println(number + " : " + first + " -> " + last);
            moveDisk(center, first, last, number -1);
        }
    }
}
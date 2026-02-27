
import java.util.Scanner;

class NumberCheck {
    int number;

    NumberCheck(int num) {
        number = num;
    }

    void checkNumber() {
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        NumberCheck obj = new NumberCheck(num);
        obj.checkNumber();
    }
}

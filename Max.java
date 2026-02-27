import java.util.Scanner;

class MaxNumber {
    int num1, num2, num3;
    MaxNumber(int n1,int n2,int n3)
     {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }
    void findMax() {
        int max;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }
        System.out.println("The maximum number is: " + max);
    }
}

public class Max {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        MaxNumber obj = new MaxNumber(a, b, c);
        obj.findMax();
    }
}

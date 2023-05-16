/*2.WAP to find Greater Between three Numbers*/

public class Main {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 10;
        int num3 = 5;
      System.out.println("Number1="+num1 +"\nNumber2=" +num2 +"\nNumber3="+num3);
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is greater");
        } else {
            System.out.println("All numbers are equal");
        }
    }
}
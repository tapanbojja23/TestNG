package exceptionHandling;

public class RunTimeException extends RuntimeException{

    String myMessage = "Kindly enter the correct value";

   /* public RunTimeException(String message, String myMessage) {
        super(message);
        this.myMessage = myMessage;
    }*/

    public static void main(String[] args) {
        int num1, num2, result;
        try {
            num1 = 0;
            num2 = 6;
            result = num2 / num1;
            System.out.println("Number One = " + num1);
            System.out.println("Number Two = " + num2);
            System.out.println("Result = " + result);
            System.out.println("Hey I am in Try block now.....");
        }
        catch (ArithmeticException e) {
            System.out.println("You should not divide any number with ZERO");
        }
        System.out.println("Out of Try Catch block now");
    }
} // end of class RunTimeException



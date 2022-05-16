package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException extends Exception {

     // final void show()
    {
        System.out.println("I am in show method");
    }

}

class Test extends CompileTimeException
{
     public static void main(String[] args) throws FileNotFoundException {
         try {
             FileInputStream fis = new FileInputStream("c:/java-basic-concepts.txt");
         }

         catch (Exception e)
         {
             System.out.println(e);
         }

      //  CompileTimeException ce = new CompileTimeException();

    }
}
package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
public class CompileTimeException extends Exception {


    {
        System.out.println("I am in show method");
    }

}
*/

class Test //extends CompileTimeException
{
     public static void main(String[] args) throws FileNotFoundException {
       /*  try {
                       Class.forName("com.mysql.jdbc.Driver");
         }*/

         try {
              FileInputStream fis = new FileInputStream("c:/java-basic-concepts.txt");
         }

         catch (Exception e)
         {
             System.out.println(e);
         }

         /*catch (Exception ec)
         {
             System.out.println(ec);
         }*/

      //  CompileTimeException ce = new CompileTimeException();

    }
}
package laxmanDemo;

import java.util.List;

public class Calculator  {

    int res = 0;


    public void add (int a, int b)
    {
        try
        {
        res= a/b;
        } catch (ArithmeticException e){
            e.getMessage();
        }


    }




    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
        c.add(7,0);
        System.out.println(c.res);
    }
}

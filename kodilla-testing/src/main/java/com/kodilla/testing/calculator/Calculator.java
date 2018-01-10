package com.kodilla.testing.calculator;
public class Calculator {

   private double result;
   private double result2;

    public Calculator(){
        this.result = result;
        this.result2 = result2;
    }
    public double addAToB(int a, int b)
    {
        double result= a + b;
        //System.out.println("Result: " + result);
        return this.result=result;
    }
    public double getAdd()
    {return result;}

    public double getSub()
    {return result2;}

    public double subtractAFromB(int a, int b)
    {
        double result2 = a - b;
        //System.out.println("Result: " + result2);
        return this.result2 = result2;
    }

}

 class Application {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.addAToB(19,41);
        calc.subtractAFromB(14,29);

       //System.out.println( calc.getAdd() +" " + calc.getSub());

    }
}
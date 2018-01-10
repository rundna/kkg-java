package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator newCalc = new Calculator();
        newCalc.addAToB(19,41);
        newCalc.subtractAFromB(14,29);
        double check = newCalc.getAdd();
        double check2 = newCalc.getSub();

        if(check == 60){
            System.out.println("OK test for add");}
            else{
            System.out.println("Error!");}

            if(check2==-15){
                System.out.println("OK test for substract");}
                else{
                System.out.println("Error!");}




    }
}
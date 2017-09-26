package com.example.admin.helloworld;

/**
 * Created by Admin on 9/26/2017.
 */

public class CodingTest {

    public static void main(String[] args) {
        //create s function to check if the number
        //is divisible by 3 then print "fizz"
        //is divisible by 5 then print "buzz"
        //is divisible by 3 and 5 then print "fizz buzz"
        //otherwise print itself

        String [] animals = {"cat", "hen","cat", "cow", "dog", "pig", "cow", "dog", "rat"};
        System.out.println("test");
        fizzbuzz(30);
        findDulicates(animals);
    }

    public static void fizzbuzz(int num){
        if(num%5 == 0 && num%3 == 0){
            System.out.println("fizzbuzz");
        }
        else if(num%5 == 0){
            System.out.println("buzz");
        }else if(num%3 == 0){
            System.out.println("fizz");
        }else{
            System.out.println(num);
        }
    }

    public static void findDulicates(String [] stringList){
        for(int i = 0; i<stringList.length; i++){
            for(int j = 0; j<stringList.length; j++){
                if (i == j){
                    j++;
                }else if(stringList[i].equals(stringList[j])){
                    System.out.println(stringList[i]);
                }
            }
        }
    }
}

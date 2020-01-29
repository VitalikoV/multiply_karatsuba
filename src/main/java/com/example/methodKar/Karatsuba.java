package com.example.methodKar;

public class Karatsuba {

    int n, halfOfNumberLength;
    long a, b, c, d, ac, bd, ad_plus_bc, resultOfMultiply;

    public long multiply(long firstNumber, long secondNumber){

        if(isMoreThanTwo(firstNumber) || isMoreThanTwo(secondNumber)){
            return firstNumber*secondNumber;
        }else{
            halfOfNumberLength = definitionOfHalf(firstNumber,secondNumber);

            //first_part_of_first_number
            a = (long) Math.floor(firstNumber / Math.pow(10,halfOfNumberLength));
            //second_part_of_first_number
            b = (long) Math.floor(firstNumber % Math.pow(10,halfOfNumberLength));
            //first_part_of_second_number
            c = (long) Math.floor(secondNumber / Math.pow(10,halfOfNumberLength));
            //second_part_of_second_number
            d = (long) Math.floor(secondNumber % Math.pow(10,halfOfNumberLength));

            ac = multiply(a,c);
            bd = multiply(b,d);

            ad_plus_bc = multiply(a + b,c + d) - ac - bd;

            resultOfMultiply = (long) (ac * Math.pow(10, 2 * halfOfNumberLength) + (ad_plus_bc *Math.pow(10, halfOfNumberLength))+ bd);


        }


        return resultOfMultiply;
    }

    public int definitionOfHalf(long firstNumber, long secondNumber){
        n = Math.max(Long.toString(firstNumber).length(), Long.toString(secondNumber).length());
        halfOfNumberLength = n / 2;
        return halfOfNumberLength;
    }

    public boolean isMoreThanTwo(long number){
        return Long.toString(number).length() <= 2;
    }

}

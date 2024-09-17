package student;

import java.util.Scanner;

public class Homework1 {

    public double shippingCalculator(int n){
        //TODO Write your code here for problem 1
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 10.95;
        } else {
            return 10.95 + (n - 1) * 2.95;
        }
    }

    public boolean isValidTriangle(int a, int b, int c){
        //TODO Write your code here for problem 2
        if(c<a+b){
            if(a<c+b){
                if(b<a+c){
                    return true;
                }
            }
        }
    
        return false;

    }
    public boolean isPrime(int number){
        //TODO Write your code here for problem 3
        if(number>1){
            for(int i=2;i<(number/2)+1;i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public  int hex2int(String hex) {
        //TODO Write your code here for problem 4
        switch (hex) {
            case "0":
                return 0;
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "A":
                return 10;
            case "B":
                return 11;
            case "C":
                return 12;
            case "D":
                return 13;
            case "E":
                return 14;
            case "F":
                return 15;
            case "a":
                return 10;
            case "b":
                return 11;
            case "c":
                return 12;
            case "d":
                return 13;
            case "e":
                return 14;
            case "f":
                return 15;
        }
        return -1;
    }
    public String int2hex(int value) {
        //TODO Write your code here for problem 4
        switch (value) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
        }
        return "-1";
    }
}

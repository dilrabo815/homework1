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
        return 0;
    }
    public String int2hex(int value) {
        //TODO Write your code here for problem 4
        return "";
    }
}

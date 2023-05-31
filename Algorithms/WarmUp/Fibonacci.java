mport java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	    int input = 1000;
        fibonacci(input);
     }
     
     public static void fibonacci(int inputNum) {
        int num1 = 0;
        int num2 = 1;
        int latestNum = 0;
        while (latestNum <= inputNum){
            System.out.println(latestNum);
            latestNum = num1 + num2;
            if(latestNum > inputNum){
                break;
            }
            // System.out.println(latestNum);
            num1 = num2;
            num2 = latestNum;
        }
    }
}
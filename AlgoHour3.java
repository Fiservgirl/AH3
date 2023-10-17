import java.util.*;
public class AlgoHour3{
    public void algo3(int n){
           int i;
           for(i = 1; i<n;i++){
            if(i%3 == 0){
            System.out.println("Fizz");
            if(i% 5 == 0){
                System.out.println("Buzz");
                if(i%3== 0 && i%5 ==0){
                System.out.println("FizzBuzz");
                }  
            }
            }
        else  System.out.println(i);
        }
    }

    public void algo3recursive(int n){
           int i;
           for(i = 1; i<n;i++){
            if(i%3 == 0){
            System.out.println("Fizz");
            if(i% 5 == 0){
                System.out.println("Buzz");
                if(i%3== 0 && i%5 ==0){
                System.out.println("FizzBuzz");
                }  
            }
            }
        else  System.out.println(i);
        }
    }
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number please");
    int input = scan.nextInt();    
    AlgoHour3 obj = new AlgoHour3();
    obj.algo3(input);    
    }
}
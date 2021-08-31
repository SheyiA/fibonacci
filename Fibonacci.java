import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of terms: ");
        
        int n  = s.nextInt();
        int i = 0,j=1,nextTerm;
        System.out.println("fibonacc series is ");
        for(int c=0; c<n; c++){
            if(c<=1)
                nextTerm=c;
                else{
                    nextTerm=i+j;
                    i=j;
                    j=nextTerm;
                }
                System.out.println(nextTerm);
            }
        }
    }


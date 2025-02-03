import java.util.*;
public class Power{
    public static double myPow(double x, int n) {
        if(n==0) return 1;
        if(n<0){
            n=-n;
            x=1/x;
            return x*myPow(x,n-1);
        }
        double ans=myPow(x,n/2);
        if(n%2==0) return ans*ans;
        return x*ans*ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x=sc.nextInt();

        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();

        System.out.println(myPow(x,n));
    }
}
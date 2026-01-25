package problems.recursion;

public class print1To5 {
    // Q 1. print 5 to 1
    public static void print1(int start , int end ){
        for (int i = start; i >= end ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    // Q1 by recursion
    public static void print(int n){
        if(n==0){
            System.out.println();
            return;}
        System.out.print(n+" ");
        print(n-1);
    }
    //Q2 print sum of n natural numbers(normal)
    public static void recursive_sum(int i , int n , int sum){

        if(i==n){
            sum = sum +i;
            System.out.println(sum);
            return;}
        sum = sum+i;
        recursive_sum(i+1 , n, sum);

    }

    public static int sumOf_N_naturalNumbers(int n){
        return (n*(n+1))/2;
    }
    //Q factorial
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1 = fact(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    //fibonacci series iterative
    public static void fib(int n){
        int a = 0 , b = 1;
        for (int i = 0; i < n; i++) {
            int c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
    //fibonacci series recursive
    public static void fib1(int a , int b, int n ){
        if (n==0){
                return;
        }

            int c = a+b;
        System.out.println(c);
        fib1(b,c,n-1);


    }
    // print x^n (stack hight = n)
    public static int  StackHeight(int x , int n){
        if(n==0){
            return 1;
        }
        if (x==0){
            return 1;
        }

        int prod_nm1 = StackHeight(x,n-1);

        return x * prod_nm1;
    }
    // print x^n (stack height = log n)

    public static int  StackHeight1(int x , int n){
        if(n==0){
            return 1;
        }
        if (x==0){
            return 1;
        }

        if(n%2 ==0){
            return StackHeight1(x,n/2)*StackHeight1(x,n/2);
        }else{
            return StackHeight1(x,n/2)*StackHeight1(x,n/2)*x;
        }

    }


    public static void main(String[] args) {
        System.out.println("by normal");
        print1(5,1);
        System.out.println("by recursion");
        print(5);
        int n = 5;
        int sum = sumOf_N_naturalNumbers(5);

        recursive_sum(1,5,0);
        System.out.println("normal sum of first "+ n + " natural numbers is "+ sum);

        int factorial = fact(5);
        System.out.println(factorial);

        fib(5);

        fib1(0,1,5);
        int ans = StackHeight(2,5);
        System.out.println(ans);




    }
}

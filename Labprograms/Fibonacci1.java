/*import java.util.*;
class fibonacci
{
  public static int fib(int n)
  {
     if(n==1||n==2)
       return 1;
     if(n==3)
       return 2;
     return fib(n-1)+fib(n-2);
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int result=fib(n);
    System.out.println("The "+n+"th Fibonacci number is:"+result);
  } 
}*/

import java.util.*;
class fibonacci
{
  public static int findNthFibonacci(int n)
     {
       int a=1,b=1,c=0;
       if(n==1||n==2)
          return a;
       for(int i=2;i<n;i++)
       {
         c=a+b;
         a=b;
         b=c;
       }
       return c;
     }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int result=findNthFibonacci(n);
    System.out.println("The "+n+"th Fibonacci number is:"+result);
  } 
}
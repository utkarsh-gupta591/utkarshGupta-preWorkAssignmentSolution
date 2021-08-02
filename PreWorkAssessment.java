import java.util.*;
class PreWorkAssessment
{
public void checkPalindrome()
{
System.out.print("Enter a number: ");
Scanner sc=new Scanner(System.in);
Integer number=sc.nextInt();
int count=0;
for(int n=number;n>0;n/=10)
{
count++;
}
int[] a=new int[count];
for(int i=0;number>0;i++)
{
a[i]=number%10;
number=number/10;
}
count=0;
for(int i=0, j=a.length-1;i<a.length/2;i++,j--)
{
if(a[i]==a[j]) count++;
}
if(count==a.length/2) System.out.println("Given number is a palindrome number");
else System.out.println("Given number is not a palindrome number");
System.out.println("-----------------------------------------------------------");
}


public void printPattern()
{
System.out.print("Enter a number: ");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
while(number>0)
{
for(int i=1;i<=number;i++)
{
System.out.print("*");
}
System.out.println();
number--;
}
}


public void checkPrimeNumber()
{
System.out.print("Enter a number: ");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
boolean prime=false;
if(number%2==0)
{
System.out.println("Given number is not a prime number.");
System.out.println("---------------------------------------------------");
return;
}
int i;
for(i=3;i<number/2;i=i+2)
{
if(number%i==0) break;
}
if(i>=number/2) System.out.println("Given number is a prime number.");
else System.out.println("Given number is not a prime number.");
System.out.println("---------------------------------------------------");
}


public void printFibonacciSeries()
{
System.out.print("Enter a number: ");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int i=0;
int j=1;
int k;
System.out.print(i+" "+j);
for(int n=1;n<=number-1;n++)
{
k=i+j;
System.out.print(" "+k);
i=j;
j=k;
}
System.out.println("\n----------------------------------------------------");
}


public static void main(String[] g)
{
PreWorkAssessment obj=new PreWorkAssessment();
Scanner sc=new Scanner(System.in);
int choice;
do
{
System.out.println("Enter your choice from below list.");
System.out.println("1. Find palindrome of number.");
System.out.println("2. Print Pattern for a given no.");
System.out.println("3. Check whether the no is a prime number.");
System.out.println("4. Print Fibonacci series");
System.out.println("--> Enter0 to Exit.");
choice=sc.nextInt();
switch(choice)
{
case 0:
break;
case 1:
obj.checkPalindrome();
break;
case 2:
obj.printPattern();
break;
case 3:
obj.checkPrimeNumber();
break;
case 4:
obj.printFibonacciSeries();
break;
default:
System.out.println("Invalid choice. Enter a valid no.");
}
}while(choice!=0);
System.out.println("Exited Successfully!!!");
sc.close();
}
}
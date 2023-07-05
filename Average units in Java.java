2) /* Program that calculates average marks of five units */
//  input 56,78,54,89,76--------average
Import java.util.scanner;
Class  average
{
Public static void main ( String[] args) {
Int a, b, c , d, e;
System.out.print(“Enter marks of five units “);
Scanner r=new Scanner(System.in);
a=r.nextint();
b=r.nextint();
c=r.nextint();
d=r.nextint();
e=r.nextint();
int  sum= a+b+c+d+e;
System.out.print(“Total marks “+ sum);
Double average=sum/5.0;
System.out.println(“average marks “ + average);

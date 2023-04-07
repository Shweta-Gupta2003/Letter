import java.util.*;
class Letter
{
public static void main(String args[])
{
int space=0,number=0,count=0,other=0;
Scanner sc=new Scanner(System.in);
System.out.println("Please enter your string:");
String s=sc.nextLine();
char a[]=s.toCharArray();
for(int i=0;i<s.length();i++)
{
if(Character.isSpaceChar(a[i]))
{
space=space+1;
}
else if((a[i]>='0')&&(a[i]<='9'))
{
number=number+1;
}

else if((a[i]>='A')&&(a[i]<='Z'))
{
count=count+1;
}

else if((a[i]>='a')&&(a[i]<='z'))
{
count=count+1;
}
else
other=other+1;
}
System.out.println("Space is "+space);
System.out.println("Number is "+number);
System.out.println("Letter are "+count);
System.out.println("Other are "+other);
}
}
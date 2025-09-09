import java.util.*;
public class Student{
int roll;
String name;
int marks;
public Student (int roll,String name,int marks)
{
this.roll=roll;
this.name=name;
this.marks=marks;
}
public void display()
{
System.out.println("Roll:"+roll+"\nName:"+name+"\nMarks:"+marks);
}
public static void main (String args[])
{
Student s=new Student(143,"Vrushali",22);
s.display();
}
}

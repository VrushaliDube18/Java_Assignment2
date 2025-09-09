import java.util.*;
public class Employee
{
int employee_id;
String name;
int salary;
public Employee(int id,String n,int sal)
{
 employee_id=id;
 name=n;
 salary=sal;
 System.out.println("Employee_id:"+employee_id+"Name:"+name+"Salary"+salary);
}

public Employee(Employee a)
{
employee_id=a.employee_id;
name=a.name;
salary= a.salary;
System.out.println("Employee_id:"+employee_id+"\nName:"+name+"\nSalary"+salary);
}
public static void main(String args[])
{
Employee e=new Employee(143,"Vrushali",2500);
Employee e1=new Employee(e);
}
}

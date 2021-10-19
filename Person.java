class Person{
protected String name;
protected String sureName;
public Person(){
name= "nandini";
sureName="Palai";
}
public Person(String n, String sn)
{
name=n;
sureName=sn;
}
public Person(Person p){
name=p.name;
sureName=p.sureName;
}
public void show(){
System.out.println("name ="+name);
System.out.println("sureName ="+sureName);
}
}
class ContactInfo extends Person{
protected int phone;
public ContactInfo(){
phone=1234;
}

public ContactInfo(String name,String sureName,int phone){
super(name,sureName);
this.phone=phone;
}
public ContactInfo(ContactInfo ci){
super(ci);
phone=ci.phone;
}
public void show()
{
super.show();
System.out.println("phone number="+phone );
}
}
class Employee extends ContactInfo{
protected int salary;
public Employee(){
salary=20000;
}
public Employee(String name,String sureName,int phone,int salary){
super(name,sureName,phone);
this.salary=salary;
}
public Employee(Employee emp){
super(emp);
salary=emp.salary;
}
public void show()
{
super.show();
System.out.println("salary ="+salary);
}
}
class Office{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee("swati","gupta",567890,20000);
Employee e3=new Employee(e2);
System.out.println("first employee is");
e1.show();
System.out.println("\nSecond employee is");
e2.show();
System.out.println("\nThird employee is");
e3.show();
}
}


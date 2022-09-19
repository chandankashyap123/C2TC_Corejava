package com.tns.assignment2;
public class Assignment_State
{
   public void methodAssignment_State()
   {
     System.out.println("state method");
   }
}
class city extends Assignment_State
{
public void methodcity()
{
System.out.println("city method");
}
}
class district extends city
{
   public void methoddistrict()
   {
     System.out.println(" district method");
   }
   public static void main(String args[])
   {
     district obj = new district();
     obj.methodAssignment_State(); //calling super class method
     obj.methodcity(); //calling sub class1 method
     obj.methoddistrict(); //calling sub class2 method
  }
}
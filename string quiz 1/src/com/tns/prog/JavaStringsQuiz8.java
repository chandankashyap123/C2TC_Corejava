package com.tns.prog;

public class JavaStringsQuiz8
{
    public static void main(String[] args)
    {
        String str1 = "Java";
         
        String str2 = new String("Java");
         
        System.out.println(str1 == str2);
         
        System.out.println(str1.equals(str2));
         
        System.out.println(str1.hashCode() == str2.hashCode());
    }
}

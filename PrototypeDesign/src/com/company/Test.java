package com.company;

import java.io.*;

public class Test {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Student Roll Number");
        int roll_Number = Integer.parseInt(br.readLine());
        System.out.println();

        System.out.println("Enter the name of the student");
        String name = br.readLine();
        System.out.println();

        System.out.println("Enter the branch of the student");
        String branch = br.readLine();
        System.out.println();

        System.out.println("Enter the section of the student");
        String section = br.readLine();
        System.out.println();

        System.out.println("Enter the Gpa of the student");
        double gpa = Double.parseDouble(br.readLine());
        System.out.println();

        Student s1 = new Student(roll_Number,name,branch,section,gpa);

        s1.viewStudentDetails();
        System.out.println();

        Student s2 = (Student) s1.objectClone();

        System.out.println("Do you want to modify the student details");
        System.out.println("1 = Yes  2 = No");
        int response = Integer.parseInt(br.readLine());
       if(response == 1)
            s2.modifyStudentDetails();
        s2.viewStudentDetails();





    }

}

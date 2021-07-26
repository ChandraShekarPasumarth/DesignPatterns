package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Student<roll_Number> implements Prototpe{

    private int roll_Number;
    private String name,branch,section;
    private double gpa;
    Scanner scanner = new Scanner(System.in);
    public Student(int roll_Number,String name,String branch,String section,double gpa){

        this.roll_Number = roll_Number;
        this.name = name;
        this.branch = branch;
        this.section = section;
        this.gpa = gpa;
    }

    @Override
    public Prototpe objectClone() {

        return new Student(roll_Number,name, branch,section,gpa);
    }
    public void viewStudentDetails(){
        System.out.println("Student Id :"+"\t"+roll_Number+"\t"+"Student Name :"+"\t"+name+"\t"+"Branch :"+"\t"+branch+"\t"+"Section :"+"\t"+section+"\t"+"GPA :"+"\t"+gpa);

    }


    public void modifyStudentDetails() throws IOException {

        System.out.println("Do you want to modify the Student Details");
        System.out.println("1 = Yes  2 = No");
        int response = scanner.nextInt();
       //Modifying the name
        System.out.println("Do you want to modify the roll Number");
        System.out.println("1 = Yes  2 = No");
        int responseRoll =scanner.nextInt();
        if(responseRoll == 1){
            System.out.println("Enter the roll number");
            this.roll_Number = scanner.nextInt();
        }

        //Modifying the Name
        System.out.println("Do you want to modify the name");
        System.out.println("1 = Yes  2 = No");
        int responseName = scanner.nextInt();
        if(responseName == 1){
            System.out.println("Enter the name");
            this.name = scanner.next();
        }

        //Modifying the Branch

        System.out.println("Do you want to modify the branch");
        System.out.println("1 = Yes  2 = No");
        int responseBranch = scanner.nextInt();
        if(responseBranch == 1){
            System.out.println("Enter the branch");
            this.branch =scanner.next();
        }

        //Modifying the section
        System.out.println("Do you want to modify the section");
        System.out.println("1 = Yes  2 = No");
        int responseSection = scanner.nextInt();
        if(responseSection == 1){
            System.out.println("Enter the section");
            this.section = scanner.next();
        }

        //Modifying the Gpa
        System.out.println("Do you want to modify the Gpa");
        System.out.println("1 = Yes  2 = No");
        int responseGpa = scanner.nextInt();
        if(responseGpa == 1){
            System.out.println("Enter the GPA");
            this.gpa = scanner.nextDouble();
        }

    }
}

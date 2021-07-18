package com.company;


public class Student implements Prototpe{
    private int roll_Number;
    private String name,branch,section;
    private double gpa;

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

}

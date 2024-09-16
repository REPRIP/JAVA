package ques9;

class Student {
    private String name;
    private String program;
    private String department;

    public Student(String name, String program, String department) {
        this.name = name;
        this.program = program;
        this.department = department;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Department: " + department);
    }
}
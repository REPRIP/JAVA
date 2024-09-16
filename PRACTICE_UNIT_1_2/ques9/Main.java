package ques9;

public class Main {
    public static void main(String[] args) {
        // Create Shiv Nadar University object
        String[] departments = {"Artificial Intelligence and Data Science", "Internet of Things and Cyber Security"};
        String[] programs = {"B.Tech", "M.Tech", "Ph.D"};
        SNU university = new SNU("Shiv Nadar University Chennai", departments, programs);
        university.displayUniversityInfo();

        // Create Teaching Staff objects
        TeachingStaff teachingAssistant = new TeachingStaff("John", "Teaching Assistant", "Artificial Intelligence and Data Science");
        TeachingStaff assistantProfessor = new TeachingStaff("John", "Assistant Professor", "Internet of Things");
        TeachingStaff Professor = new TeachingStaff("John", "Assistant Professor", "Cyber Security");
        teachingAssistant.displayStaffInfo();
        assistantProfessor.displayStaffInfo();
        Professor.displayStaffInfo();

        // Create Non-Teaching Staff objects
        NonTeachingStaff administrativeStaff = new NonTeachingStaff("John", "Administrative Staff", "HR");
        NonTeachingStaff hrStaff = new NonTeachingStaff("John", "HR Staff", "HR");
        administrativeStaff.displayStaffInfo();
        hrStaff.displayStaffInfo();

        // Create Student objects
        Student student1 = new Student("John", "B.Tech", "Artificial Intelligence and Data Science");
        Student student2 = new Student("John", "M.Tech", "Internet of Things");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}

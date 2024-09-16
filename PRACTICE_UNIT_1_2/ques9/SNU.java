package ques9;

class SNU extends University {
    private String[] departments;
    private String[] programs;

    public SNU(String name, String[] departments, String[] programs) {
        super(name);
        this.departments = departments;
        this.programs = programs;
    }

    @Override
    public void displayUniversityInfo() {
        System.out.println("University Name: " + super.getName());
        System.out.println("Departments: ");
        for (String department : departments) {
            System.out.println(department);
        }
        System.out.println("Programs: ");
        for (String program : programs) {
            System.out.println(program);
        }
    }
}


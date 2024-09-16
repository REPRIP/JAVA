package ques9;

class NonTeachingStaff extends Staff {
    private String department;

    public NonTeachingStaff(String name, String designation, String department) {
        super(name, designation);
        this.department = department;
    }

    @Override
    public void displayStaffInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Designation: " + super.getDesignation());
        System.out.println("Department: " + department);
    }
}


package ques9;

abstract class Staff {
    private String name;
    private String designation;

    public Staff(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public abstract void displayStaffInfo();
}


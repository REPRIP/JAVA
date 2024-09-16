package ques9;

abstract class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayUniversityInfo();
}

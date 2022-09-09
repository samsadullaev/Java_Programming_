package day36_custom_classes;

public class Employee {
    String name;
    long id;
    String jobTitle;
    double salaray;

    public Employee(String name, long id, String jobTitle, double salaray) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salaray = salaray;
    }

    public void goToMeeting(){
        System.out.println(name + " is going to the meeting");


    }

    @Override
    public String toString() {
        return "day36_custom_classes{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salaray=" + salaray +
                '}';
    }



}

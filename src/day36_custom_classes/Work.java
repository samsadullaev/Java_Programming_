package day36_custom_classes;

public class Work {
    public static void main(String[] args) {

        Employee james = new Employee("James Bond", 7, "spy", 10_000_000);
        james.goToMeeting();
        System.out.println(james);


        System.out.println("-------------------------------------------");

        EmployeeV2 work = new EmployeeV2("james", 7);
        System.out.println(work);

        Employee[] arr = new Employee[3];
        arr[0] = james;


    }
}

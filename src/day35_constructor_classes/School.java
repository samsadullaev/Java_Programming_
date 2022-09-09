package day35_constructor_classes;

public class School {

    String name;
    int totalNumOfStudents;
    double avgGpa;

    public School(String name, int totalNumOfStudents, double avgGpa) {
        this.name = name;
        this.totalNumOfStudents = totalNumOfStudents;
        this.avgGpa = avgGpa;

    }

    // both is the same but ^ is more used for clarification
 //   public School(String inputName, int inputStudents, double inputGpa){
        //name = inputName;
       // totalNumOfStudents = inputStudents;
     //   avgGpa = inputGpa;
   // }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", totalNumOfStudents=" + totalNumOfStudents +
                ", avgGpa=" + avgGpa +
                '}';
    }
}

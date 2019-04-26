package Assignment02;

public class Main {
    public static void main(String args[]){
        PersonModel<Student> studentPersonModel = new PersonModel<>();
        studentPersonModel.add(new Student(1, "Khanh", 22));
        studentPersonModel.add(new Student(2, "Hang",19 ));
        studentPersonModel.input();
        PersonModel<Employee> employeePersonModel = new PersonModel<>();
        employeePersonModel.add(new Employee(3, "Dong", "20.000.000"));
        employeePersonModel.add(new Employee(4, "Thanh","10.000.000" ));
        employeePersonModel.input();
    }

}

package Assignment02;

public class Employee <K,V,N>{
    public K ID;
    public V Name;
    public N Salary;

    public Employee(K ID, V name, N salary) {
        this.ID = ID;
        Name = name;
        Salary = salary;
    }

    public K getID() {
        return ID;
    }

    public V getName() {
        return Name;
    }

    public N getSalary() {
        return Salary;
    }

    public void setID(K ID) {
        this.ID = ID;
    }

    public void setName(V name) {
        Name = name;
    }

    public void setSalary(N salary) {
        Salary = salary;
    }
@Override
    public String toString(){
        return "Employee information:"+ this.ID + "/n"
                                    + this.Name +"/n"
                                    + this.Salary;
}
}

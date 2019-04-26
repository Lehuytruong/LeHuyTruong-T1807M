package Assignment02;

public class Student <K,V,N>{
    public K ID;
    public V Name;
    public N Age;

    public Student(K ID, V name, N age) {
        this.ID = ID;
        Name = name;
        Age = age;
    }

    public K getID() {
        return ID;
    }

    public V getName() {
        return Name;
    }

    public N getAge() {
        return Age;
    }

    public void setID(K ID) {
        this.ID = ID;
    }

    public void setName(V name) {
        Name = name;
    }

    public void setAge(N age) {
        Age = age;
    }
    public String toString() {
        return "Student information:" + this.ID + "/n"
                + this.Name + "/n"
                + this.Age;
    }
}

package Assignment07;

import java.io.Serializable;

public class Student implements Serializable {
    int ID;
    String Name;
    byte Age;
    String Address;
    float Gpa;

    public Student(){

    }
    public Student(int ID, String Name, byte Age, String Address, float Gpa){
        super();
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.Gpa = Gpa;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public byte getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }

    public float getGpa() {
        return Gpa;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(byte age) {
        Age = age;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setGpa(float gpa) {
        Gpa = gpa;
    }
}


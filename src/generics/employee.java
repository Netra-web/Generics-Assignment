package generics;

import java.util.HashSet;

public class employee {
	int id,salary;
    String name,dept;
    public employee(int id, String name, int salary, String dept){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    @Override
    public String toString(){
        return "{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}";
    }
    @Deprecated
    public void displayDetails(){
        System.out.println("{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}");
    }

}

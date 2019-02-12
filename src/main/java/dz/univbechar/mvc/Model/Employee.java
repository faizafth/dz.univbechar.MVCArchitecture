package dz.univbechar.mvc.Model;

public class Employee {
    String empName,empld;


    String getEmpName(){
        return empName;
    }
    public String getEmpld(){
        return empld;
    }
    Employee(String empName,String empld){
        this.empName=empName;
        this.empld=empld;
    }
    @Override
    public String toString(){
        return null;

    }
    boolean equals( String Object){
        return false;

    }
}

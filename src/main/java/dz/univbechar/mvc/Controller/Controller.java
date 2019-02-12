package dz.univbechar.mvc.Controller;
import dz.univbechar.mvc.Model.Employee;
public interface Controller {

    void displayEnrolledEmployees();
    void addEmployee(Employee e);
    void removeEmployee(String st);
}

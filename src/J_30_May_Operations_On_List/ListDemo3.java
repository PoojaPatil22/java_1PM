package J_30_May_Operations_On_List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 30-05-2017.
 */
class Employee
{
    public int empId;
    public String eName;

    public Employee() {
    }

    public Employee(int empId, String eName) {
        this.empId = empId;
        this.eName = eName;
    }

    public int getEmpId() {
        return empId;
    }

    public String geteName() {
        return eName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    @Override
    public String toString() {
        return empId + " " + eName;
    }
}

public class ListDemo3 {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee(101, "Harshad");
        employeeList.add(e1);

        employeeList.add(new Employee(102, "Rupesh"));
        employeeList.add(new Employee(102, "Rupesh"));
        employeeList.add(new Employee(103, "Amit"));

        System.out.println("\n\t All Employees :" + employeeList);

        Employee emp = employeeList.get(3);
        System.out.println("\n\t Employee : " + emp);
    }
}

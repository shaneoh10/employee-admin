/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeadministration;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Shane O'Hanlon - sba22095
 */

public class Company {
    // declare instance fields with defaults
    private String companyName = "default";
    private ArrayList<Employee> staff = new ArrayList<Employee>();
    
    // constructor to initialise fields with companyName passed as parameters
    public Company(String companyName) {
        this.companyName = companyName;
    }
    
    // constructor to initialise fields with default values
    public Company() {
       System.out.println("A new Company has been created.");
    }
    
    // setter method to add an Employee object to the staff ArrayList
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }
    
    // getter method to return number of staff in company
    public int getStaffNumber() {
        return staff.size();
    }
    
    // getter method which prints a list of employees in the staff ArrayList if
    // their employee number is greater than the parameter passed to the function
    public void listEmployees(int employeeNumber) {
        // create iterator for staff ArrayList
        Iterator<Employee> iterator = staff.iterator();
        
        // while loop which iterates through employees in staff arraylist using iterator
        while(iterator.hasNext()) {
            Employee emp = iterator.next();
            // print name to terminal if empNum is greater than employeeNumber parameter
            if (emp.getEmpNum() > employeeNumber) {
                System.out.println(emp.getName());
            }
        }
    }
    
}

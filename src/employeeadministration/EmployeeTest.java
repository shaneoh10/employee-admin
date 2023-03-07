/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shane O'Hanlon - sba22095
 */

/*
 Advantages of using an ArrayList over an Array:
    - ArrayLists have a set of methods that make it easy to modify and retrieve data
    - ArrayLists are dynamic in size so you don't need to choose a size when creating the list and objects can easily be added or removed
    - ArrayLists can store objects of any data type whereas arrays are limited to a specific data type when created
*/

package employeeadministration;


public class EmployeeTest {

    public static void main(String[] args) {
        // create the employees for testing the program
        Employee employee1 = new Employee("Joe Bloggs", "jb@gmail.com");        
        Employee employee2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee employee3 = new Employee("Tom Thumb", "tt@gmail.com");

        // declare array to store employees and load objects to array
        Employee[] projectGroup = new Employee[3];
        projectGroup[0] = employee1;        
        projectGroup[1] = employee2;
        projectGroup[2] = employee3;
        
        // Print value of nextEmpNum variable to terminal
        System.out.println("The value of nextEmpNum is: " + Employee.getNextEmpNum());
        
        // variable for searching by employee number
        int m = 2;
        
        // loop through array of employees and print name if employee number greater than search variable m
        for (Employee employee : projectGroup) {
            if (employee.getEmpNum() > m) {
                System.out.println(employee.getName());
            }
        }
        
    }
    
}

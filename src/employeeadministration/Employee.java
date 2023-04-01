package employeeadministration;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Branch 2 commit 2 */

/**
 *
 * @author Shane O'Hanlon - sba22095
 */

public class Employee {
    // declare instance fields with defaults
    private String name = "default";
    private String email = "default@email.com";
    private int empNum;
    
    // declare next employee number variable which will automatically increment
    private static int nextEmpNum = 1;
    
    // constructor to initialise name and email fields with values passed as parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum;
        // increment employee number for next object
        nextEmpNum ++;
    }
    
    // constructor to initialise name and email instance fields with default values
    public Employee(){
        System.out.println("A new Employee has been created.");
        this.empNum = nextEmpNum;
        // increment employee number for next object
        nextEmpNum ++;
    }
    
    // getter method to return employee name
    public String getName() {
        return name;
    }
    
    // getter method to return employee email
    public String getEmail() {
        return email;
    }
    
    // getter method to return employee number
    public int getEmpNum() {
        return empNum;
    }
    
    // static getter method returns the current value of nextEmpNum
    public static int getNextEmpNum() {
        return nextEmpNum;
    }
   
    // setter method to update employee email
    public void setEmail(String newEmail) {
        // check if new email is longer than 3 characters - if ok set new email else alert user
        if (newEmail.length() > 3) {
            this.email = newEmail;
        } else {
            System.out.println("Email address must be longer than 3 characters.");
        }
    }
}

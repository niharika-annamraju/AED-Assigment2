/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nihar
 */
public class EmployeeHistory {
    private ArrayList<Employee> empHistory;
    
    public EmployeeHistory(){
        this.empHistory = new ArrayList<Employee>();
    }
    
    public ArrayList<Employee> getEmpHistory(){
        return empHistory;
    }
    
    public void setEmpHistory(ArrayList<Employee> empHistory){
        this.empHistory = empHistory;
    }
    
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        empHistory.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(Employee e){
        empHistory.remove(e);
    }
}

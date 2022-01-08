package com.melnikov.spring.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String department;
    private String carBrand;
    private Map<String, String> carsList;
    private String[] languages;

    public Employee() {
        carsList = new LinkedHashMap<>();
        carsList.put("BMW", "BMW");
        carsList.put("Toyota", "Toyota");
        carsList.put("VW", "Volkswagen");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public Map<String, String> getCarsList() {
        return carsList;
    }

    public void setCarsList(Map<String, String> carsList) {
        this.carsList = carsList;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

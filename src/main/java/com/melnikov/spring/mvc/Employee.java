package com.melnikov.spring.mvc;

import com.melnikov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "Name must be 2 symbols min")
    private String name;

    @NotBlank(message = "surname is required")
    private String surname;

    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1000, message = "must be less than 1001")
    private int salary;

    private String department;

    private String carBrand;

    private Map<String, String> carsList;

    private String[] languages;

    @Pattern(regexp = "\\d-\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "please use pattern: X-XXX-XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail//(value = "mail.ru", message = "must ends with mail.ru")
    private String email;



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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

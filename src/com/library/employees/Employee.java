package com.library.employees;

import com.library.model.Library;

public abstract class Employee {

    private String name;
    private int password;
    private Library library;

    public Employee(String name, int password) {
        this.name = name;
        this.password = password;
    }
    public Employee(Library library){
        this.library = library;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    public Library getLibrary() {
        return library;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}

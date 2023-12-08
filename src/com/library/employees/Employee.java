package com.library.employees;

import com.library.services.Library;

public abstract class Employee {

    private String name;
    private Library library;

    public Employee(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    public String getName() {
        return name;
    }



    public Library getLibrary() {
        return library;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +

                '}';
    }
}

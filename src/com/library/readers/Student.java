package com.library.readers;

public class Student extends Reader{

    public Student(long memberId, String name) {
        super(memberId, name);
    }


    public String toString() {
        return "Student member ID: " + getMemberId() +  " Name: " + getName();
    }

}

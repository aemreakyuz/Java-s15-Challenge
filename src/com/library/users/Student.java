package com.library.users;

import com.library.users.Member;


public class Student extends Member {

    public Student( String name) {
        super( name);
    }


    public String toString() {
        return "Student member ID: " + getMemberId() +  " Name: " + getName();
    }

}

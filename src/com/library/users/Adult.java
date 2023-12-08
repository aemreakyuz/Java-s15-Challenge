package com.library.users;

public class Adult extends Member {

    public Adult(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Adult Member ID: " + getMemberId() + " Name: " + getName();
    }
}

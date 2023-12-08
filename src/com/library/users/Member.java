package com.library.users;

import com.library.books.Book;
import com.library.services.Invoice;
import com.library.services.InvoiceService;

import java.util.ArrayList;

public abstract class Member {

    public static long currentID = 0;
    private long memberId;
    private String name;
    private double currentMoney;
    private ArrayList<Invoice> invoices;

    public Member(String name) {
        this.memberId = currentID++;
        this.name = name;
        this.invoices = new ArrayList<>();
    }

    public long getMemberId() {
        return memberId;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(double currentMoney) {
        this.currentMoney = currentMoney;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Reader{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                '}';
    }
}

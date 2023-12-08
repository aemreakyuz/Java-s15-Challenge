package com.library.services;

import com.library.books.Book;
import com.library.users.Member;

import java.time.LocalDate;

public class InvoiceService {

    public static Invoice createInvoice(Book book, Member user){
        return new Invoice(book, user);
    }

    public static double returnInvoice(Invoice invoice ){
        LocalDate currentDate = LocalDate.now();
        if(currentDate.isAfter(invoice.getDueDate())){
            double fee = calculateFee(invoice);
           double returnMoney = invoice.getPrice() - fee;
           if(returnMoney<0){
               return 0;
           }
           else{
               return invoice.getPrice() - fee;
           }

        }
        else{
            return invoice.getPrice();
        }
    }

    public static double calculateFee(Invoice invoice){
        long daysLate = LocalDate.now().toEpochDay() - invoice.getDueDate().toEpochDay();
        return daysLate * 1.2;
    }




}

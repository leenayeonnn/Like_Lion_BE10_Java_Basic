package com.example.day06.main;

import com.example.day06.domain.Book;
import com.example.day06.domain.Parent;

public class Test6 {
    public static void main(String[] args) {
        Parent p = new Parent();

        System.out.println(p.toString());
        System.out.println(p);

        ///// toString 오버라이드
        Book book = new Book();

        book.title = "모두의 자바";

        System.out.println(book.toString());
        System.out.println(book);
    }
}

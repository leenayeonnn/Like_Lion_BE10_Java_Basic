package com.example.day06.main;

import com.example.day06.domain.Child;
import com.example.day06.domain.Parent;

public class Test3 {
    public static void main(String[] args) {
        Parent parent = new Child();
        Object obj = new Child();
        Object obj2 = new Parent();

//        Child child = obj;

        Object obj3 = new Object();

        if (obj3 instanceof Child) {
            Child child = (Child) obj3;
        }

        //////////////////////////////
        Object objParent = new Parent();
        Object objChild = new Child();
        Parent parentChild = new Child();

        methodObj(objParent);
        methodObj(objChild);
        methodObj(parentChild);

        methodParent((Parent) objParent);
        methodParent((Parent) objChild);
        methodParent(parentChild);

        //methodChild((Child) objParent);
        methodChild((Child) objChild);
        methodChild((Child)parentChild);
    }

    public static void methodObj(Object obj) {
    }

    public static void methodParent(Parent parent) {
    }

    public static void methodChild(Child child) {
    }
}

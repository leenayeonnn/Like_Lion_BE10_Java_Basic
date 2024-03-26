package com.example.day06.domain;

import java.util.Objects;

public class Pen {
    int amountOfInk;
    String color;

    public Pen(int amountOfInk, String color) {
        this.amountOfInk = amountOfInk;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "amountOfInk=" + amountOfInk +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return amountOfInk == pen.amountOfInk && Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfInk, color);
    }
}

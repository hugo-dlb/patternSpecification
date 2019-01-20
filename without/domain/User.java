package domain;

import domain.Grade;

public class User {

    public String name;
    public Grade grade;

    public User(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public String toString() {
        return this.name;
    }
}
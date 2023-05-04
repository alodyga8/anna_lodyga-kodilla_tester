package com.kodilla.abstracts.homework;

public class JobApp {
    public static void main(String[] args) {
        Person john = new Person("John",30, new Teacher(4500, "teaches children." ));

        System.out.println("Name: " + john.getFirstName());
        System.out.println("Age: " + john.getAge());
        System.out.println("Job title: " + john.getJob());
        System.out.println("Salary: " + john.job.getSalary());
        System.out.println("Responsibilities: " + john.job.getResponsibilities());





        Job teacher = new Teacher(4500,"teaches children.");
        System.out.println("Teacher earns " + teacher.getSalary() + " and " + teacher.getResponsibilities());

        Job policeman = new Policeman(6000, "catches criminals.");
        System.out.println("Policeman earns " + policeman.getSalary() + " and " + policeman.getResponsibilities());

        Job vet = new Vet(8000, "treats animals.");
        System.out.println("Vet earns " + vet.getSalary() + " and " + vet.getResponsibilities());


    }
}

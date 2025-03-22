package com.kashfabbas;

import com.kashfabbas.TextBox;

// UML = Unified Modeling Language it's a simple visual language use to show classes and there relationships
public class Main {
  public static void main(String[] args) {
//    TextBox textBox1 = new TextBox(); // creating new instance of TextBox class
    var textBox1 = new TextBox();
//    textBox1.setText("Box 1");
//    System.out.println(textBox1.text.toUpperCase());

//    var textBox2 = new TextBox(); // Objects are completely independent of each other they have different data, different state
//    textBox2.setText("Box 2");
//    System.out.println(textBox2.text);

    // Memory Allocation
    var textBox2 = textBox1;
    textBox2.setText("Hello World");
    System.out.println(textBox2.text);

    // Procedural Programming
//    int baseSalary = 50_000;
//    int extraHours = 10;
//    int hourlyRate = 20;

//    int wage = calculateWage(baseSalary, extraHours, hourlyRate);
//    System.out.println(wage);

    // Encapsulation
//    var employee = new Employee();
    // CONSTRUCTOR
    var employee = new Employee(50_000, 20);

    // CONSTRUCTOR OVERLOADING
//    new Employee(10_000);
//    employee.baseSalary = 50_000;
//    employee.setBaseSalary(50_000);
    int baseSalary = employee.getBaseSalary();
    System.out.println(baseSalary);
//    employee.hourlyRate = 20;
//    employee.setHourlyRate(20);
    int hourlyRate = employee.getHourlyRate();
    System.out.println(hourlyRate);

    // Static Members
    System.out.println(Employee.numberOfEmployees);   // field

    Employee.printNumberOfEmployees();    // method

//    int wage = employee.calculateWage(10);
    // OVERLOADING
    int wage = employee.calculateWage();    // Employee not works on extraHour
    System.out.println(wage);

    // Coupling
    // Main class is depend on the employee class

    // Reducing Coupling
    var browser = new Browser();
    browser.navigate("...");
  }

//  public static int calculateWage(
//    int baseSalary,
//    int extraHours,
//    int hourlyRate
//  ) {
//    return baseSalary + (extraHours * hourlyRate);
//  }
}
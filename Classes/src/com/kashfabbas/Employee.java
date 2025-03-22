package com.kashfabbas;

public class Employee {
  // This is Encapsulation
//  public int baseSalary;    // Only blueprint
  private int baseSalary;
  private int hourlyRate;     // Access modifier is private because getter, setter use
//  public int extraHours;
  public static int numberOfEmployees;

  public Employee(int baseSalary, int hourlyRate) {   // After constructor setter method is public to private this is beautiful for Object-oriented programming
//    this.baseSalary = baseSalary;
//    this.hourlyRate = hourlyRate;
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
    numberOfEmployees++;
  }

  public static void printNumberOfEmployees() {
    System.out.println(numberOfEmployees);
  }

  public Employee(int baseSalary) {
//    setBaseSalary(baseSalary);
//    setHourlyRate(0);
    this(baseSalary, 0);
  }

  public int calculateWage(int extraHours) {
    return baseSalary + (hourlyRate * extraHours);
  }

  // METHOD OVERLOADING
  public int calculateWage() {
      return calculateWage(0);
    }

  private void setBaseSalary(int baseSalary) {
    if (baseSalary <= 0)
      throw new IllegalArgumentException("Salary cannot be 0 or less.");
    this.baseSalary = baseSalary;
  }

  public int getBaseSalary() {
    return baseSalary;
  }

  private void setHourlyRate(int hourlyRate) {
    if (hourlyRate <= 0)
      throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
    this.hourlyRate = hourlyRate;
  }

  public int getHourlyRate() {
    return hourlyRate;
  }

}

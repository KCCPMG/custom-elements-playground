package com.example.models;

public class Dog {
  public String name;
  public String breed;
  public int age;

  public Dog(String name, String breed, int age) {
    this.name = name;
    this.breed = breed;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public String getBreed() {
    return this.breed;
  }

  public int getAge() {
    return this.age;
  }
}
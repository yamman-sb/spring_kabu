package com.example.spring_kabu.persistence.entity;

public class Stock {
  private Integer id;
  private String  name;

  public Stock() {}

  public Stock(String name) {
    this.name = name;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Stock{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}

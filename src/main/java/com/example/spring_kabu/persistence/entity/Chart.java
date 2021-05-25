package com.example.spring_kabu.persistence.entity;

import java.time.LocalDate;
import java.util.Date;

public class Chart {
  private Integer id;
  private LocalDate plotDate;
  private Integer price;
  private Integer stockId;

  public Chart(Date nowTime, int price, Integer id) {}

  public Chart(LocalDate plotDate,Integer price, Integer stockId) {
    this.plotDate  = plotDate;
    this.price     = price;
    this.stockId   = stockId;
  }

  public Integer getId() {
    return id;
  }

  public void setPlotDate(LocalDate plotDate) {
    this.plotDate = plotDate;
  }
  public LocalDate getPlotDate() {
    return plotDate;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }
  public Integer getPrice() {
    return price;
  }

  public void setStockId(Integer stockId) {
    this.stockId = stockId;
  }
  public Integer getStockId() {
    return stockId;
  }

  @Override
  public String toString() {
    return "Chart{" +
        "id=" + id +
        ", plotDate=" + plotDate +
        ", stockId=" + stockId +
        '}';
  }
}

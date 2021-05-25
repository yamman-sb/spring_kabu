package com.example.spring_kabu.service;

import com.example.spring_kabu.persistence.entity.Stock;

import java.util.List;

public interface StockService {
  List<Stock> findAll();
  Stock showStock(Integer searchId);
}

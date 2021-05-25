package com.example.spring_kabu.service;

import com.example.spring_kabu.persistence.entity.Chart;

import java.util.List;

public interface ChartService {
  List<Chart> findLimitFive(Integer searchStockId);
  void insert(Chart chart);
}

package com.example.spring_kabu.service.impl;


import com.example.spring_kabu.persistence.entity.Stock;
import com.example.spring_kabu.persistence.mapper.StockMapper;
import com.example.spring_kabu.service.StockService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {
  private final StockMapper stockMapper;

  public StockServiceImpl(StockMapper stockMapper) { this.stockMapper = stockMapper; }

  @Override
  @Transactional(readOnly = true)
  public List<Stock> findAll() {
    List<Stock> stockList = stockMapper.findAll();
    return stockList;  }

  @Override
  @Transactional(readOnly = true)
  public Stock showStock(Integer searchId) {
    return stockMapper.showStock(searchId);
  }
}

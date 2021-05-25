package com.example.spring_kabu.service.impl;

import com.example.spring_kabu.persistence.entity.Chart;
import com.example.spring_kabu.persistence.mapper.ChartMapper;
import com.example.spring_kabu.service.ChartService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ChartServiceImpl implements ChartService {
  private final ChartMapper chartMapper;

  public ChartServiceImpl(ChartMapper chartMapper) {
    this.chartMapper = chartMapper;
  }

  @Override
  @Transactional(readOnly = true)
  public List<Chart> findLimitFive(Integer searchStockId) {
    return chartMapper.findLimitFive(searchStockId);
  }

  @Override
  @Transactional(readOnly = false)
  public void insert(Chart chart) { chartMapper.insert(chart);}


}

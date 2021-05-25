package com.example.spring_kabu.batch;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import com.example.spring_kabu.persistence.entity.Chart;
import com.example.spring_kabu.persistence.entity.Stock;
import com.example.spring_kabu.service.ChartService;
import com.example.spring_kabu.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ChartBatch {
//  private static final Logger log = LoggerFactory.getLogger(ChartBatch.class);
//  private static final SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss");

  private final StockService stockService;
  private final ChartService chartService;

  public ChartBatch(StockService stockService, ChartService chartService) {
    this.stockService = stockService;
    this.chartService = chartService;
  }

  @Scheduled(cron="*/5 * * * * *")
  public void plotChart() {
    LocalDate localDate = LocalDate.now();
    List<Stock> stocks = stockService.findAll();
    Random rand = new Random();

    int price = rand.nextInt(500);

    for (Stock stock : stocks) {
      Chart chart = new Chart(localDate, price, stock.getId());
      chartService.insert(chart);
    }
  }
}

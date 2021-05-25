package com.example.spring_kabu.web.controller;

import com.example.spring_kabu.persistence.entity.Chart;
import com.example.spring_kabu.service.ChartService;
import com.example.spring_kabu.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/stock/{stockId}")
public class ChartController {
  private final StockService stockService;
  private final ChartService chartService;

  public ChartController(StockService stockService, ChartService chartService) {
    this.stockService = stockService;
    this.chartService = chartService;
  }

  @RequestMapping("/index")
  public String index(@PathVariable("stockId") Integer stockId, Model model) {
    List<Chart> chartList = chartService.findLimitFive(stockId);
    model.addAttribute("chartList", chartList);
    model.addAttribute("stock", stockService.showStock(stockId));
    return "/chart/index";
  }

}

package com.example.spring_kabu.web.controller;

import com.example.spring_kabu.persistence.entity.Stock;
import com.example.spring_kabu.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stock")
public class StockController {
  private final StockService stockService;

  public StockController(StockService stockService) {
    this.stockService = stockService;
  }

  @GetMapping("/index")
  public String index(Model model) {
    List<Stock> stockList = stockService.findAll();
    model.addAttribute("stockList", stockList);
    return "stock/index";
  }
}

package com.example.spring_kabu.persistence.mapper;


import com.example.spring_kabu.persistence.entity.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StockMapper {
  @Select("SELECT id, name FROM stock ")
  List<Stock> findAll();

  @Select("SELECT id, name FROM stock " +
      "WHERE id=#{searchId}")
  Stock showStock(Integer searchId);

}

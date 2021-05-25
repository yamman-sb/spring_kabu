package com.example.spring_kabu.persistence.mapper;

import com.example.spring_kabu.persistence.entity.Chart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ChartMapper {
  @Select("SELECT id, plot_date, price, stock_id FROM chart "+
      "WHERE stock_id=#{stockId} " +
      "ORDER BY id DESC "+
      "LIMIT 5 ")
  List<Chart> findLimitFive(Integer stockId);

  @Insert("INSERT INTO chart VALUES(NULL, #{plotDate}, #{price}, #{stockId})")
  void insert(Chart chart);

}

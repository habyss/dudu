package com.love.dudu.mapper;

import com.love.dudu.entity.WeatherConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WeatherConfigMapper {

    int insertSelective(WeatherConfig record);

    int updateByPrimaryKey(WeatherConfig record);

    WeatherConfig getOneByType(@Param("type") String type);

    List<WeatherConfig> getAllByType(@Param("type") String type);

    WeatherConfig getSubject(@Param("type") String type);

    List<WeatherConfig> getAllByValue(@Param("value") String value);

}
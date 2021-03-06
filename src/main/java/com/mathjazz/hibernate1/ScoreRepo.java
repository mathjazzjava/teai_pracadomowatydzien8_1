package com.mathjazz.hibernate1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepo extends JpaRepository<Score, Long> {

    List<Score> findScoresByTemperatureIsBetween(float a, float b);
}

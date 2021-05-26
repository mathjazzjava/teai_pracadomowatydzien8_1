package com.mathjazz.hibernate1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String time;
    private float temperature;

    public Score(String time, float temperature) {
        this.id = id;
        this.time = time;
        this.temperature = temperature;
    }

    public Score() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}

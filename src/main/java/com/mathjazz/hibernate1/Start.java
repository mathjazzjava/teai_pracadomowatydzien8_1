package com.mathjazz.hibernate1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private ScoreRepo scoreRepo;

    @Autowired
    public Start(ScoreRepo scoreRepo) {
        this.scoreRepo = scoreRepo;
    }
    
    @EventListener(ApplicationReadyEvent.class)
    public void init(){

        Score score1 = new Score("12:30", 25.5F);
        Score score2 = new Score("13:30", 24.0F);
        Score score3 = new Score("14:30", 23.0F);
        Score score4 = new Score("15:30", 22.0F);
        Score score5 = new Score("16:30", 20.0F);

//        scoreRepo.save(score1);
//        scoreRepo.save(score2);
//        scoreRepo.save(score3);
//        scoreRepo.deleteById(1L);
        scoreRepo.save(score5);
        scoreRepo.findScoresByTemperatureIsBetween(21, 24).forEach(System.out::println);

    }
}

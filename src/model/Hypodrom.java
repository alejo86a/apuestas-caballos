package model;

import java.util.List;

public class Hypodrom {
    public void runBet(Race race, Bettor[] bettors, int round){
        List<Horse> resultRace = race.run();
        List<Integer> winners = null;
        double totalAmount = 0;
        double totalWinnersAmount = 0;
        for (int i = 0; i < bettors.length; i++) {
            totalAmount += bettors[i].getBetAt(round).getAmount();
            if(resultRace.get(0).getId() != bettors[i].getBetAt(round).getHorse().getId()){
                bettors[i].lostBet(round);
            } else {
                winners.add(i);
                totalWinnersAmount += bettors[i].getBetAt(round).getAmount();
            }
        }
        for (int i = 0; i < winners.size(); i++) {
            bettors[winners.get(i)].winBet(round, (bettors[winners.get(i)].getBetAt(round).getAmount()/totalWinnersAmount)*(totalAmount-totalWinnersAmount));
        }
    }
}

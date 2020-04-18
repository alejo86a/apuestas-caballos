package model;

import java.util.List;

public class Bettor {
    private String name;
    private double amount;
    private List<Bet> bets;
    private String status;

    public Bettor(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void lostBet(int round){
        Bet auxBet = this.bets.get(round);
        auxBet.setStatus("LOST");
        this.amount -= auxBet.getAmount();
    }

    public void winBet(int round, double amountOfBet){
        this.bets.get(round).setStatus("WON");
        this.amount += amountOfBet;
    }

    public Bet getBetAt(int pos) {
        return bets.get(pos);
    }

    public void addBet(Bet bet) {
        this.bets.add(bet);
    }

    public String getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }
}

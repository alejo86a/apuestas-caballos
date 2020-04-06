package model;

public class Bet {
    private Horse horse;
    private double amount;
    private String status;

    public Bet(Horse horse, double amount) {
        this.horse = horse;
        this.amount = amount;
        this.status = "not played yet";
    }

    public Horse getHorse() {
        return horse;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

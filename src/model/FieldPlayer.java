package model;

public abstract class FieldPlayer extends Player {
    protected double staminaReductionRate;

    public FieldPlayer(String name, String position, int speed, double stamina, 
    int shooting, int dribbling, int tackling, int interceptions, double staminaReductionRate) {
        super(name, position, speed, stamina, shooting, dribbling, tackling, interceptions, 0, 0);
        this.staminaReductionRate = staminaReductionRate;
    }

    // 스태미너 감소 기능
    public synchronized void reduceStamina() {
        if (stamina > 0) {
            double adjustedReduction = 0.2 + (Math.random() * (staminaReductionRate - 0.2));
            stamina -= adjustedReduction;
            if (stamina < 0) stamina = 0;
        }
    }


}

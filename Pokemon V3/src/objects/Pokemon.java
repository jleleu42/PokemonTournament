package objects;

public class Pokemon {
    private String name;
    private int lifeLevel;
    private int powerLevel;
    private String powerType;
    private String shoutBattle;
    private String shoutVictory;
    private String shoutLoose;

    public Pokemon(String name, int lifeLevel, int powerLevel, String powerType, String shoutBattle, String shoutVictory, String shoutLoose) {
        this.name = name;
        this.lifeLevel = lifeLevel;
        this.powerLevel = powerLevel;
        this.powerType = powerType;
        this.shoutBattle = shoutBattle;
        this.shoutVictory = shoutVictory;
        this.shoutLoose = shoutLoose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public String getShoutBattle() {
        return shoutBattle;
    }

    public void setShoutBattle(String shoutBattle) {
        this.shoutBattle = shoutBattle;
    }

    public String getShoutVictory() {
        return shoutVictory;
    }

    public void setShoutVictory(String shoutVictory) {
        this.shoutVictory = shoutVictory;
    }

    public String getShoutLoose() {
        return shoutLoose;
    }

    public void setShoutLoose(String shoutLoose) {
        this.shoutLoose = shoutLoose;
    }
}

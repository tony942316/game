
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private int maxHealth;
    private int health;
    private int minDamage;
    private int maxDamage;
    private String name;
    private int coins;
    private int hPotions;
    private int hFactor = 20;
    private int hitChance = 50;
    private int hCost = 150;
    private boolean sword = false;
    private int swordSTR = 0;
    public Player(int maxHealth, int minDamage, int maxDamage, int coins, String name)
    {
        this.maxHealth = maxHealth;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.coins = coins;
        this.name = name;
        health = maxHealth;
    }
    public boolean hit()
    {
        int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
        if(chance < hitChance)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public void changeMaxHealth(int x)
    {
        maxHealth += x;
    }
    public void changeHealth(int x)
    {
        health += x;
        while(health > maxHealth)
        {
            health--;
        }
    }
    public void adjHPotions(int x)
    {
        hFactor += x;
    }
    public int heal()
    {
        return 20;
    }
    public void changeCoins(int x)
    {
        coins += x;
    }
    public void changeDamage(int x)
    {
        minDamage += x;
        maxDamage += x;
    }
    public void changeHPotions(int x)
    {
        hPotions -= x;
    }
    public void changeHitChance(int x)
    {
        hitChance += x;
        hCost += 50;
    }
    public void changeSword()
    {
        sword = true;
    }
    public void changeSwordSTR()
    {
        swordSTR++;
    }
    public int getHealth()
    {
        return health;
    }
    public int doDamage()
    {
        return (int)((maxDamage - minDamage + 1) * Math.random()) + minDamage;        
    }
    public String getName()
    {
        return name;
    }
    public int getCoins()
    {
        return coins;
    }
    public int getMinDamage()
    {
        return minDamage;
    }
    public int getMaxDamage()
    {
        return maxDamage;
    }
    public int getMaxHealth()
    {
        return maxHealth;
    }
    public int getHPotions()
    {
        return hPotions;
    }
    public int getHFactor()
    {
        return hFactor;
    }
    public boolean getSword()
    {
        return sword;
    }
    public int getHitChance()
    {
        return hitChance;
    }
    public int getSwordSTR()
    {
        return swordSTR;
    }
    public int getHCost()
    {
        return hCost;
    }
    public void printStats()
    {
        System.out.println("Character Name: " + name + "\nHitpoints: " + health + "\nDamage Range: " + minDamage + "-" + maxDamage + "Hit Chance: " + hitChance + "%" + "\nMoney: " + coins + " coins" + "\nHealth Potions: " + hPotions + "\nYour heal factor is: " + hFactor);
    }
}

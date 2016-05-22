
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
    private int hitChance;
    private int level = 1;
    private int levelUpVal = 50;
    private int exp;
    public Player(int maxHealth, int minDamage, int maxDamage, int coins, int hitChance, int exp, String name)
    {
        this.maxHealth = maxHealth;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.coins = coins;
        this.hitChance = hitChance;
        this.exp = exp;
        this.name = name;
        health = maxHealth;
    }
    
    //Attack methods
    public boolean hit()
    {
        int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
        if(chance <= hitChance)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public int doDamage()
    {
        return (int)((maxDamage - minDamage + 1) * Math.random()) + minDamage;        
    }
    
    //Health
    public void changeMaxHealth(int x){maxHealth += x;}
    public void changeHealth(int x)
    {
        health += x;
        while(health > maxHealth)
        {
            health--;
        }
    }
    
    //Potions
    public void changeHFactor(int x){hFactor += x;}
    public int heal(){return 20;}
    
    //Levels
    public void changeExp(int x){exp += x;}
    public void levelUP()
    {
        exp -= levelUpVal;
        level++;
        levelUpVal += 25;
        maxHealth += 5;
        health = maxHealth;
        minDamage += 1;
        maxDamage += 1;
        hitChance += 5;
        if(hitChance > 100)
        {
            hitChance = 100;
        }
        System.out.println("Your health increased by 5, your damage incresed by 1, \nand your hit chance incresed by 5.");
    }
    
    
    //All change methods
    public void fixHitChance(){hitChance = 100;}
    public void changeHPotions(int x){hPotions -= x;}
    public void changeHitChance(int x){hitChance += x;}
    public void changeCoins(int x){coins += x;}
    public void changeDamage(int x)
    {
        minDamage += x;
        maxDamage += x;
    }
    
    //All get methods
    public int getHealth(){return health;}
    public String getName(){return name;}
    public int getCoins(){return coins;}
    public int getMinDamage(){return minDamage;}
    public int getMaxDamage(){return maxDamage;}
    public int getMaxHealth(){return maxHealth;}
    public int getHPotions(){return hPotions;}
    public int getHFactor(){return hFactor;}        
    public int getHitChance(){return hitChance;}
    public int getLevel(){return level;}
    public int getLevelUpVal(){return levelUpVal;}
    public int getExp(){return exp;}
    
    
    public void printStats()
    {
        System.out.print("Character Name: " + name);
        System.out.print("\nLevel: " + level); 
        System.out.print("\nHitpoints: " + health);
        System.out.print("\nDamage Range: " + minDamage + "-" + maxDamage);
        System.out.print("\nHit Chance: " + hitChance + "%");
        System.out.print("\nMoney: " + coins + " coins");
        System.out.print("\nHealth Potions: " + hPotions);
        System.out.print("\nYour heal factor is: " + hFactor);
        System.out.println("\nYour current exp is: " + exp + "(" + levelUpVal + ")");
    }
}

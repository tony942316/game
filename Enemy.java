
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy
{
    // instance variables - replace the example below with your own
    private int health;
    private int minDamage;
    private int maxDamage;
    private int maxHealth;
    public Enemy(int health, int minDamage, int maxDamage)
    {
        this.health = health;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        maxHealth = health;        
    }    
    public boolean hit()
    {
        int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
        if(chance > 50)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }    
    public boolean special()
    {
        return true;
    }
    public void changeHealth(int x)
    {
        health += x;
    }
    public void revive()
    {
        health = maxHealth;
    }
    public int getHealth()
    {
        return health;
    }
    public String getSPS()
    {
        return null;
    }
    public int doDamage()
    {
        return (int)((maxDamage - minDamage + 1) * Math.random()) + minDamage;        
    }
    public int drop()
    {
        return 0;
    }
    public int getSF()
    {
        return 0;
    }
}

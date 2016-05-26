
/**
 * Write a description of class Gorilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gorilla extends Enemy
{
    public Gorilla(int health, int minDamage, int maxDamage)
    {
        super(health, minDamage, maxDamage);
    }
    public boolean special()
    {
        int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
        if(chance > 75)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public int drop()
    {
        int coins = (int)((100 - 80 + 1) * Math.random()) + 80;
        return coins;
    }
    public String getName(){return "Gorilla";}
    public String getSPS()
    {
        return "CHEST POUND!!!";
    }
    public int getSF()
    {
        return (int)5;
    }
}

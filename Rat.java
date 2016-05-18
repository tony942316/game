
/**
 * Write a description of class Rat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rat extends Enemy
{
    public Rat(int health, int minDamage, int maxDamage)
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
        int coins = (int)((50 - 1 + 1) * Math.random()) + 1;
        return coins;
    }
    public String getSPS()
    {
        return "RAT SPECIAL ATTACK TOE NIBBLE!!!";
    }
    public int getSF()
    {
        return (int)1.25;
    }
}


/**
 * Write a description of class KillerChicken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KillerChicken extends Enemy
{
    public KillerChicken(int health, int minDamage, int maxDamage)
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
        int coins = (int)((50 - 30 + 1) * Math.random()) + 30;
        return coins;
    }
    public String getSPS()
    {
        return "CHICKEN SPECIAL ATTACK DEADLY \"PEEP\" OF TERROR!!!";
    }
    public int getSF()
    {
        return (int)1.25;
    }
}

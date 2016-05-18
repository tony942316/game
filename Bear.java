
/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Enemy
{
    public Bear(int health, int minDamage, int maxDamage)
    {
        super(health, minDamage, maxDamage);
    }
    public boolean special()
    {
        int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
        if(chance > 80)
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
        int coins = (int)((75 - 50 + 1) * Math.random()) + 50;
        return coins * (int)1.1;
    }
}

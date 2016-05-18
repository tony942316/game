
/**
 * Write a description of class Troll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Troll extends Enemy
{
    public Troll(int health, int minDamage, int maxDamage)
    {
        super(health, minDamage, maxDamage);
    }
    public boolean special()
    {
        int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
        if(chance > 85)
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
        int coins = (int)((75 - 60 + 1) * Math.random()) + 60;
        return coins;
    }
    public String getSPS()
    {
        return "TROLL SPECIAL ATTACK BONE CRUSHER!!!";
    }
    public int getSF()
    {
        return 3;
    }
}

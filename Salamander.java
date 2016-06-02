
/**
 * Write a description of class Salamander here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salamander extends Enemy
{
    public Salamander(int health, int minDamage, int maxDamage)
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
        int coins = (int)((150 - 100 + 1) * Math.random()) + 100;
        return coins;
    }
    public String getName(){return "Salamander";}
    public String getSPS()
    {
        return "SALAMANDER SPECIAL ATTACK FIRE BREATH!!!";
    }
    public int getSF()
    {
        return (int)3;
    }
}

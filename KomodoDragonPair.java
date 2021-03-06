
/**
 * Write a description of class KomodoDragonPair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KomodoDragonPair extends Enemy
{
    public KomodoDragonPair(int health, int minDamage, int maxDamage)
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
        int coins = (int)((290 - 250 + 1) * Math.random()) + 250;
        return coins;
    }
    public String getName(){return "KomodoDragons";}
    public String getSPS()
    {
        return "KOMODO DRAGON SPECIAL ATTACK ACID TOUCH!!!";
    }
    public int getSF()
    {
        return (int)3;
    }
}

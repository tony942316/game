
/**
 * Write a description of class Rabbit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rabbit extends Enemy
{
    public Rabbit(int health, int minDamage, int maxDamage)
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
        int coins = (int)((50 - 25 + 1) * Math.random()) + 25;
        return coins;
    }
    public String getName(){return "Rabbit";}
    public String getSPS()
    {
        return "RABBIT SPECIAL ATTACK CARROT CANON!!!";
    }
    public int getSF()
    {
        return (int)1.25;
    }
}

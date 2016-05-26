
/**
 * Write a description of class Eagle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eagle extends Enemy
{
    public Eagle(int health, int minDamage, int maxDamage)
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
    public String getName(){return "Eagle";}
    public String getSPS()
    {
        return "EAGLE SPECIAL ATTACK FREEDOM!!!";
    }
    public int getSF()
    {
        return (int)1.75;
    }
}

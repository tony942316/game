
/**
 * Write a description of class Griffin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Griffin extends Enemy
{
    public Griffin(int health, int minDamage, int maxDamage)
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
        int coins = (int)((250 - 200 + 1) * Math.random()) + 200;
        return coins;
    }
    public String getName(){return "Griffin";}
    public String getSPS()
    {
        return "GRIFFIN SPECIAL ATTACK FLYING POUNCH!!!";
    }
    public int getSF()
    {
        return (int)4;
    }
}

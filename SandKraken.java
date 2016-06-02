
/**
 * Write a description of class DesertKraken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SandKraken extends Enemy
{
    public SandKraken(int health, int minDamage, int maxDamage)
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
        int coins = (int)((300 - 270 + 1) * Math.random()) + 270;
        return coins;
    }
    public String getName(){return "SandKraken";}
    public String getSPS()
    {
        return "SAND KRAKEN BREAKS THE SPACE TIME CONTINUUM!!!";
    }
    public int getSF()
    {
        return (int)7;
    }
}

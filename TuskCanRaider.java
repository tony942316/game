
/**
 * Write a description of class TuscanRaider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TuskCanRaider extends Enemy
{
    public TuskCanRaider(int health, int minDamage, int maxDamage)
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
    public String getName(){return "Tusk Can Raider";}
    public String getSPS()
    {
        return "TUSK CAN RAIDER SCREECHES!!!";
    }
    public int getSF()
    {
        return (int)2;
    }
}


/**
 * Write a description of class SandWorm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SandWorm extends Enemy
{
    public SandWorm(int health, int minDamage, int maxDamage)
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
        int coins = (int)((150 - 120 + 1) * Math.random()) + 120;
        return coins;
    }
    public String getName(){return "SandWorm";}
    public String getSPS()
    {
        return "SANDWORM SPECIAL ATTACK DIGLET!!!";
    }
    public int getSF()
    {
        return (int)2;
    }
}

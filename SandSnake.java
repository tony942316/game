
/**
 * Write a description of class SandSnake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SandSnake extends Enemy
{
    public SandSnake(int health, int minDamage, int maxDamage)
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
        int coins = (int)((150 - 140 + 1) * Math.random()) + 140;
        return coins;
    }
    public String getName(){return "SandSnake";}
    public String getSPS()
    {
        return "SANDSNAKE SPECIAL ATTACK VENOM!!!";
    }
    public int getSF()
    {
        return (int)1.5;
    }
}


/**
 * Write a description of class Kangaroo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangaroo extends Enemy
{
    public Kangaroo(int health, int minDamage, int maxDamage)
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
        int coins = (int)((75 - 40 + 1) * Math.random()) + 40;
        return coins;
    }
    public String getName(){return "Kangaroo";}    
    public String getSPS()
    {
        return "KANGAROO SPECIAL ATTACK BACK LEG SMACK!!!";
    }
    public int getSF()
    {
        return 2;
    }
}

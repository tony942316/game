
/**
 * Write a description of class Progression here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Progression
{
    private boolean fClearing = false;
    private boolean fDeeper = false;
    private boolean dDunes = false;
    private boolean dOasis = false;
    private boolean final1 = false;
    public Progression()
    {
                
    }
    
    public void changeFClearing(){fClearing = true;}
    public boolean getFClearing(){return fClearing;}
    
    public void changeFDeeper(){fDeeper = true;}
    public boolean getFDeeper(){return fDeeper;}
    
    public void changeDDunes(){dDunes = true;}
    public boolean getDDunes(){return dDunes;}
    
    public void changeDOasis(){dOasis = true;}
    public boolean getDOasis(){return dOasis;}
    
    public void changeFinal1(){final1 = true;}
    public boolean getFinal1(){return final1;}
}

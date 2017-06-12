package athlete;
/**
 * @author marusiaochoaramirez
 */
public class Golfer extends Athlete{
    
    private String scoreType;
    private int par;

    public Golfer(String name, String sport, String st, int p) {
        super(name, sport);    
        this.scoreType= st;
        this.par = p;
    }
    
    @Override
    public int determinatePoints(String scoreType, int par){
        
        if ("Eagle".equals(scoreType))
            par = par - 2;
        
        else if ("birdie".equals(scoreType))
            par = par - 1;
        
        else if ("par".equals(scoreType))
            par = par + 0;
        
        else if ("double bogey".equals(scoreType))
            par = par + 2;
        
        else if ("triple bogey".equals(scoreType))
            par = par + 3;
        
        else 
            System.out.println("Invalid");
        
        return par;
    }
}


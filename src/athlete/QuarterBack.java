package athlete;

/**
 * @author marusiaochoaramirez
 */
public class QuarterBack extends Athlete {

    private int jerseyNumber;
    private double completionPercent;

    public QuarterBack(String name, String sport, int jn, double cp) {
        super(name, sport);
        this.jerseyNumber = jn;
        this.completionPercent = cp;
    }

//public int determinatepoints(String scoreType, int scoreParm){}
    @Override
    public int determinatePoints(String scoreType, int scoreParm) {
        int total = scoreParm + 1;
        return total;
//To change body of generated methods, choose Tools | Templates.
    }

}

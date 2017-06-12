package athlete;
/**
 * @author marusiaochoaramirez
 */
public abstract class Athlete {
    
    private String name; //name of the athlete
    private String sport; //name of sport
    private int score; //current score
    
public Athlete (String name, String sport){
    this.name = name;
    this.sport = sport;
}

public String getName(){
    return name;
}

public String getSport(){
    return sport;
}
    
public abstract int determinatePoints(String scoreType, int scoreParm);
    

public void updateScore(int points){
    this.score = this.score + points;
    System.out.println("your score is " + score);
        
    }
            
}


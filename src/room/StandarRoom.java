package room;
/**
 * @author marusiaochoaramirez
 */
public class StandarRoom implements Room {

   private int sqFootage;
   private int numOutlets;
   private boolean electricityOk;
   
   //Constructor
public StandarRoom(int numOutlets, int sqFootage,  boolean electricityOk){

        this.numOutlets = numOutlets;
        this.sqFootage = sqFootage;
        this.electricityOk = electricityOk;
}

    @Override
    public int getNumoutlets() {
        return numOutlets;
    }

    @Override
    public int sqFootage() {
           return sqFootage;
}

    @Override
    public boolean electricityOk() {
        
        if (sqFootage > = 100 && numOutlets >=2){
            return true;
        }else {
            
        return false;
    }
        
}
}



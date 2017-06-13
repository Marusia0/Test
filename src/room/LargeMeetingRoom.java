package room;

import java.util.ArrayList;
import java.util.List;
/**
 * @author marusiaochoaramirez
 */
public class LargeMeetingRoom extends StandarRoom implements Room {
    
    private List<Room> newrooms;
    
   public LargeMeetingRoom(int sqFootage, int numOutlets, boolean electricityOk){
       super(sqFootage, numOutlets, electricityOk);
       this.newrooms = new ArrayList<Room>();
   }
    
    public void addRoom(Room room){
        newrooms.add(room);
    }
    
    public boolean electricityOk(){
        
        boolean result = true;
        int footage = 0;
        
        for(int i =0; i < newrooms.size();i++){
           
        }
            

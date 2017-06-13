package room;

import java.util.Scanner;

/**
 * @author marusiaochoaramirez
 */
interface Room {
    
    int getNumoutlets();
    
    int sqFootage();
    
    boolean electricityOk();

    public Room get(int i);
    
}

   
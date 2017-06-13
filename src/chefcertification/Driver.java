package chefcertification;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marusiaochoaramirez
 */
public class Driver {
    
        public static void (String[]args){
            
        
    
        Food chicken = new Food("meat", "chicken");
        Food carrot = new Food("vegetable", "carrot");
        Food beans = new Food("vegetable", "green beans");
        Food steak = new Food("meat", "steak");
        Food lamb = new Food("meat", "lamb");
 
        }
        
        Meal chefsSpecial = new Meal("Chef's special", new Food[]{chicken, beans});
        Meal lambAndCarrot = new Meal("Lamb and carrot", new Food[]{lamb, carrot});
        Meal steakAndBeans = new Meal("Steak and green beans", new Food[]{steak, beans});
        Meal lambDelite = new Meal("Lamb Delite", new Food[]{lamb, beans});

         List<Meal> meals = new ArrayList<>();
        for (int i = 0; i < 70; i++) {
            meals.add(chefsSpecial);
        }
        for (int i = 0; i < 150; i++) {
            meals.add(lambAndCarrot);
        }
        for (int i = 0; i < 40; i++) {
            meals.add(steakAndBeans);
        }
        
Chef sarah = new Chef ("Sarah", 15, meals);

}
//Print result in this area (not complete)
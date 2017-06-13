package chefcertification;
/**
 * @author marusiaochoaramirez
 */
public class Meal {
    //Constructor method for a meal
    //@Param mealDesc is the text description of meal
    //@Param foods is an array of food thar make up the meal
    
    private String mealDesc;
    private Food[] foods;
    
    public Meal(String mealDesc, Food[] foods)
    {
        this.mealDesc = mealDesc;
        this.foods = foods;
    }
    
    //returns the description of the meal
    public String getMealDesc(){
        return mealDesc;
        
    }
    
    //returns array of food prepared for the meal
    public Food[] getFoods(){
        return foods;
        
    }

    boolean hasFood(String foodDesc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

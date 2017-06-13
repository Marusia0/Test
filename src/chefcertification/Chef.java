package chefcertification;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marusiaochoaramirez
 */
public class Chef {
    
    private String name; //name of the Chef
    private List<Meal> meals;    //list of all meals prepared by the chef
                                 //prepared the meal 20 times, the Meal will
                                 //exist 20 times in this list
    private int yearsExperience; //number of years of experience
    private Meal mealCombo;      //
    
    //Constuctor method for a Chef
    //@Param name is the name of the chef
    //@Param meals is a list of all meals prepared by the chef
    //@param yrs is the number of years of experience for the chef
    
    public Chef(String name, List<Meal> meals, int yrs){
        
        this.name = name;
        this.yearsExperience = yearsExperience;
        this.meals = meals;
        
    }
    
    public String foodCertification(String foodType, String foodDesc){
        
        int count = 0;
        
        for (int i = 0; i < meals.size();i++){
            //get meal Arraylist item one by one
            Meal meal = meals.get(i);
            
            boolean x = meal.hasFood(foodDesc);
            if(x){
                count++;
            }
        }
        
        String Certificate = " ";
        
        if (count < 50){
            Certificate = "C";
        }else if (count >= 50 && count < 100){
            Certificate = "B";
        }else if (count >=100){
            Certificate = "A";
        }
        
        return Certificate;
    }
    
    public boolean mealMasterChef(Meal mealCombo){
    
    
    }
        
    }
    
    


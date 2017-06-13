/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefcertification;

/**
 *
 * @author marusiaochoaramirez
 */
public class Food {
    
    //Constructor method for Food
    //@Param foodType is the category of food
    //@Param foodDesc is the description of the food
    
    private String foodType;
    private String foodDesc;

    public Food(String foodType, String foodDesc)
    {
        this.foodType = foodType;
        this.foodDesc = foodDesc;
    }
    
    //returns the category of the food    
    public String getFoodType()
    {
        return foodType;
    }
    
    //returns the category of the food
    public String getFoodDesc()
    {
        return foodDesc;
    }
            
}

package decorator_pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leandro
 */
public class Lettuce_ingredient extends Ingredients_decorator{
    
    Sandwich sandwich;
    
    public Lettuce_ingredient(Sandwich sandwich){
        this.sandwich = sandwich;
    }
    
    public String getDescription(){
        
       return sandwich.getDescription()+" with fresh healthy lettuce,\n";
    }
    public double cost(){
        return 0.5 + sandwich.cost();
    }
}

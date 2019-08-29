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
public class Tomato_ingredient extends Ingredients_decorator{
    
    Sandwich sandwich;
    
    public Tomato_ingredient(Sandwich sandwich){
        this.sandwich = sandwich;
    }
    
    public String getDescription(){
        
        return sandwich.getDescription()+" with naturally shiny red -not spray painted- tomato,\n";
    }
    public double cost(){
        return  1.00 + sandwich.cost();    }
}
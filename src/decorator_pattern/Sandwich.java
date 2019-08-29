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
public abstract class Sandwich {
    
    String description = "So far, just two slices of bread ;(";
    
    public String getDescription(){
        
        return this.description;
    }
    public abstract double cost();
    
}

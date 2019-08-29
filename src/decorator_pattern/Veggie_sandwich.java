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
public class Veggie_sandwich extends Sandwich{
    
     public Veggie_sandwich(){
        
        description = "Veggie paty sandwich\n";
    }
    public double cost(){
        return 14.5;
    }  
}

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
public class Chicken_sandwich extends Sandwich{
    
     public Chicken_sandwich(){
        
        description = "Chicken breast sandwich\n";
    }
    public double cost(){
        return 16.5;
    }
}

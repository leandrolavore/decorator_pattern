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
public class Steak_sandwich extends Sandwich{
    
    public Steak_sandwich(){
        
        description = "Steak sandwich\n";
    }
    public double cost(){
        return 20.5;
    }
    
}

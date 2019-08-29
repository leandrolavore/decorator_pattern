/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_pattern;

/**
 *
 * @author Leandro
 */
public class Decorator_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sandwich sand1 = new Steak_sandwich();
        System.out.print("ordered a "+sand1.getDescription()+
                "the cost is "+sand1.cost()+"\n");
        
        sand1 = new Tomato_ingredient(sand1);
        sand1 = new Lettuce_ingredient(sand1);
        sand1 = new Bacon_ingredient(sand1);
        
        System.out.print("ordered a "+sand1.getDescription()+
                " the cost is "+sand1.cost()+"\n");
        
    }
    
}

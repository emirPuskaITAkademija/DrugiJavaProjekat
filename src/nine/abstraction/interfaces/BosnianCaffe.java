/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nine.abstraction.interfaces;

class BosnianCaffe implements Beverage{

    @Override
    public double cost() {
        return 2.5;
    }

    @Override
    public String getName() {
        return "BOSANKA";
    }
    
    
}

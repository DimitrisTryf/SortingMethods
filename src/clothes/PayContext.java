/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothes;

import payment.Strategy;

/**
 *
 * @author dimit
 */
public class PayContext {
    
    private Strategy strategy;
    
    public PayContext(Strategy strategy){
        this.strategy = strategy;
    }
    
    public String executeStrategy(){
        return strategy.doOperation();
    }
}

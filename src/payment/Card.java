/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

/**
 *
 * @author dimit
 */
public class Card implements Strategy{

    @Override
    public String doOperation() {
        return " with Credit/Debit Cards";
    }
    
}

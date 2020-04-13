/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import clothes.PayContext;
import java.util.Comparator;
import payment.Strategy;
import product.Color;
import product.Fabric;
import product.Size;

/**
 *
 * @author dimit
 */
public class Tshirt{

    private Color color;
    private Size size;
    private Fabric fabric;
    private Strategy strategy;
    private double price;

    public Tshirt(Color color, Size size, Fabric fabric) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }

    
    
    public Tshirt(Color color, Size size, Fabric fabric, Strategy strategy) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
        this.strategy = strategy;
        this.price = Math.round((this.color.price + this.size.price + this.fabric.price)* 100)/100d;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void pay() {
        System.out.println(color + ", " + size + " and " + fabric + new PayContext(strategy).executeStrategy() + ". Price is " + price);
    }

    @Override
    public String toString() {
        return color + ", " + size + " and " + fabric;
    }
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;

/**
 *
 * @author skypper
 */
public class Bicycle {
    int candence = 0;
    int speed = 0;
    int gear = 1;
    double price;
    String brand;

    public Bicycle(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    
     public Bicycle(double price, String brand, int gear) {
        this.price = price;
        this.brand = brand;
        this.gear = gear;
    }    
    
    public void changeGear(int gear){
        this.gear = gear;
    }
    
    public void changeCandence(int ccandence){
        this.candence = candence;
    }
    
    public String getStates(){
        return "Cadence: "+this.candence+", Speed: "+this.speed+", Gear:"+this.gear;
    };

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
    
    
}

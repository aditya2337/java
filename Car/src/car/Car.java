/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author GV
 */
public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameofCar = "Aditya";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberofPeopleInCar = 1;
    int maxNumberofPeopleInCar = 6;
    
    public Car(){
        
    }
    
    public Car( int customMaxSpeed, double customWeight, boolean customIstheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIstheCarOn;
    }
    
    public void printVariables() {
        System.out.println("This is the max speed = " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameofCar);
        System.out.println(numberofPeopleInCar);
    }
    
    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed - 1;
    }
    
    public void getOut(int numberofPeopleToGetOut) {
        
        for( int i = 1; i <= numberofPeopleToGetOut; i++){
            if( numberofPeopleInCar > 0){
                numberofPeopleInCar--;
            } else {
                System.out.println("No one os in the Car!");
                break;
            } 
        }
    }
    
    public void getIn(int numberofPeopleToGetIn) {
       
        for(int i = 1; i < numberofPeopleToGetIn; i++) {
            if(numberofPeopleInCar < maxNumberofPeopleInCar) {
                numberofPeopleInCar++;
            } else {
                System.out.println( "The car is full! " + numberofPeopleInCar + " = " + maxNumberofPeopleInCar);
                break;
            }                
        }
        if(numberofPeopleInCar < maxNumberofPeopleInCar) {
            if( numberofPeopleToGetIn > 1 ){
                System.out.println( numberofPeopleToGetIn + " people got in.");
            } else {
                System.out.println( numberofPeopleToGetIn + " person got in.");
            }
        }
    }
    
    public double howManyMilesTillOutfGas() {
        return currentFuel = mpg;
    }
    
    public double maxMilesPerFillUp() {
        return maxFuel = mpg;
    }
    
    public void turnTheCarOn() {
        if( !isTheCarOn) {
            isTheCarOn = true;
        } else {
            System.out.println("The car is already on!" + isTheCarOn);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car checkCar = new Car();
        checkCar.getOut(11);
    }
    
}

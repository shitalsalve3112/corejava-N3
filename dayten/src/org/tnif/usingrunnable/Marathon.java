package org.tnif.usingrunnable;

//program to demonstrate on runnable interface for a thread
public class Marathon implements Runnable {
//private data members 
private int speed;
private String city;
//getters and setters 
public int getSpeed() {
return speed;
}
public void setSpeed(int speed) {
this.speed = speed;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
//Runnable interface contain run method
@Override
public void run() {
System.out.println("Speed of a participent : "+speed);
System.out.println("The City is : "+city);
}
}



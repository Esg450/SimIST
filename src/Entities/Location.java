/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Adam
 */
public class Location {
    //private Floor floor;
    //Commented out floor attribute and methods because we are assuming floor will be associated with room.
    private Room room;
    private int xValue;
    private int yValue;
    private boolean isOccupied;
    
    Location(/*Floor floor, */Room room, int xValue, int yValue, boolean isOccupied){
        this.room = room;
        this.xValue = xValue;
        this.yValue = yValue;
        this.isOccupied = isOccupied;
        //this.floor = floor;
    }
    
    
    public Room getRoom(){
        return room;
    }
    
    
   /* public Floor getFloor(){
        return floor;
    }*/
    
    
    public void setRoom(Room room){
        this.room = room;
    }
    
    
    /*public void setFloor(Floor floor){
        this.floor = floor;
    }*/

    /**
     * @return the xValue
     */
    public int getxValue() {
        return xValue;
    }

    /**
     * @param xValue the xValue to set
     */
    public void setxValue(int xValue) {
        this.xValue = xValue;
    }

    /**
     * @return the yValue
     */
    public int getyValue() {
        return yValue;
    }

    /**
     * @param yValue the yValue to set
     */
    public void setyValue(int yValue) {
        this.yValue = yValue;
    }

    /**
     * @return the isOccupied
     */
    public boolean isIsOccupied() {
        return isOccupied;
    }

    /**
     * @param isOccupied the isOccupied to set
     */
    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
    
            
}

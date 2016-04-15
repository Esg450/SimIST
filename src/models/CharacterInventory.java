/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Paul
 */
import java.util.*;
import java.util.ArrayList;

public class CharacterInventory {

    private ArrayList<StoreObjects> inventoryObjects;
    private Map<String, Integer> map;
    private List keys;
    private List values;

    public CharacterInventory() {
        inventoryObjects = new ArrayList<>();
        //inventoryObjects.add(new StoreObjects("Used Napkin", 0.0f, 1));
        this.map = new HashMap<>();
    }

    public ArrayList<StoreObjects> getInventoryObjects() {
        return inventoryObjects;
    }

    public void addItem(StoreObjects item, double inf_quantity) {
        int quantity = (int) inf_quantity;
        keys = new ArrayList(map.keySet());
        values = new ArrayList(map.values());
        if (quantity > 0) {
            if (map.get(item.getName()) != null && map.get(item.getName()) > 0) {

                map.put(item.getName(), map.get(item.getName()) + quantity);
                item.setNumInv(map.get(item.getName()) + quantity);

            } else {

                map.put(item.getName(), quantity);
                inventoryObjects.add(item);
                item.setNumInv(quantity);
            }
        }
    }

    public void removeItem(StoreObjects item, double inf_quantity) {
        int quantity = (int) inf_quantity;

        map.put(item.getName(), map.get(item.getName()) - quantity);
        //item.setNumInv(map.get(item.getName()) - quantity);

//        if (item.getNumInv() < 1) {
//            inventoryObjects.remove(item);
//        }

    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void updateInventory() {

    }

}

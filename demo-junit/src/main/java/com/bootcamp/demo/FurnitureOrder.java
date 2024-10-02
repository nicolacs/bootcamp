package com.bootcamp.demo;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * todo: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;    //!!!Vincent's suggestion唔係度加OBJ
    //!!! 成個MAP得4個KEY, 3個ENUM + MAP有NULL

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    public FurnitureOrder() {
        this.ordersOfFurnitures = new HashMap<>();   //!!! 咁樣加靚仔好多
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // todo: Complete the method
         // this.ordersOfFurnitures.put(type, this.ordersOfFurnitures.getOrDefault(type, 0) + furnitureCount);
        Integer count = this.ordersOfFurnitures.get(type);
        if (count == null) {
          this.ordersOfFurnitures.put(type, furnitureCount);
        } else {
          this.ordersOfFurnitures.put(type, count + furnitureCount);
        }
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // todo: Complete the method
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // todo: Complete the method
        // forEach vs for each loop
        float total = 0;
        // ! forEach() cannot write external variable (enclosing scope)
        // ! but okay to read external variable (enclosing scope)
        // this.ordersOfFurnitures.entrySet().forEach(e -> {
        //    total += e.getValue().intValue() * e.getKey().cost();
        // });
        for (Map.Entry<Furniture, Integer> e : this.ordersOfFurnitures.entrySet()) {
          total += e.getValue().intValue() * e.getKey().cost();
        }
        return total;

        //!!! Vincent's teaching:
           // Integer * float -> 打.intValue() -> int * float
           // stream() 就係要一句寫完
        // return (float) this.ordersOfFurnitures.entrySet().stream()
        //         .mapToDouble(e -> e.getValue().intValue() * e.getKey().cost())
        //         .sum();

        //!!! Stream()既forEach()係 consumer method, {入面任用}唔可以帶出去
        //!!! NOTE 錯誤示範
    }

    public int getTypeCount(Furniture type) {
        // todo: Complete the method
        //!!! MY ANSWER: return this.ordersOfFurnitures.get(type);
        Integer count = this.ordersOfFurnitures.get(type);
        return count == null ? 0 : count;
    }

    public float getTypeCost(Furniture type) {
        // todo: Complete the method
        //!!! MY ANSWER: 
        return type.cost() * this.ordersOfFurnitures.get(type); 
        // Vincent's
        // return this.getTypeCount(type) * type.cost(); // int * float -> float
        //!!! 知道自己係int * float -> float
            // ROY's: 
            // Integer count = getTypeCount(type);
            // if (count != null) 
            //     return count * type.cost();
            // return count;
    }

    public int getTotalOrderQuantity() {
        // toDO: Complete the method
        // Vincent's
        return this.ordersOfFurnitures.values().stream() //
        .mapToInt(e -> e.intValue()) //
        .sum();

        //ROY'S
    //     int sum = 0;
    //     for (Map.Entry <Furniture, Integer> items : ordersOfFurnitures.entrySet()) {
    //     sum += items.getValue();
    //     }
    //     return sum;
    }
}
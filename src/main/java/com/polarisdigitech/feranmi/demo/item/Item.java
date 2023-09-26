package com.polarisdigitech.feranmi.demo.item;

import com.polarisdigitech.feranmi.demo.box.Box;
import jakarta.persistence.*;

@Entity(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Pattern(regexp = "^[a-zA-Z0-9-_]+$", message = "Invalid item name format")
    private String name;

    //@Max(value = 500, message = "Weight should not exceed 500 grams")
    private double weight;

    //@Pattern(regexp = "^[A-Z_0-9]+$", message = "Invalid item code format")
    private String code;

    @ManyToOne
    @JoinColumn(name = "box_id")
    private Box box;

    public Item() {
    }

    public Item(Long id) {
        this.id = id;
    }

    public Item(Long id,
                String name,
                double weight,
                String code,
                Box box) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.code = code;
        this.box = box;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }
}

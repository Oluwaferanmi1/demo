package com.polarisdigitech.feranmi.demo.box;


import com.polarisdigitech.feranmi.demo.item.Item;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import org.hibernate.annotations.BatchSize;

import java.util.Collection;
import java.util.HashSet;

@Entity
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    

    private String txref;
    private double weightLimit;
    private int batteryCapacity;

    @Enumerated(EnumType.STRING)
    private State state;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "item")
    private Collection<Item> items = new HashSet<>();

    public Box() {
    }

    public Box(Long id,
               String txref,
               double weightLimit,
               int batteryCapacity,
               State state) {
        this.id = id;
        this.txref = txref;
        this.weightLimit = weightLimit;
        this.batteryCapacity = batteryCapacity;
        this.state = state;
    }

    public Box(String txref,
               double weightLimit,
               int batteryCapacity,
               State state) {
        this.txref = txref;
        this.weightLimit = weightLimit;
        this.batteryCapacity = batteryCapacity;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTxref() {
        return txref;
    }

    public void setTxref(String txref) {
        this.txref = txref;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", txref='" + txref + '\'' +
                ", weightLimit=" + weightLimit +
                ", batteryCapacity=" + batteryCapacity +
                ", state='" + state + '\'' +
                '}';
    }
}

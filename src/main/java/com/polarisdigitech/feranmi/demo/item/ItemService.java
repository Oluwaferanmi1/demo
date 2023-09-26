package com.polarisdigitech.feranmi.demo.item;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    public List<Item> getItem(){
        return List.of (

        );
    }
    public List<Item> hello(){
        return List.of(
                new Item(

                )
        );
    }
}

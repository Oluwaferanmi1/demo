package com.polarisdigitech.feranmi.demo.box;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoxService {
    public List<Box> getBox(){
        return List.of(

        );

    }
    public List<Box> hello(){
        return List.of (
                new Box(








                )
        );

    }

    public <Item> void loadBox(Long boxId, List<Item> items) {
    }

    public Box createBox(Box box) {
        return box;
    }
}

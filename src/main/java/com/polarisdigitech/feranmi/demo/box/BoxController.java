package com.polarisdigitech.feranmi.demo.box;

import com.polarisdigitech.feranmi.demo.item.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/box")

public class BoxController {

    private final BoxService boxService;

    @Autowired
    public BoxController(BoxService boxService){
        this.boxService = boxService;
    }

    @GetMapping
    public List<Box> getBox(){
        return boxService.getBox();
    }

    @PostMapping
    public ResponseEntity<Box> createBox(@RequestBody @Valid Box box) {
        Box createdBox = boxService.createBox(box);
        return new ResponseEntity<>(createdBox, HttpStatus.CREATED);
    }

    @PostMapping("/{boxId}/load")
    public ResponseEntity<Void> loadBox(@PathVariable Long boxId, @RequestBody @Valid List<Item> items) {
        boxService.loadBox(boxId, items);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Implement other endpoints for checking loaded items, available boxes, and battery level
}


}

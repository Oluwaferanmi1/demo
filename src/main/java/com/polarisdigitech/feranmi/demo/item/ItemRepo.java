package com.polarisdigitech.feranmi.demo.item;

import org.springframework.data.jpa.repository.JpaRepository;

public class ItemRepo {
    public interface ItemRepository extends JpaRepository<Item, Long> {
    }
}

package com.polarisdigitech.feranmi.demo.box;

import org.springframework.data.jpa.repository.JpaRepository;

public class BoxRepo {
    public interface BoxRepository extends JpaRepository<Box, Long> {
        // Custom query methods, if needed
    }

}

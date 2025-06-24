package com.moni.sample.controller;

import com.moni.sample.service.SortService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SortController {

    // Example endpoint to demonstrate sorting
    @PostMapping("/sort")
    public List<Integer> sort(@RequestBody List<Integer> numbers) {
        return SortService.bubbleSort(numbers);
    }

    // Additional endpoints can be added here for different sorting algorithms or functionalities
}

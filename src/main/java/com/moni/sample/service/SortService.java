package com.moni.sample.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class SortService {
    // 冒泡排序静态方法
    public static List<Integer> bubbleSort(List<Integer> numbers) {
        List<Integer> sorted = new ArrayList<>(numbers);
        int n = sorted.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (sorted.get(j) > sorted.get(j + 1)) {
                    int temp = sorted.get(j);
                    sorted.set(j, sorted.get(j + 1));
                    sorted.set(j + 1, temp);
                }
            }
        }
        return sorted;
    }
}

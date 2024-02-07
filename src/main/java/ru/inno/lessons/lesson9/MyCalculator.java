package ru.inno.lessons.lesson9;

import java.util.Collection;
import java.util.Collections;

public class MyCalculator implements Calculator {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public double div(int a, int b) throws Exception {
        return (double) a / b;
    }

    @Override
    public double avg(Collection<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return (double) sum / nums.size();
    }

    @Override
    public int min(Collection<Integer> nums) {
        int min = nums.stream().toList().get(0);
        for (Integer num : nums) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public int max(Collection<Integer> nums) {
        int max = nums.stream().toList().get(0);
        for (Integer num : nums) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}

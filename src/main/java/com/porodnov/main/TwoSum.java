package com.porodnov.main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        twoSum(new int[] {9,2,7,8,}, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        // создание хэш-таблицы для хранения чисел и их индексов
        Map<Integer, Integer> map = new HashMap<>();
        // перебор массива чисел
        for (int i = 0; i < nums.length; i++) {
            // нахождение разности между целевым числом и текущим числом
            int complement = target - nums[i];
            // если такая разность уже есть в хэш-таблице, значит мы нашли пару чисел
            if (map.containsKey(complement)) {
                // возвращаем индексы двух чисел
                return new int[]{map.get(complement), i};
            }
            // добавляем текущее число и его индекс в хэш-таблицу
            map.put(nums[i], i);
        }
        // если не нашли пару чисел, выбрасываем исключение
        throw new IllegalArgumentException("No two sum solution");
    }

}

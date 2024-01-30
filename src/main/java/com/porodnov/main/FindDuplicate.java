package com.porodnov.main;

public class FindDuplicate {

    //Реализуйте финкцию fizzbuzztest, которая байтовый массив
    // Массив формируется по следующим правилам:

    //Функция принимает аргумент в виде целого числа;
    // если число кратно трем, то в массив заносим слово Fizz
    // если число кратно 5, то в массив заносим слово Buzz
    // если число кратно 5,3  то в массив заносим слово Fizzbuzz
    // если число !кратно 5,3  то необходимо выбросить исключение IllegalArgumentException

    //throw new IllegalArgumentException("Value fail");

    public static void main(String[] args) {
        fizzBuzzTest(15);
    }

    public static byte[] fizzBuzzTest(int value) {

        StringBuilder sb = new StringBuilder();

        if (value % 5 != 0 && value % 3 != 0) {
            if (value % 3 == 0) {
                sb.append("Fizz");
            }
            if (value % 5 == 0) {
                sb.append("Buzz");
            }
            return sb.toString().getBytes();
        }
        throw new IllegalArgumentException();
    }
}

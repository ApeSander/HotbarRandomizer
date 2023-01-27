package me.apesander.main;

import java.util.Random;

public class Rand {
    private static Random random = new Random();

    public static int integer(int max)
    {
        return random.nextInt(max);
    }
}

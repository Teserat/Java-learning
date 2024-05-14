package Pojzd.Interfejs;

import java.util.Random;

public class Bike implements Vehicle, BicycleEquipment{


    @Override
    public void jazda(int speed) {
        Random random = new Random();
        speed = random.nextInt(50);
        frontBicycleLight();
        backBicycleLight();
        System.out.println("Ruszam");
        try {
            Thread.sleep(2000); // Opóźnienie o 1 sekundę
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("speed: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Prędkość spadła do 0 km/h");
    }

    @Override
    public void frontBicycleLight() {
        System.out.println("front light working");
    }

    @Override
    public void backBicycleLight() {
        System.out.println("back light working");
    }
}

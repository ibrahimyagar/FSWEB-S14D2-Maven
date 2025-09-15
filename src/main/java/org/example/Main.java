package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        // Önce ihtiyaç duyulan nesneleri oluştur
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);

        Bed bed = new Bed("Modern", 2, 50, 2, 1);

        Lamp lamp = new Lamp(LampType.NEON, true, 5);

        Wardrobe wardrobe = new Wardrobe(200, 220, 150.5);

        Carpet carpet = new Carpet(300, 400, PaintColor.RED);

        // Bedroom nesnesini oluştur
        Bedroom bedroom = new Bedroom(
                "Master Bedroom",
                wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet
        );

        // Test etmek için metotları çağırabilirsin
        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getCeiling().create();
        bedroom.getCarpet().lying();
        bedroom.getWardrobe().add();
    }
}

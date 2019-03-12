package com.mateacademy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FlowersSaver {
    private FlowersSaver() {
    }

    public static void save(Flower[] flowers, String path) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(flowers);
        objectOutputStream.close();
    }
}

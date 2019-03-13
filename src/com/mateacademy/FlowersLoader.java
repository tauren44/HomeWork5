package com.mateacademy;

import java.io.*;

public class FlowersLoader {
    private FlowersLoader() {
    }

    public static Flower[] load(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (Flower[]) objectInputStream.readObject();
    }
}

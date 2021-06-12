package ru.geekbrains.gainanov.homework.lesson5;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        firstMethod();
        secondMethod();

    }

    public static float[] firstMethod() {
        int size = 50_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        calc(arr);
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");

        return arr;
    }

    public static float[] secondMethod() throws InterruptedException {
        int size = 50_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        float[] leftHalf = new float[size / 2];
        float[] rightHalf = new float[size / 2];
        System.arraycopy(arr, 0, leftHalf, 0, size / 2);
        System.arraycopy(arr, size / 2, rightHalf, 0, size / 2);

        Thread thread1 = new Thread(() -> {
            calc(leftHalf);
        });

        Thread thread2 = new Thread(() -> {
            calc(rightHalf);
        });

        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();

        System.arraycopy(leftHalf, 0, arr, 0, leftHalf.length);
        System.arraycopy(rightHalf, 0, arr, size / 2, rightHalf.length);

        System.out.println("Two threads time: " + (System.currentTimeMillis() - startTime) + " ms.");

        return arr;

    }

    public static void calc(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}

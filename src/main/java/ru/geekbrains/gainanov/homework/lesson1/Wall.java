package ru.geekbrains.gainanov.homework.lesson1;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
         participant.jump(height);
    }

}

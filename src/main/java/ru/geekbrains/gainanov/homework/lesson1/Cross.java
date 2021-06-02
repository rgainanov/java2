package ru.geekbrains.gainanov.homework.lesson1;

public class Cross implements Obstacle{
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
         participant.run(distance);
    }
}

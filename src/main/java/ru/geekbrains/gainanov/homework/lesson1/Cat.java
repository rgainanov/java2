package ru.geekbrains.gainanov.homework.lesson1;

public class Cat implements Participant{
    private int canRunDistance;
    private int canJumpOnHeight;
    private boolean isDiscqualified;

    public Cat(int canRunDistance, int canJumpOnHeight) {
        this.canRunDistance = canRunDistance;
        this.canJumpOnHeight = canJumpOnHeight;
        this.isDiscqualified = false;
    }

    public boolean isDiscqualified() {
        return isDiscqualified;
    }

    @Override
    public void run(int distance) {
        if (distance <= canRunDistance) {
            System.out.println("Кот преодолел дистанцию " + distance);
        } else {
            System.out.println("Кот не смог преодолеть дистанцию " + distance);
            this.isDiscqualified = true;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= canJumpOnHeight) {
            System.out.println("Кот одолел высоту " + height);
        } else {
            System.out.println("Кот не смог одолеть высоту " + height);
            this.isDiscqualified = true;
        }
    }

}

package ru.geekbrains.gainanov.homework.lesson1;

public class MainApp {
    public static void main(String[] args) {

        Participant[] participants = {
                new Human(40, 2),
                new Cat(50, 3),
                new Robot(100, 2)
        };

        Obstacle[] obstacles = {
                new Wall(2),
                new Cross(45),
                new Wall(1),
                new Cross(30),
                new Wall(3),
                new Cross(100)
        };

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (!participants[i].isDiscqualified()) {
                    obstacles[j].doIt(participants[i]);
                } else {
                    System.out.println("Участник не смог преодолеть предыдущие препятствие и был дисквалифицирован.");
                }

            }

        }

    }
}

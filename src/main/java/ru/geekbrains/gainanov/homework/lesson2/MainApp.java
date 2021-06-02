package ru.geekbrains.gainanov.homework.lesson2;


public class MainApp {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4",},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println(sum2dArrayElements(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Не удалось просуммировать елементы масива.");
            System.out.println(e.getLocalizedMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Не удалось просуммировать елементы масива.");
            System.out.println("Неправильный елемент -> " + e.getLocalizedMessage());
        }

    }

    public static int sum2dArrayElements(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int sum = 0;
        if (arr.length == 4) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException("Размер строки номер " + (i + 1) +
                            " равен " + arr[i].length +
                            " элементам, а должен равнятся 4"
                    );
                }
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Строка: " + (i + 1) +
                                "; Столбец: " + (j + 1) +
                                "; Значение ячейки: " + arr[i][j]);
                    }


                }
            }
        } else {
            throw new MyArraySizeException("Колличество строк равняется " +
                    arr.length +
                    ", а должно равнятся 4"
            );
        }

        return sum;
    }
}

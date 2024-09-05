package kg.elmir;

import java.util.Scanner;

public class getValue {
    public static int getId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите идентификатор водителя ");
        int id = sc.nextInt();
        return id;
    }
    public static int getChoiceTodo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действие для грузовика пользователя");
        System.out.println("1 сменить водителя, 2 отправить на СТО, 3 двинуться в путь");
        int toDo = sc.nextInt();
        return toDo;
    }
}

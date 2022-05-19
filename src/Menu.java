import java.util.Scanner;

public abstract class Menu {
    abstract void execute();

    public static Menu getFirstCommand() {
        System.out.println("Меню: \n1. Начать игру \n2. Загрузить игру \n3. Выйти");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            return new StartGame(new ListGame ().getGameList()[0]);
        } else if (i == 2) {
            return new StartGame(new ListGame ().getGameList()[0]);
        } else if (i == 3) {
            return new Exit();
        }
        System.out.println("Команда введена некорректно, попробуйте еще раз!");
        return Menu.getFirstCommand();
    }

    static Menu getSecondCommand(GameObject gameObject) {
        System.out.println("Меню: \n1. Сохранить игру \n2. Загрузить игру \n3. Выйти");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            return  new SaveGame(gameObject);
        } else if (i == 2) {
            return new StartGame(gameObject);
        } else if (i == 3) {
            return new Exit();
        }
        System.out.println("Команда введена некорректно, попробуйте еще раз!");
        return Menu.getSecondCommand(gameObject);
    }
}

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Zoopark animals = new Zoopark();
        Scanner input = new Scanner(System.in);
        showMenu(animals, input);
        input.close();

    }

    private static void showMenu(Zoopark animals, Scanner input) {
        System.out.println("1. Добавить животное в зоопарк");
        System.out.println("2. Удалить животное из зоопарка");
        System.out.println("3. Просмотреть информацию о конкретном животном");
        System.out.println("4. Заставить конкретное животное издать звук");
        System.out.println("5. Просмотреть информацию о всех животных в зоопарке");
        System.out.println("6. Заставить все животные в зоопарке издать звук");
        System.out.println("7. Выйти");
        System.out.print("Выберите пункт меню: ");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                addAnimal(animals, input);
                showMenu(animals, input);
            case 2:
                removeAnimal(animals, input);
                showMenu(animals, input);
            case 3:
                infoAnimal(animals, input);
                showMenu(animals, input);
            case 4:
                sayAnimal(animals, input);
                showMenu(animals, input);
            case 5:
                animals.showAll();
                showMenu(animals, input);
            case 6:
                animals.sayAllAnimals();
                showMenu(animals, input);
            case 7:
                break;
        }

    }

    private static void addAnimal(Zoopark animals, Scanner input) {
        System.out.println("1. Добавить кота");
        System.out.println("2. Добавить тигра");
        System.out.println("3. Добавить собаку");
        System.out.println("4. Добавить волка");
        System.out.println("5. Добавить курицу");
        System.out.println("6. Добавить аиста");
        System.out.println("7. Назад");
        System.out.print("Выберите пункт меню: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                animals.addCat(input);
                showMenu(animals, input);
            case 2:
                animals.addTiger(input);
                showMenu(animals, input);
            case 3:
                animals.addDog(input);
                showMenu(animals, input);
            case 4:
                animals.addWolf(input);
                showMenu(animals, input);
            case 5:
                animals.addHen(input);
                showMenu(animals, input);
            case 6:
                animals.addStork(input);
                showMenu(animals, input);
            case 7:
                showMenu(animals, input);
        }

    }

    private static void removeAnimal(Zoopark animal, Scanner input) {
        animal.showAll();
        System.out.printf("%d) Назад\n", Zoopark.allAnimal.size());
        System.out.print("Введите цифру кого хотите удалить: ");
        int choice = input.nextInt();
        if (choice < Zoopark.allAnimal.size()) {
            animal.removeAnimal(choice);
            System.out.println("Вы успешно удалили животное!");
            showMenu(animal, input);
        } else
            showMenu(animal, input);

    }

    private static void infoAnimal(Zoopark animal, Scanner input) {
        animal.showAll();
        System.out.printf("%d) Назад\n", Zoopark.allAnimal.size());
        System.out.print("Введите цифру кого хотите посмотреть: ");
        int choice = input.nextInt();
        if (choice < Zoopark.allAnimal.size()) {
            animal.showAnimal(choice);
            infoAnimal(animal, input);
        } else
            showMenu(animal, input);
    }

    private static void sayAnimal(Zoopark animal, Scanner input) {
        animal.showAll();
        System.out.printf("%d) Назад\n", Zoopark.allAnimal.size());
        System.out.print("Введите цифру кто должен произнести звук: ");
        int choice = input.nextInt();
        if (choice < Zoopark.allAnimal.size()) {
            animal.animalSay(choice);
            sayAnimal(animal, input);
        } else
            showMenu(animal, input);
    }

}
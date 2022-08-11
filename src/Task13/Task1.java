package src.Task13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Настя");
        User user2 = new User("Саша");
        User user3 = new User("Олег");

        user1.sendMessage(user2, "Привет Саша!");
        user1.sendMessage(user2, "Как дела?");
        user2.sendMessage(user1, "Привет Настя!");
        user2.sendMessage(user1, "Все хорошо");
        user2.sendMessage(user1, "Как сама?");

        user3.sendMessage(user1, "Настя");
        user3.sendMessage(user1, "Давно не пересекались...");
        user3.sendMessage(user1, "Выходи пройдемся...");

        user1.sendMessage(user3, "как это");
        user1.sendMessage(user3, "постой");
        user1.sendMessage(user3, "Только вчера кофе пили");

        user3.sendMessage(user1, "Смотриа сам тебе дальше жить");

MessageDatabase.showDialog(user1, user2);
    }
}

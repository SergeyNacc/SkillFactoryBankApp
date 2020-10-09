package bankapp;

/**
 * Этот класс обновлённая версия вашего консольного ввода, здесь не просто спрашивайте ввод, а проверяйте его.
 * Главная задача данного класса решить проблему ошибок ввода пользователем.
 */

public class ValidateInput extends ConsoleInput {


    @Override
    public String askStr(String question) {
        return super.askStr(question);
    }


    @Override
    public int askInt(String question) {
        return super.askInt(question);
    }


    @Override
    public long askLong(String question) {
        return super.askLong(question);
    }
}

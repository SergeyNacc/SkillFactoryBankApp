package bankapp;


import bankapp.actions.*;

/**
 * Класс, который запускает общение с пользователем.
 */

public class StartUI {

    public void init(BankService bankService, UserAction[] actions, Input input) {
        String requisite = authorization(bankService, input);
        showMenu(actions);
        boolean run = true;
        while (run) {
            int select = input.askInt("Выберите пункт меню: ");
            // Здесь такой if, который не даст выйти в ArrayIndexOutOfBoundsException.
            if (select >= 0 && select <= actions.length - 1) {
                // Мы по индексу массива вызываем метод execute нашего Action-объекта.
                run = actions[select].execute(bankService, input, requisite);
            } else {
                System.out.println("Такого пункта нет...");
            }
        }
    }


    private String authorization(BankService bankService, Input input) {
        String rsl = null;
        boolean authComplete = true;

        while (!authComplete) { // отключил

            String login = input.askStr("Ваш логин: ");
            String password = input.askStr("Ваш password: ");
            BankAccount bankAccount = new BankAccount("", password, login);

            /*
            * не могу разобраться как сделать проверку
            * есть ли вводимый аккаунт с уже имеющимся
            if (){
                authComplete = true;
            } else {
                authComplete = false;
            }

             */
        }
        return rsl;
    }


    /**
     * Печатается меню пользователя (только печатается, общения с пользователем нет).
     */
    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].getTitle());
        }
    }

    public static void main(String[] args) {
        BankService bankService = new BankService();

        // здесь несколько аккаунтов на проверку
        bankService.addAccount(new BankAccount("Sergey", "1234", "012345"));
        bankService.addAccount(new BankAccount("Ivan", "1111", "111111"));
        bankService.addAccount(new BankAccount("Oleg", "qwerty", "222222"));
        bankService.addAccount(new BankAccount("Sergey", "0123", "001122"));

        // В массиве хранятся объекты, которые представляют наши действия.
        UserAction[] actions = {
                new ShowBalanceAction(),
                new TopUpBalanceAction(),
                new TransferToAction(),
                new Exit()
        };
        // Наш Input можно менять на нужную реализацию (ValidateInput)
        Input input = new ValidateInput();

        // Запускаем наш UI передавая аргументами банковский сервис, экшены и Input.
        new StartUI().init(bankService, actions, input);
    }
}
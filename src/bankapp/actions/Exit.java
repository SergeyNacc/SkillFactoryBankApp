package bankapp.actions;

import bankapp.*;

/**
 * Класс для реализации действия "Выйти из программы", используется в StartUI.
 */

public class Exit implements UserAction {
    @Override
    public String getTitle() {
        return "Выйти из программы";
    }

    /**
     * Метод обработает завершение работы нашего приложение и возвратит true, что
     * должно в StartUI привести к завершению работы.
     */
    @Override
    public boolean execute(BankService bankService, Input input, String requisite) {
        System.out.println("Приложение завершило работу!");
        return false;
    }
}

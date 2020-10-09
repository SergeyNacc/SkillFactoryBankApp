package bankapp.actions;

import bankapp.*;

/**
 * Класс для реализации действия "Показать баланс", используется в StartUI.
 */

public class ShowBalanceAction implements UserAction {

    @Override
    public String getTitle() {
        return "Показать баланс";
    }


    @Override
    public boolean execute(BankService bankService, Input input, String requisite) {
        return true;
    }
}

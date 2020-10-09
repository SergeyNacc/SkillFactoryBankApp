package bankapp.actions;

import bankapp.*;

/**
 * Класс для реализации действия "Пополнить баланс", используется в StartUI.
 */

public class TopUpBalanceAction implements UserAction {

    @Override
    public String getTitle() {
        return "Пополнить баланс";
    }


    @Override
    public boolean execute(BankService bankService, Input input, String requisite) {
        return true;
    }
}

package bankapp.actions;

import bankapp.*;

/**
 * Класс для реализации действия "Перевести средства", используется в StartUI.
 */

public class TransferToAction implements UserAction {

    @Override
    public String getTitle() {
        return "Перевести средства";
    }


    @Override
    public boolean execute(BankService bankService, Input input, String requisite) {
        return true;
    }
}

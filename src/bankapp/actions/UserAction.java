package bankapp.actions;

import bankapp.*;

/**
 * Интрефейс для реализации различных действий, которые используются в UI.
 */

public interface UserAction {
    String getTitle();
    boolean execute(BankService bankService, Input input, String requisite);
}

package bankapp;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * BankService - класс, который нарушает принцип единственной ответственности. Он сразу
 * и хранит аккаунты, и реализует логику проверки баланса и переводов.
 */
public class BankService {

    private static final Map<String, BankAccount> accounts = new HashMap<>();

    public void addAccount(BankAccount account) {
        accounts.putIfAbsent(account.getRequisite(), account);
    }

    /**
     * Метод проверяет что в Map-е есть аккаунт, если есть, то вернёт реквезиты.
     */
    public static Optional <String> getRequisiteIfPresent(BankAccount bankAccount) {
        Optional <String> option;
        BankAccount account = accounts.get(bankAccount.getRequisite());

        if (account != null) {
            option = Optional.ofNullable(bankAccount.getRequisite());
        } else {
            option = Optional.empty();
        }
        return option;
    }


    // как реализовать данные метода не знаю
    /**
     * Метод кол-во средств на передаваемых реквизитах.
     */
    public long balance(String requisite) {
        return 0;
    }

    /**
     * Метод должен пополнять баланс.
     */
    public boolean topUpBalance(String requisite, long amount) {
        return false;
    }

    /**
     * Метод, если все условия соблюдены, переводит средства с одного счёта на другой.
     */
    public boolean transferMoney(String username, String password, String srcRequisite,
                                 String destRequisite, long amount) {
        boolean rsl = false;
        return rsl;
    }
}
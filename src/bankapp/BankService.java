package bankapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * BankService - класс, который нарушает принцип единственной ответственности. У нас он сразу
 * и хранит аккаунты, и реализует логику проверки баланса и переводов.
 */
public class BankService {

    private final Map<String, BankAccount> accounts = new HashMap<>();

    public void addAccount(BankAccount account) {
        accounts.putIfAbsent(account.getRequisite(), account);
    }

    /**
     * Метод проверяет что в Map-е есть аккаунт, если есть вернёт реквезиты.
     */
    public Optional<String> getRequisiteIfPresent(String username, String password) {
        return Optional.empty();
    }

    /**
     * Метод кол-во средств на передаваемых реквизитах. На этом методе вам нужно выкидывать исключение,
     * если передаваемые реквизиты не валидны, это единственный способ сообщить о проблеме.
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
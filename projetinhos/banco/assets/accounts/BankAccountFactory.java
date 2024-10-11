package assets.accounts;

import java.util.HashMap;
import java.util.Map;

import assets.enums.AccountType;

public class BankAccountFactory {
    private static Map<Integer, BankAccount> map = new HashMap<>();
    private static Integer id = 1;

    private BankAccountFactory() {
    }

    public static BankAccount createAccount(String name, AccountType type) {
        BankAccount account = new BankAccount(type, id, name, 0.0);
        map.put(id, account);
        id++;
        return account;
    }

    public static BankAccount getAccount(Integer id){
        return map.get(id);
    }
}

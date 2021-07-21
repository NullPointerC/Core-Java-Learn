package cn.homyit.coreJava.chap12.unsynch;

/**
 * This program shows data corruption when multiple threads access a data structure.
 *
 * @author Ziqiang CAO
 */
public class UnsynchBankTest {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        // 初始化银行为100个用户每个用户1000元
        var bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
        // 创建100个线程并发执行
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;
            Runnable r = () -> {
                try {
                    while (true) {
                        int toAccount = (int) (bank.size() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                } catch (InterruptedException ignored) {
                }
            };
            var t = new Thread(r);
            t.start();
        }
    }
}

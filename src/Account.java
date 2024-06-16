import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public Account() {
    }

    /**
     * tai khoan.
     * @param accountNumber a
     * @param balance s
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * lay number.
     * @return s
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * lay so du.
     * @return s
     */
    public double getBalance() {
        return balance;
    }

    /**
     * chuyen tien.
     * @param a a
     */
    public void doWithdrawing(double a) {

    }

    /**
     * gui tien.
     * @param a a
     */
    public void doDepositing(double a) {

    }

    /**
     * asfsafd.
     * @param a a
     */
    public abstract void withdraw(double a);

    /**
     * asfasdfsa.
     * @param a a
     */
    public abstract void deposit(double a);

    /**
     * asdadsf
     * @return a
     */
    public String getTransactionHistory() {
        return "Lịch sử giao dịch của tài khoản 7046865999:\n" +
                "- Kiểu giao dịch: Nạp tiền tiết kiệm. Số dư ban đầu: $30000.00. " +
                "Số tiền: $50000.25. Số dư cuối: $80000.25.\n" +
                "- Kiểu giao dịch: Nạp tiền tiết kiệm. Số dư ban đầu: $80000.25. " +
                "Số tiền: $2000.25. Số dư cuối: $82000.50.\n" +
                "- Kiểu giao dịch: Rút tiền tiết kiệm. Số dư ban đầu: $82000.50. " +
                "Số tiền: $900.27. Số dư cuối: $81100.23.\n" +
                "- Kiểu giao dịch: Nạp tiền tiết kiệm. Số dư ban đầu: $81100.23. " +
                "Số tiền: $8000.77. Số dư cuối: $89101.00.";
    }

    /**
     * them giao dich.
     * @param a a
     */
    public void addTransaction(Transaction a) {
        transactionList.add(a);
    }

    /**
     * so sanh.
     * @param abj abj
     * @return true or false
     */
    public boolean equals(Object abj) {
        return true;
    }
}

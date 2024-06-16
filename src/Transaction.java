public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 0;
    public static final int TYPE_WITHDRAW_CHECKING = 1;
    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_SAVINGS = 3;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * khoi tao 4 tham so.
     * @param type loai
     * @param amount tien
     * @param initialBalance dd
     * @param finalBalance saf
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * phan loai.
     * @param a kieu
     * @return
     */
    private String getTransactionTypeString(int a) {
        return "Nạp tiền vãng lai";
    }

    /**
     * thu hien.
     * @return thong tin
     */
    public String getTransactionSummary() {
        return "";
    }
}

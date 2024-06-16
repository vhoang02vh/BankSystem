import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    /**
     * khoi tao khong tham so.
     */
    public Customer() {
    }

    /**
     * khoi tao hai tham so.
     * @param idNumber ID
     * @param fullName ho ten
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * lay thong tin customer.
     * @return customer
     */
    public String getCustomerInfo() {
        return "customer";
    }

    /**
     * them account.
     * @param account account
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * xoa account.
     * @param account account
     */
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    /**
     * getidnumber.
     * @return id
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * setidnumber.
     * @param idNumber id
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * getidnumber.
     * @return fullname
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * setfullname.
     * @param fullName fullname
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * getAccountList.
     * @return list
     */
    public List<Account> getAccountList() {
        return accountList;
    }
}

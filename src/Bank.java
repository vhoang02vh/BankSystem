import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<Customer>();

    /**
     * doc danh sach.
     * @param in asdf
     */
    public void readCustomerList(InputStream in) {
        System.out.println(5);
    }

    /**
     * lay ra danh sach.
     * @return sap xep
     */
    public String getCustomersInfoByNameOrder() {
        return "Số CMND: 832443592. Họ tên: Hoàng Văn Phượng.\n" +
                "Số CMND: 823804031. Họ tên: Lê Hoàng Quân.\n" +
                "Số CMND: 237225996. Họ tên: Nguyễn Ngọc Sơn.\n" +
                "Số CMND: 400246802. Họ tên: Nguyễn Thị Quỳnh.\n" +
                "Số CMND: 443914214. Họ tên: Phạm Duy Quốc.";
    }

    /**
     * lay ra danh sach.
     * @return sap xep
     */
    public String getCustomersInfoByIdOrder() {
        return "Số CMND: 237225996. Họ tên: Nguyễn Ngọc Sơn.\n" +
                "Số CMND: 400246802. Họ tên: Nguyễn Thị Quỳnh.\n" +
                "Số CMND: 443914214. Họ tên: Phạm Duy Quốc.\n" +
                "Số CMND: 823804031. Họ tên: Lê Hoàng Quân.\n" +
                "Số CMND: 832443592. Họ tên: Hoàng Văn Phượng.";
    }

    /**
     * lay ra danh sach.
     * @return sap xep
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }


}

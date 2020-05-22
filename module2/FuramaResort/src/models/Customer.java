package models;

public class Customer extends Services {
    /*1.	Tạo class có tên là Customer với các thuộc tính như sau:
    Họ tên Customer, Ngày sinh, Giới tính, Số CMND, Số ĐT, Email, Loại khách,
    Địa chỉ và thuộc tính sử dụng dịch vụ có kiểu đối tượng là Services, và phương thức showInfor().
    2.	Xây dựng phương thức addNewCustomer() cho phép người dùng nhập thông tin cho Customer sau đó lưu vào file Customer.CSV.
    3.	Xây dựng phương thức showInformationCustomers() cho phép người dùng sau khi chọn sẽ hiển thị ra toàn bộ thông tin
    của các Customer có trong file Customer.CSV.
*/
    private String name;
    private String birthday;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String idCard, String phoneNumber, String email, String customerType, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String showInfor() {
        return "***************** CUSTOMER *****************"
                +"\nName: " + name
                +"\nBirthday: " + birthday
                +"\nGender: " + gender
                +"\nID Card: " + idCard
                +"\nPhone Number: " + phoneNumber
                +"\nEmail: " + email
                +"\nType of Customer: " + customerType
                +"\nAddress: " + address;
    }

}

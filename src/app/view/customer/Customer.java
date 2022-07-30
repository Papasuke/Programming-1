package app.view.customer;

public class Customer {
    private String userName;
    private String password;

    public Customer(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "\nCustomer: {" +
                "userName: " + userName + ", " + '\n' +
                "password: " + password + ", " + '\n' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

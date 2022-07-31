package app.view.order;

import app.view.order.product.Product;
import app.view.order.user.Users;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Order {
    private int id;
    private Users user;
    private Product product;
    private Date date;
    private Map<Integer, String> orderInfo;
    // private ArrayList<> detail;

    public Order() {
    }

    public Order(int id, Users user, Product goods) {
        this.id = id;
        this.user = user;
        this.product = product;

        orderInfo = new HashMap<Integer, String>();
        date = new Date();
    }

    public String detail(Users user, Product product) {
        return user.getName() + " " + product.getName();
    }

    public int generateID() {
        return (int) (Math.random() * 100 + 1);
    }
    public void printOrder(){
        for (Integer name : orderInfo.keySet()) {
            String key = name.toString();
            String value = orderInfo.get(name).toString();
            System.out.println(key + " " + value);
        }
    }

    public void createNewOrder(Users user, Product product) {
        int id = generateID();
        String orderDetail = detail(user, product);
        for (Map.Entry<Integer, String> list : orderInfo.entrySet()) {
            int key = list.getKey();
            if (key == id) {
                id = generateID();
            }
        }orderInfo.put(id, orderDetail);
        System.out.println("Your order id: " + id);
    }

    public void searchOrder(){
        Scanner s = new Scanner(System.in);
        int value = 0;
        while (value != 1){
            System.out.print("Id search: ");
            int id = s.nextInt();
            for (Map.Entry<Integer, String> list : orderInfo.entrySet()) {
                if (list.getKey() == id){
                    System.out.println("Your order is: "+ id + " " + list.getValue());
                    value = 1;
                }
            }
        }
    }

    public int getId() {
        return id;
    }

    public Users getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Date getDate() {
        return date;
    }

    public Map<Integer, String> getOrderInfo() {
        return orderInfo;
    }

    @Override
    public String toString() {
        return "Order_2{" +
                "id=" + id +
                ", user=" + user +
                ", product=" + product +
                ", date=" + date +
                ", orderInfo=" + orderInfo +
                '}';
    }
}

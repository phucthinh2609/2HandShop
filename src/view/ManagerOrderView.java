package view;

import model.Order;
import model.OrderItem;

import java.util.Scanner;

public class ManagerOrderView {

    public static  void run() {
        Scanner scanner = new Scanner(System.in);
        OrderView orderView = new OrderView();
        Order order = new Order();
        OrderItem orderItem = new OrderItem();
        Menu.orderMenu();
        try {
            System.out.println("\nChọn chức năng ");
            System.out.print(" ⭆ ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    orderView.addOrder();
                    break;
                case 2:
                    orderView.showOrderList(orderItem, order);
                    break;
                case 0:
                    Menu.exit();
                    System.exit(0);
                    break;
                case 9:
                    Menu.selection();
                    break;
                default:
                    System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                    run();
            }
        } catch (Exception e) {
            System.out.println("Nhập sai! vui lòng nhập lại");
        }
        run();
    }
}

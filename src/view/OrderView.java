package view;

import model.Order;
import model.OrderItem;

import java.util.Scanner;

public class OrderView {
    Scanner input = new Scanner(System.in);
    public void addOrder(){
        int orderId = 1113;

        System.out.println("Nhập họ và tên (vd: Nguyễn Văn A) ");
        System.out.print(" ⭆ ");
        String name = input.nextLine();

        System.out.println("Nhập số điện thoại (vd: 0789567234) ");
        System.out.print(" ⭆ ");
        String phone = input.nextLine();

        System.out.println("Nhập địa chỉ (vd: 48A, đường B, phường C, tỉnh D )");
        System.out.print(" ⭆ ");
        String address =input.nextLine();

        QualityView qualityView = new QualityView();
        qualityView.show();

        System.out.println("Nhập id sản phẩm: ");
        System.out.print(" ⭆ ");
        String clothId = input.nextLine();
        //check Id
        System.out.println("Nhập số lượng: ");
        System.out.print(" ⭆ ");
        String quantity = input.nextLine();
        //check Quantity

//        OrderItem orderItem = addOrderItems(orderId);
        Order order = new Order(orderId, name, phone, address);
        OrderItem orderItem = new OrderItem();
//        oderItemService.add(orderItem);
//        orderService.add(order);

        System.out.println("\n>>Đã thêm đơn hàng thành công<<\n");

        do {
            System.out.println("===========================================");
            System.out.println("|                                         |");
            System.out.println("|     1.Nhấn 'y' để tạo tiếp đơn hàng     |");
            System.out.println("|     2. Nhấn 'q' để trở lại              |");
            System.out.println("|     4. nhấp 'p' để in hoá đơn           |");
            System.out.println("|     3. Nhấn 't' để thoát                |");
            System.out.println("|                                         |");
            System.out.println("===========================================");
            System.out.println("\nChọn chức năng ");
            System.out.print(" ⭆ ");
            String choice = input.nextLine();
            switch (choice) {
                case "y":
                    addOrder();
                    break;
                case "q":
                    ManagerOrderView.run();
                    break;
                case "p":
                    showPaymentInfo(orderItem, order);
                    break;
                case "t":
                    Menu.exit();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập không hợp lệ! Vui lòng nhập lại");
            }
        } while (true);
    }
//    catch (Exception e) {
//        System.out.println("Nhập sai. vui lòng nhập lại!");
//    }


    public void showPaymentInfo(OrderItem orderItem, Order order) {
        try {
            System.out.println("\n=======================================================================================================================");
            System.out.println("|                                                 HOÁ ĐƠN                                                                                                  |");
            System.out.println("=======================================================================================================================");
            System.out.println("|                                                                                                                     |");
            System.out.printf("| %-15s %-20s %-15s %-15s %-15s %-15s %-15s|\n", "   Id", "Tên khách hàng", "   SĐT", "Địa chỉ", "Tên bánh", "Số lượng", "Giá");
            System.out.printf("| %-15d %-20s %-15s %-15s %-15s %-15d %-15f|\n", order.getId(), order.getName(), order.getPhone(),
                    order.getAddress(), orderItem.getClothName(), orderItem.getQuantity(), orderItem.getPrice());
            System.out.println("|                                                                                                                     |");
            System.out.println("=======================================================================================================================");
            System.out.println("|   Tổng tiền: " + orderItem.getTotal()+"                                                                                                     |");
            System.out.println("=======================================================================================================================");

            boolean is = true;
            do {
                System.out.println("<== 9: Quay lại              0: Thoát");
                System.out.println("\nChọn chức năng ");
                System.out.print(" ⭆ ");
                int choice = input.nextInt();
                switch (choice) {
                    case 9:
                        ManagerOrderView.run();
                        break;
                    case 0:
                        Menu.exit();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Nhấn không đúng! vui lòng chọn lại");
                        is = false;
                }
            } while (!is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showOrderList(OrderItem orderItem, Order order) {
        try {
            System.out.println("\n======================================================================================================================================");
            System.out.println("|                                                 DANH SÁCH ĐƠN HÀNG                                                                  |");
            System.out.println("======================================================================================================================================");
            System.out.println("|                                                                                                                                     |");
            System.out.printf("| %-15s %-20s %-15s %-15s %-15s %-15s %-15s %-15s|\n", "   Id", "Tên khách hàng", "   SĐT", "Địa chỉ", "Tên bánh", "Số lượng", "Giá", "Trạng thái");
//            System.out.printf("| %-15d %-20s %-15s %-15s %-15s %-15d %-15f %-15s|\n", order.getId(), order.getName(), order.getPhone(), order.getStatus(), order.getAddress(), orderItem.getClothName(), orderItem.getQuantity(), orderItem.getPrice(), order.getStatus());
            System.out.println("|                                                                                                                                     |");
            System.out.println("======================================================================================================================================");

            boolean is = true;
            do {
                System.out.println("<== 9: Quay lại              0: Thoát");
                System.out.println("\nChọn chức năng ");
                System.out.print(" ⭆ ");
                int choice = input.nextInt();
                switch (choice) {
                    case 9:
                        ManagerOrderView.run();
                        break;
                    case 0:
                        Menu.exit();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Nhấn không đúng! vui lòng chọn lại");
                        is = false;
                }
            } while (!is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


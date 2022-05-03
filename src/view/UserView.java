package view;

import model.User;

import java.util.List;
import java.util.Scanner;

public class UserView {
    Scanner input = new Scanner(System.in);

    public void addUser(){
        try {
            System.out.println("Nhập id");
            System.out.print(" ⭆ ");
            int id = input.nextInt();
            input.nextLine();
//            if (userService.exist(id)) {
//                System.out.println("Id này đã tồn tại. Vui lòng nhập id khác!");
//                addUser();
//            } else {
                System.out.println("Nhập Username");
                System.out.print(" ⭆ ");
                String userName = input.nextLine();
//                while (userService.checkDuplicateUserName(userName)) {
//                    System.out.println("Username này đã tồn tại. Vui lòng nhập lại");
//                    System.out.print(" ⭆ ");
//                    userName = scanner.nextLine();
//                }
                System.out.println("Nhập mật khẩu( mật khẩu phải > 8 kí tự" + ")");
                System.out.print(" ⭆ ");
                String password = input.nextLine();
//                while (!ValidateUtils.isPasswordValid(password)) {
//                    System.out.println("Mật khẩu yếu! Vui lòng nhập lại ");
//                    System.out.print(" ⭆ ");
//                    password = scanner.nextLine();
//                }
                System.out.println("Nhập họ và tên (vd: Mai Văn Phúc Thịnh) ");
                System.out.print(" ⭆ ");
                String name = input.nextLine();
//                while (!ValidateUtils.isNameValid(name)) {
//                    System.out.println("Tên " + name + "không đúng định dạng." + " Vui lòng nhập lại!" + " (Tên phải viết hoa chữ cái đầu và không dấu)");
//                    System.out.println("Nhập tên (vd: Ho Thuan) ");
//                    System.out.print(" ⭆ ");
//                    name = scanner.nextLine();
//                }
                System.out.println("Nhập số điện thoại (vd: 0787626102): ");
                System.out.print(" ⭆ ");
                String phone = input.nextLine();
//                while (!ValidateUtils.isPhoneValid(phone)) {
//                    System.out.println("Số " + phone + " của bạn không đúng định dạng. Vui lòng nhập lại! " + "(Số điện thoại bao gồm 10 số và bắt đầu là số 0)");
//                    System.out.println("Nhập số điện thoại (vd: 0345129876)");
//                    System.out.print(" ⭆ ");
//                    phone = scanner.nextLine();
//                }
//                while (userService.checkDuplicatePhone(phone)) {
//                    System.out.println("Số điện thoại này đã tồn tại! vui lòng kiểm tra lại!");
//                    System.out.println("Nhập số điện thoại (vd: 0345129876)");
//                    System.out.print(" ⭆ ");
//                    phone = scanner.nextLine();
//                }
                System.out.println("Nhập email (vd: phucthinh2609@gmail.com)");
                System.out.print(" ⭆ ");
                String email = input.nextLine();
//                while (!ValidateUtils.isEmailValid(email)) {
//                    System.out.println("Email" + email + "của bạn không đúng định dạng! Vui lòng kiểm tra và nhập lại ");
//                    System.out.println("Nhập email (vd: thuan@gmail.com)");
//                    System.out.print(" ⭆ ");
//                    email = scanner.nextLine();
//                }
//                while (userService.checkDuplicateEmail(email)) {
//                    System.out.println("Email" + email + "của bạn đã tồn tại! vui lòng kiểm tra lại");
//                    System.out.println("Nhập email (vd: thuan@gmail.com)");
//                    System.out.print(" ⭆ ");
//                    email = scanner.nextLine();
//                }
                System.out.println("Nhập địa chỉ (vd: Huế)");
                System.out.print(" ⭆ ");
                String address = input.nextLine();

                boolean is = true;
                String role = "";
                do{
                    System.out.println("┌ - CHỌN ROLE - ┐");
                    System.out.println("︲  1. Admin    ︲");
                    System.out.println("︲  2. User     ︲");
                    System.out.println("└ - - - - - - - ┘");

                    System.out.println("Chọn chức năng");
                    System.out.print(" ⭆ ");
                    int choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            role = "Admin";
                            break;
                        case 2:
                            role = "User";
                            break;
                        default:
                        System.out.println("Nhấn không đúng! vui lòng chọn lại");
                        is = false;
                    }
                } while (!is);


                User user = new User(id, userName, password, name, phone, email, address, role);
//                setRole(user);
//                userService.add(user);
                System.out.println("Đã thêm thành công!\uD83C\uDF8A");
//            }

            boolean check = true;
            do {
                System.out.println("===========================================");
                System.out.println("|                                         |");
                System.out.println("|    1. Nhấn 'y' để sửa tiếp              |");
                System.out.println("|    2. Nhấn 'q' để quay lại              |");
                System.out.println("|    3. Nhấn 't' để thoát chương trình    |");
                System.out.println("|                                         |");
                System.out.println("===========================================");
                System.out.println("Chọn chức năng");
                System.out.print(" ⭆ ");
                String chon = input.nextLine();
                switch (chon) {
                    case "y":
                        addUser();
                        break;
                    case "q":
                        ManagerUserView.run();
                        break;
                    case "t":
                        Menu.exit();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Nhấn không đúng! vui lòng chọn lại");
                        check = false;
                }
            } while (!check);
        } catch (Exception e) {
            System.out.println("Nhập sai. vui lòng nhập lại!");
        }
    }


    public void updateUser(){
        try {
            show();
//            userService.getUsers();
            System.out.println("Nhập id bạn muốn sửa");
            System.out.print(" ⭆ ");
            int id = input.nextInt();
            input.nextLine();
            // User user = userService.getUserById(id);
//            if (userService.exist(id)) {
                System.out.println("┌ - - - - - SỬA - - - - - ┐");
                System.out.println("︲  1. Đổi tên            ︲");
                System.out.println("︲  2. Sửa số điện thoại  ︲");
                System.out.println("︲  3. Sửa địa chỉ        ︲");
                System.out.println("︲  4. Quay lại           ︲");
                System.out.println("└ - - - - - - - - - - - - ┘");
                System.out.println("<== 9: Quay lại User Menu     0: Thoát");
                System.out.println("Chọn chức năng");
                System.out.print(" ⭆ ");
                int choice = input.nextInt();
                input.nextLine();
//                User user = new User();
//                user.setId(id);
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên mà bạn muốn sửa đổi");
                        System.out.print(" ⭆ ");
                        String name = input.nextLine();
//                        user.setName(name);
//                        userService.update(user);
                        System.out.println("Bạn đã đổi tên thành công!\uD83C\uDF89");
                        break;
                    case 2:
                        System.out.println("Nhập số điện thoại mà bạn muốn đổi");
                        System.out.print(" ⭆ ");
                        String phone1 = input.nextLine();
//                        while (!ValidateUtils.isPhoneValid(phone1)) {
//                            System.out.println("Số " + phone1 + " của bạn không đúng. Vui lòng nhập lại! " + "(Số điện thoại bao gồm 10 số và bắt đầu là số 0)");
//                            System.out.println("Nhập số điện thoại (vd: 0345129876)");
//                            System.out.print(" ⭆ ");
//                            phone1 = input.nextLine();
//                        }
//                        while (userService.checkDuplicatePhone(phone1)) {
//                            System.out.println("Số này đã tồn tại! Mời bạn nhập lại");
//                            System.out.print(" ⭆ ");
//                            phone1 = scanner.nextLine();
//                        }
//                        user.setPhone(phone1);
//                        userService.update(user);
                        System.out.println("Bạn đã đổi số điện thoại thành công\uD83C\uDF89");
                        break;
                    case 3:
                        System.out.println("Nhập địa chỉ mà bạn muốn đổi");
                        System.out.print(" ⭆ ");
                        String address = input.nextLine();
//                        user.setAddress(address);
//                        userService.update(user);
                        System.out.println("Bạn đã đổi thành công\uD83C\uDF89");
                        break;
                    case 9:
                        ManagerUserView.run();
                    case 0:
                        Menu.exit();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                        updateUser();
                }

                boolean is = true;
                do {
                    System.out.println("===========================================");
                    System.out.println("|                                         |");
                    System.out.println("|    1. Nhấn 'y' để sửa tiếp              |");
                    System.out.println("|    2. Nhấn 'q' để quay lại              |");
                    System.out.println("|    3. Nhấn 't' để thoát chương trình    |");
                    System.out.println("|                                         |");
                    System.out.println("===========================================");
                    System.out.print(" ⭆ ");
                    String chon = input.nextLine();
                    switch (chon) {
                        case "y":
                            updateUser();
                            break;
                        case "q":
                            ManagerUserView.run();
                        case "t":
                            Menu.exit();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Nhấn không đúng! vui lòng chọn lại");
                            is = false;
                    }
                } while (!is);

//            } else {
//                System.out.println("Không tìm thấy id! Vui lòng nhập lại");
//                updateUser();
//            }
        } catch (Exception e) {
            System.out.println("Nhập sai! vui lòng nhập lại");
        }
    }


    public void show(){
        System.out.println("----------------------------------------- DANH SÁCH NGƯỜI DÙNG--------------------------------------- ");
        System.out.printf("%-5s %-22s %-15s %-22s %-20s %-10s \n", "Id", "Tên", "Số điện thoại", "Email", "Địa chỉ", "Người dùng");
//        List<User> users = userService.getUsers();
        User[] users = new User[3];
        users[0] = new User(111, "phucthinh123", "thinh123", "Phúc Thịnh", "07876262102", "phucthinh2609@gmail.com", "Huế", "Admin");
        users[1] = new User(222, "thienan456", "an123", "Thiên Ân", "0983764221", "thienan2000@gmail.com", "Huế", "User");
        users[2] = new User(333, "trucly245", "ly123", "Trúc Ly", "0283764834", "trucly.235@gmail.com", "Quảng Trị", "User");

        for (User user : users) {
            System.out.printf("%-5d %-22s %-15s %-22s %-20s %-10s\n", user.getId(), user.getName(), user.getPhone(), user.getEmail(), user.getAddress(), user.getRole());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------  ");
        System.out.println(" ");
    }

    public void showUsers(){
        try {
            show();
            boolean is = true;
            do {
                System.out.println("<== 9: Quay lại        0: Thoát");
                System.out.println("\nChọn chức năng ");
                System.out.print(" ⭆ ");
                int choice = input.nextInt();
                switch (choice) {
                    case 9:
                        ManagerUserView.run();
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
            e.getStackTrace();
        }
    }
}

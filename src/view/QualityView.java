package view;

import model.Clothes;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class QualityView {
    Scanner input = new Scanner(System.in);

    //  ===IMPORT==============================================

    public void importGoods(){
        try{
            boolean is = true;
            do{
                System.out.println("\n=====================================");
                System.out.println("|        IMPORT GOODS MENU          |");
                System.out.println("=====================================");
                System.out.println("|                                   |");
                System.out.println("|    1. Thêm hàng nhập              |");
                System.out.println("|    2. Sửa thông tin hàng nhập     |");
                System.out.println("|    3. Danh sách hàng nhập         |");
                System.out.println("|                                   |");
                System.out.println("=====================================");
                System.out.println("<== 9: Quay lại              0: Thoát");
                System.out.println("\nChọn chức năng ");
                System.out.print(" ⭆ ");
                int choice = input.nextInt();
                switch (choice){
                    case 1:
                        addImport();
                        break;
                    case 2:
                        updateImport();
                        break;
                    case 3:
                        showImportList();
                        break;
                    case 9:
                        ManagerQualityView.run();
                        break;
                    case 0:
                        Menu.exit();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Nhấn không đúng! vui lòng chọn lại");
                        is = false;
                }
            }while (!is);
        }catch(Exception e){
            System.out.println("Nhập sai. vui lòng nhập lại!");
        }
    }

    public void showImport() {
        System.out.println("\n=======================================================================================");
        System.out.println("|                                     DANH SÁCH HÀNG NHẬP                             |");
        System.out.println("=======================================================================================");
        System.out.println("|                                                                                     |");
        System.out.printf("| %-15s %-20s %-15s %-15s %-15s|\n", "   Id", "Tên sản phẩm", "   Giá", "Số lượng", "Ngày xuất");
        System.out.printf("| %-15s %-20s %-15s %-15s %-15s|\n", "   1010", "Lazer 303", "   40.000", "109", LocalDate.now());
        System.out.printf("| %-15s %-20s %-15s %-15s %-15s|\n", "   1013", "Pants 907", "   20.000", "91", LocalDate.now());
//            System.out.printf("| %-15d %-20s %-15s %-15s %-15s |\n", order.getId(), order.getName(), order.getPhone(), order.getStatus(), order.getAddress(), orderItem.getClothName());
        System.out.println("|                                                                                     |");
        System.out.println("=======================================================================================");
    }

    public void showImportList(){
        try {
            showImport();

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

    public void addImport(){
        System.out.println("Nhập id sản phẩm: ");
        System.out.print(" ⭆ ");
        String id = input.nextLine();


        System.out.println("Nhập tên sản phẩm: ");
        System.out.print(" ⭆ ");
        String name = input.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        System.out.print(" ⭆ ");
        String price = input.nextLine();

        System.out.println("Nhập số lượng sản phẩm: ");
        System.out.print(" ⭆ ");
        String quantity = input.nextLine();

        LocalDate date = LocalDate.now();

        System.out.println("\nĐã thêm hàng nhập thành công \uD83C\uDF8A\n");

        do {
            System.out.println("===========================================");
            System.out.println("|                                         |");
            System.out.println("|     1.Nhấn 'y' để tạo tiếp đơn hàng     |");
            System.out.println("|     2. Nhấn 'q' để trở lại              |");
            System.out.println("|     3. Nhấn 't' để thoát                |");
            System.out.println("|                                         |");
            System.out.println("===========================================");
            System.out.println("\nChọn chức năng ");
            System.out.print(" ⭆ ");
            String choice = input.nextLine();
            switch (choice) {
                case "y":
                    addImport();
                    break;
                case "q":
                    importGoods();
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

    public void updateImport(){
        try {
            showImport();

            System.out.println("Nhập id bạn muốn sửa");
            System.out.print(" ⭆ ");
            int id = input.nextInt();
            input.nextLine();

            System.out.println("┌ - - - - - SỬA - - - - - ┐");
            System.out.println("︲  1. Đổi tên            ︲");
            System.out.println("︲  2. Sửa giá            ︲");
            System.out.println("︲  3. Sửa số lượng       ︲");
            System.out.println("︲  4. Quay lại           ︲");
            System.out.println("└ - - - - - - - - - - - - ┘");
            System.out.println("<== 9: Quay lại User Menu     0: Thoát");
            System.out.println("Chọn chức năng");
            System.out.print(" ⭆ ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Nhập tên mà bạn muốn sửa đổi");
                    System.out.print(" ⭆ ");
                    String name = input.nextLine();
                    System.out.println("\nĐã sửa tên thành công \uD83C\uDF8A");
                    break;
                case 2:
                    System.out.println("Nhập giá mà bạn muốn sửa đổi");
                    System.out.print(" ⭆ ");
                    String price = input.nextLine();
                    System.out.println("\nĐã sửa giá thành công \uD83C\uDF8A");
                    break;
                case 3:
                    System.out.println("Nhập số lượng mà bạn muốn sửa đổi");
                    System.out.print(" ⭆ ");
                    String quantity = input.nextLine();
                    System.out.println("\nĐã giá nhập thành công \uD83C\uDF8A");
                    break;
                case 4:
                    ManagerQualityView.run();
                case 0:
                    Menu.exit();
                    System.exit(0);
                default:
                    System.out.println("Nhập không hợp lệ! Vui lòng nhập lại");
                    updateImport();
            }

        }
        catch (Exception e){
            System.out.println("Nhập sai! vui lòng nhập lại");
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
                    updateImport();
                    break;
                case "q":
                    importGoods();
                case "t":
                    Menu.exit();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhấn không đúng! vui lòng chọn lại");
                    is = false;
            }
        } while (!is);
    }

//  ===EXPORT==============================================

    public void exportGoods(){
        try{
            boolean is = true;
            do{
                System.out.println("\n=====================================");
                System.out.println("|        EXPORT GOODS MENU          |");
                System.out.println("=====================================");
                System.out.println("|                                   |");
                System.out.println("|    1. Thêm hàng xuất              |");
                System.out.println("|    2. Sửa thông tin hàng xuất     |");
                System.out.println("|    3. Danh sách hàng xuất         |");
                System.out.println("|                                   |");
                System.out.println("=====================================");
                System.out.println("<== 9: Quay lại              0: Thoát");
                System.out.println("\nChọn chức năng ");
                System.out.print(" ⭆ ");
                int choice = input.nextInt();
                switch (choice){
                    case 1:
                        addExport();
                        break;
                    case 2:
                        updateExport();
                        break;
                    case 3:
                        showExportList();
                        break;
                    case 9:
                        ManagerQualityView.run();
                        break;
                    case 0:
                        Menu.exit();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Nhấn không đúng! vui lòng chọn lại");
                        is = false;
                }
            }while (!is);
        }catch(Exception e){
            System.out.println("Nhập sai. vui lòng nhập lại!");
        }
    }

    public void addExport(){

        System.out.println("Nhập id sản phẩm: ");
        System.out.print(" ⭆ ");
        String id = input.nextLine();


        System.out.println("Nhập tên sản phẩm: ");
        System.out.print(" ⭆ ");
        String name = input.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        System.out.print(" ⭆ ");
        String price = input.nextLine();

        System.out.println("Nhập số lượng sản phẩm: ");
        System.out.print(" ⭆ ");
        String quantity = input.nextLine();

        LocalDate date = LocalDate.now();

        System.out.println("\nĐã thêm hàng xuất thành công \uD83C\uDF8A");

        do {
            System.out.println("===========================================");
            System.out.println("|                                         |");
            System.out.println("|     1.Nhấn 'y' để tạo tiếp đơn hàng     |");
            System.out.println("|     2. Nhấn 'q' để trở lại              |");
            System.out.println("|     3. Nhấn 't' để thoát                |");
            System.out.println("|                                         |");
            System.out.println("===========================================");
            System.out.println("\nChọn chức năng ");
            System.out.print(" ⭆ ");
            String choice = input.nextLine();
            switch (choice) {
                case "y":
                    addExport();
                    break;
                case "q":
                    exportGoods();
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

    public void updateExport(){
        try {
            showExport();

            System.out.println("Nhập id bạn muốn sửa");
            System.out.print(" ⭆ ");
            int id = input.nextInt();
            input.nextLine();

            System.out.println("┌ - - - - - SỬA - - - - - ┐");
            System.out.println("︲  1. Đổi tên            ︲");
            System.out.println("︲  2. Sửa giá            ︲");
            System.out.println("︲  3. Sửa số lượng       ︲");
            System.out.println("︲  4. Quay lại           ︲");
            System.out.println("└ - - - - - - - - - - - - ┘");
            System.out.println("<== 9: Quay lại User Menu     0: Thoát");
            System.out.println("Chọn chức năng");
            System.out.print(" ⭆ ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Nhập tên mà bạn muốn sửa đổi");
                    System.out.print(" ⭆ ");
                    String name = input.nextLine();
                    System.out.println("\nĐã sửa tên thành công \uD83C\uDF8A");
                    break;
                case 2:
                    System.out.println("Nhập giá mà bạn muốn sửa đổi");
                    System.out.print(" ⭆ ");
                    String price = input.nextLine();
                    System.out.println("\nĐã sửa giá thành công \uD83C\uDF8A");
                    break;
                case 3:
                    System.out.println("Nhập số lượng mà bạn muốn sửa đổi");
                    System.out.print(" ⭆ ");
                    String quantity = input.nextLine();
                    System.out.println("\nĐã giá nhập thành công \uD83C\uDF8A");
                    break;
                case 4:
                    ManagerQualityView.run();
                case 0:
                    Menu.exit();
                    System.exit(0);
                default:
                    System.out.println("Nhập không hợp lệ! Vui lòng nhập lại");
                    updateImport();
            }

        }
        catch (Exception e){
            System.out.println("Nhập sai! vui lòng nhập lại");
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
                    updateExport();
                    break;
                case "q":
                    exportGoods();
                case "t":
                    Menu.exit();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhấn không đúng! vui lòng chọn lại");
                    is = false;
            }
        } while (!is);
    }

    public void showExport(){
        System.out.println("\n=======================================================================================");
        System.out.println("|                                     DANH SÁCH HÀNG XUẤT                             |");
        System.out.println("=======================================================================================");
        System.out.println("|                                                                                     |");
        System.out.printf("| %-15s %-20s %-15s %-15s %-15s|\n", "   Id", "Tên sản phẩm", "   Giá", "Số lượng", "Ngày xuất");
        System.out.printf("| %-15s %-20s %-15s %-15s %-15s|\n", "   1010", "Lazer 303", "   40.000", "109", LocalDate.now());
        System.out.printf("| %-15s %-20s %-15s %-15s %-15s|\n", "   1013", "Pants 907", "   20.000", "91", LocalDate.now());
//            System.out.printf("| %-15d %-20s %-15s %-15s %-15s |\n", order.getId(), order.getName(), order.getPhone(), order.getStatus(), order.getAddress(), orderItem.getClothName());
        System.out.println("|                                                                                     |");
        System.out.println("=======================================================================================");
    }

    public void showExportList(){

        try {
            showExport();
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

    //  ===ALL==============================================

    public void show(){

        Clothes[] clothes = new Clothes[3];
        clothes[0] = new Clothes(111, "Blazer", 99.000, 11, "Đa dạng màu sắc");
        clothes[1] = new Clothes(222, "Pull Us", 49.000, 32, "Đa dạng kiểu dáng");
        clothes[2] = new Clothes(222, "Quần Kaki", 79.000, 10, "Chất kaki miễn bàn");

        System.out.println("-----------------------------------------DANH SÁCH SẢN PHẨM-------------------------------------------");
        System.out.printf("%-10s %-30s %-18s %-10s %-10s", "Id", "Tên sản phẩm", "Giá", "Số lượng", "Mô tả");
        System.out.println(" ");
        for (Clothes cloth : clothes) {
            System.out.printf("%-10d %-30s %-18f %-10d %-10s\n", cloth.getId(), cloth.getName(), cloth.getPrice(),
                    cloth.getQuantity(), cloth.getDescription());
        }
        System.out.println("--------------------------------------------------------------------------------------------------\n");

    }

    public void showGoods(){
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
                        ManagerQualityView.run();
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
            System.out.println("Nhập sai. vui lòng nhập lại!");;
        }
    }
}

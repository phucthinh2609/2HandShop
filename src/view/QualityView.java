package view;

import model.Clothes;

import java.util.List;

public class QualityView {
    public void importGoods(){
        System.out.println("\n>>Đã hiển thị danh sách hàng nhập<<\n");
    }


    public void exportGoods(){
        System.out.println("\n>>Đã hiển thị danh sách hàng xuất<<\n");
    }

    public void showGoods(){

        Clothes[] clothes = new Clothes[3];
        clothes[0] = new Clothes(111, "Blazer", 99.000, 11, "Đa dạng màu sắc");
        clothes[1] = new Clothes(222, "Pull Us", 49.000, 32, "Đa dạng kiểu dáng");
        clothes[2] = new Clothes(222, "Quần Kaki", 79.000, 10, "Chất kaki miễn bàn");

        System.out.println("-----------------------------------------DANH SÁCH BÁNH-------------------------------------------");
        System.out.printf("%-10s %-30s %-18s %-10s %-10s", "Id", "Tên bánh", "Giá bánh", "Số lượng", "Mô tả");
        System.out.println(" ");
        for (Clothes cloth : clothes) {
            System.out.printf("%-10d %-30s %-18f %-10d %-10s\n", cloth.getId(), cloth.getName(), cloth.getPrice(),
                    cloth.getQuantity(), cloth.getDescription());
        }
        System.out.println("--------------------------------------------------------------------------------------------------\n");

        System.out.println("\n>>Đã hiển thị danh sách hàng trong kho<<\n");

    }
}

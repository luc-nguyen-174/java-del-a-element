import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thuc hien xoa phan tu khoi mang.");
        int[] arr = {4, 5, 26, 7, 2, 8};

        System.out.print("Nhap vao phan tu can xoa:");
        int x = scanner.nextInt();

        System.out.println("độ dài ban đầu " + arr.length);

        if (x < arr.length) {
            for (int i = x; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.println("Mang sau khi xoa la: ");
            for (int i =0;i <arr.length-1;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nDo dai sau khi xoa:"+" "+ (arr.length-1));
        }else System.out.println("so vua nhap vuot qua do dai cua mang!");
    }
}
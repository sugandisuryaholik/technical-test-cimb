import java.util.Scanner;
public class Graphic {
    public static void main(String[]
        args) {

        Scanner scanner = new 
    Scanner(System.in);

    System.out.print("Masukan jumlah data ");
        int n = scanner.nextInt();
            int[] data = new int[n];

            for (int i = 0; i <
                data.length; i++) {
                    data[i] = scanner.nextInt();
                }
        scanner.close();
        
    }
}
import java.util.Scanner;
//Install the java util scanner
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Namalu siapa?");
        String name = scanner.nextLine();
        System.out.println("Umur brp?");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println("Suka makan apa?");
        String makanan = scanner.nextLine();
        
        System.out.println("Nama saya " + name);
        System.out.println("Umur saya " + age);
        System.out.println("Makanan favorit saya " + makanan);
    }
}


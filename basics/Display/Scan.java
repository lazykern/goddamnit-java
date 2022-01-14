import java.util.Scanner;

public class Scan {
    public static void main(String[] args)
    {
        Scanner sc_sys_in = new Scanner(System.in);
        String name = sc_sys_in.nextLine();
        Integer age = Integer.parseInt(sc_sys_in.nextLine());

        System.out.printf("%s %d\n", name, age);
        System.out.print("And your next line is gonna be: ");
        sc_sys_in.nextLine();
    }
}

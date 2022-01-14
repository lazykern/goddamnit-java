public class LearnString {
    public static void main(String[] args)
    {
        String a = "100";
        int int_a = Integer.valueOf(a);

        System.out.println(a+50);
        System.out.println(int_a+50);

        String b = "123.456789";
        double double_b = Double.parseDouble(b);
        System.out.println(b+2);
        System.out.println(double_b+2);
    }
}

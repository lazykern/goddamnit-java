public class CheckType {
    public static void main(String[] args)
    {
        // The instanceof operator can only be applied to reference types (or null). double and int are primitive types, not reference types.

        String str_1 = "21312sadasdf";
        boolean result = str_1 instanceof String;
        System.out.println("str_1 is String " +  result);

        Integer int_1 = 1231231231;
        String int_1_type = int_1.getClass().toString();
        System.out.println("int_1 is " + int_1_type);

        Object o = (double)int_1;
        System.out.println("o is " + o.getClass().getSimpleName());
    }
}

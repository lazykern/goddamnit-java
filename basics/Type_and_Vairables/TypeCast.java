class TypeCast
{
    public static void main(String[] args)
    {

        // Wide Type Casting: Small -> Big
        int wide_int = 10;
        double wide_double = wide_int;

        System.out.println(wide_double);

        // Narrow Type Casting: Big -> Small
        double narrow_double = 10.123543;
        int narrow_int = (int)narrow_double;

        System.out.println(narrow_int);

    }
}
package Lec5;

public class ScopeReview {
    static void scopeMethod(int var1)
    {
        String var2;
        if (var1>0)
        {
            var2="above 0";
        }
        else
        {
            var2="less than equal to 0";
        }
        System.out.println(var2);
    }

    public static void main(String[] arguments)
    {
        scopeMethod(1);
        scopeMethod(-1);
    }
}

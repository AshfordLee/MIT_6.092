package Ass2;

class Calculate_Pay {
    public static double calculate_base_Pay(int hours,double hourly_pay)
    {
        return hours*hourly_pay;
    }

    public static double calculate_extra_Pay(int hours,double hourly_pay)
    {
        return hours*hourly_pay*1.5;
    }

    public static int ExtraHours(int hours)
    {
        if (hours>40)
        {
            return hours-40;
        }
        else
        {
            return 0;
        }
    }

    public static int BaseHours(int hours)
    {
        if (hours>40)
        {
            return 40;
        }
        else
        {
            return hours;
        }
    }

    public static double calculate_Pay(double base_pay,int hours_worked)
    {

        if (base_pay<8.0)
        {
            System.out.println("You must be paid at least $8.00/hour");
            return -1;
        }

        if (hours_worked>60)
        {
            System.out.println("You can't work more than 60 hours a week");
            return -1;
        }

        int base_hours=BaseHours(hours_worked);
        double base=calculate_base_Pay(base_hours,base_pay);

        int extra_hours=ExtraHours(hours_worked);
        double extra=calculate_extra_Pay(extra_hours,base_pay);

        return base+extra;
    }

    public static void main(String[] arguments)
    {
        double basepay1=7.5;
        double basepay2=8.2;
        double basepay3=10.0;

        int hours1=35;
        int hours2=47;
        int hours3=73;

        double pay1=calculate_Pay(basepay1,hours1);
        double pay2=calculate_Pay(basepay2,hours2);
        double pay3=calculate_Pay(basepay3,hours3);

        System.out.println("Pay for employee 1: "+pay1);
        System.out.println("Pay for employee 2: "+pay2);
        System.out.println("Pay for employee 3: "+pay3);
    }
}

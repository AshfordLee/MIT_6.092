package Lec4;




public class Baby
{
    String name;
    boolean isMale;
    double weight;
    double decibels;
    int numPoops=0;
    Baby[] siblings;

    Baby(String name, boolean isMale, double weight, double decibels, int numPoops, Baby[] siblings)
    {
        this.name=name;
        this.isMale=isMale;
        this.weight=weight;
        this.decibels=decibels;
        this.numPoops=numPoops;
        this.siblings=siblings;
    }

    void poop()
    {
        this.numPoops+=1;
        System.out.println("Dear mother, "+"I have pooped. Ready the diaper.");
    }

    void sayHi()
    {
        System.out.println("Hi, I'm "+this.name);
    }

    public static void main(String[] arguments)
    {
        Baby baby1=new Baby("John", true, 7.0, 100.0, 0, null);


        baby1.poop();
        
    }
}



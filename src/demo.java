import java.util.Scanner;
class rectangle {
    int l, b, a;

    rectangle() {
        l = 5;
        b = 6;
    }

    void area() {
        a = l * b;
        System.out.println(a);
    }

}
class demo
{
    public static void main(String[] args)
    {
        rectangle obj=new rectangle();
        obj.area();
    }
}

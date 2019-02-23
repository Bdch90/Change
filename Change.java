import java.util.Scanner;

public class Change
{
    public static void main(String[] args)
    {
        int choice = 10;
        double c;
        double f;

        while (choice != 0)
        {   
            System.out.println("Menu");
            System.out.println("1 : C to F ");
            System.out.println("2 : F to C");
            System.out.println("0 : Exit");
            System.out.println("Enter your choice:");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter C:");
                    c = scanner.nextDouble();
                    System.out.println("Độ F : " + cToF(c));
                    break;
                case 2:
                    System.out.println("Enter F:");
                    f = scanner.nextDouble();
                    System.out.println("Độ C : " + cToF(f));
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static double cToF(double c)
    {
        double f = (9.0 / 5) * c + 32;
        return f;
    }
    public static double fToC(double f)
    {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}

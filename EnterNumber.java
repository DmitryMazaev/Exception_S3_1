import java.util.Scanner;

public class EnterNumber {

    public static double enterNumber() throws CustomException
    {
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        in.close();
        if (number <= 0)
        {
            throw new CustomException("Некорректное число");
        }
        return number;
    }
}

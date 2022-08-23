import java.io.*;
public class PrintMultiples {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++)
        {
            if(i%3==0)
            {
                continue;

            }
            System.out.println(i);
        }
    }
}

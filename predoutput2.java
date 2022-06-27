import java.io.*;
import java.util.*;
class predoutput2
    {
        public void main()
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i =1 ;
            while(i <= n)
            {
                int j = 1;
                while(j<=i)
                {
                    System.out.print(j);
                    j++;
                }
                while(j>=1)
                {
                System.out.print(j);
                j--;
                }   
                System.out.println(" ");
                i++;
            }
        }
    }
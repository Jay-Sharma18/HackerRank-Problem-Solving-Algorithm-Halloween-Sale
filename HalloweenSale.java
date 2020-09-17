package JavaAlgorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HalloweenSale {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
    
        //count of video games that can be bought
        int count=0;
        //if one game is more than money in hand, return 0
        if(s<p)
        {
            return count;
        }
        //if money in hand > price of first game,buy the game at original price
        else if(s>=p)
        {
            s=s-p;
            count++;
        }

        //if money left > price of second game, buy more games at discounted price
        if(s>(p-d))
        {
            while(s>=m)
            {   
                //if discounted price greater than m, keep buying at discounted price
                if((p-d)>m && (p-d)<=s)
                {   
                    count++;
                    s=s-(p-d);
                    p=p-d;
                }
                //if discounted price less than or equal to m, buy at m price
                else if(s>=m)
                {   
                    count++;
                    s=s-m;
                }
                
            }
        }
    
    return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Jay\\Desktop\\Selenium and Drivers\\test test.txt"));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


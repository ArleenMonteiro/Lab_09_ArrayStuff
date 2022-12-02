import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int searchVal = SafeInput.getRangedInt(in,"What number would you like to search for",1,100);
        int timesFound = 0;
        int sum = 0;

        boolean foundFlag = false;

        int[] dataPoints = new int[100];
        Random gen = new Random();

        for (int l = 0; l < dataPoints.length; l++)
        {
            dataPoints[l] = gen.nextInt(100) + 1;
            sum += dataPoints[l];
        }

        for (int l = 0; l < dataPoints.length; l++)
            System.out.printf("%4d",dataPoints[l]);

        System.out.println();

        for (int l = 0; l < dataPoints.length; l++)
            System.out.print(dataPoints[l] + "| ");

        System.out.println();

        System.out.println("\nThe sum of the array values is " + sum);
        System.out.println("The average of the array values is "+sum/ dataPoints.length);

        for (int t = 0; t < dataPoints.length; t++)
        {
            if (dataPoints[t] == searchVal)
            {
                System.out.println("Found at: " + t);
                foundFlag = true;
                timesFound ++;
            }
        }
        System.out.println("Finished the search!");
        if (!foundFlag)
            System.out.println("Did not find the value " + searchVal);
        else
            System.out.println(searchVal + " was found " + timesFound + " times");
        foundFlag = false;

        for (int t = 0; t < dataPoints.length; t++)
        {
            if (dataPoints[t] == searchVal)
            {
                System.out.println("The first time " + searchVal + " was found at it was found at: " + t);
                foundFlag = true;
                break;
            }
        }
        System.out.println("Finished the search!");
        if (!foundFlag)
            System.out.println("Did not find the value " + searchVal);
        foundFlag = false;

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int l = 0; l < dataPoints.length; l++)
        {
            if (dataPoints[l] < min)
                min = dataPoints[l];
            if (dataPoints[l] > max)
                max = dataPoints[l];
        }
        System.out.println("Minimum data point is " + min);
        System.out.println("Maximum data point is " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
        System.out.println("Minimum of dataPoints is: " + min(dataPoints));
        System.out.println("Minimum of dataPoints is: " + max(dataPoints));
        System.out.println("The target value occurs " + occuranceScan(dataPoints, 69) + " times");
        System.out.println("The sum of dataPoints is: " + sum(dataPoints));
        boolean targetTest = contains(dataPoints,69);
        //




    }







    public static double getAverage(int values[])
    {
        double x = 0;
        int counter = 0;
        double average;
        for (int l = 0; l < values.length; l++)
        {
            counter++;
            x = x + values[l];
        }
        average = x / counter;
        return average;
    }

    public static int min(int values[])
    {
        int min = values[0];
        for (int l = 0; l < values.length; l++)
        {
            if (values[l] < min) // gao a new min
                min = values[l];
        }
        return min;
    }

    public static int max(int values[])
    {
        int max = values[0];
        for (int l = 0; l < values.length; l++)
        {
            if (values[l] > max)
                max = values[l];
        }
        return max;
    }

    public static int occuranceScan(int values[], int target)
    {
        int timesFound = 0;
        for (int t = 0; t < values.length; t++)
        {
            if (values[t] == target)
            {
                System.out.println("Found at: " + t);
                timesFound ++;
            }
        }
        return timesFound;
    }

    public static int sum(int values[])
    {
        int sum = 0;

        for (int l = 0; l < values.length; l++)
        {
            sum += values[l];
        }
        return sum;
    }

    public static boolean contains(int values[], int target)
    {
        boolean found = false;
        for (int t = 0; t < values.length; t++)
        {
            if (values[t] == target)
            {
                found = true;
            }
        }
        System.out.println("Finished the search!");
        if (!found)
            System.out.println("Did not find the value " + target);
        else
            System.out.println(target + " was found " );

        return found;
    }
}
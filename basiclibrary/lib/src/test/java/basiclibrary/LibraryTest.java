/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testRollMethod(){
        Library library = new Library();
        int size = 10;
        int[] arr = library.roll(size);
        assertEquals("roll() method must return an array with the same size as its input",size, arr.length);
        int size2 = 0;
        assertEquals("roll() method must return an empty array'[]' ", "[]",Arrays.toString(library.roll(size2)));
    }

    @Test
    public void testContainsDuplicatesMethod(){
        Library library = new Library();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        assertFalse("this method should return false", library.containsDuplicates(arr));

        int[] arr2 = {1,2,1,2,1,2};
        assertTrue("this method should return true", library.containsDuplicates(arr2));

        int[] arr3 = {1};
        assertFalse("this method should return false", library.containsDuplicates(arr3));
    }

    @Test
    public void testCalculatingAveragesMethod(){
        Library library = new Library();
        int[] arr = {1,2,3,6};
        assertEquals("this method should return true if the sum of average is 3.0","3.0", library.calculatingAverages(arr)+"");
        int[] arr2 = {-10,5,2,0,1,-4,6};
        assertEquals("this method should return true if the sum of average is 0.0","0.0", library.calculatingAverages(arr2)+"");
        int[] arr3 = {};
        assertEquals("this method should return true if the sum of average is 0.0","0.0", library.calculatingAverages(arr3)+"");
    }

    @Test
    public void testCalculateArraysAverageMethod(){
        Library library = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] min = weeklyMonthTemperatures[2];
        int[][] arr = {};
        assertEquals("this method should return the array that has minimum average",min,
                library.calculateArraysAverage(weeklyMonthTemperatures));

        assertEquals("this method should return empty array",0,
                library.calculateArraysAverage(arr).length);
    }

    @Test
    public void testAnalyzeWeather(){
        Library library = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        HashMap<String, Integer> map = library.analyzeWeather(weeklyMonthTemperatures);

        Integer expectedMin = 51;
        Integer actualMin = map.get("min");
        assertEquals("This method checks the expectedMin which is 51 with actual", expectedMin, actualMin);
        System.out.println("Low: " + actualMin);

        Integer expectedMax = 72;
        Integer actualMax = map.get("max");
        assertEquals("This method checks the expectedMin which is 51 with actual", expectedMax, actualMax);
        System.out.println("High: " + actualMax);

        Integer[] expectedUniqueTemps = {64,66,70,71,72,51,52,53,54,56,58,59,61,62};
        Integer size = map.get("size");
        for(int i=0; i<size; i++){
            assertEquals("method will check every expected temp with actual temp", expectedUniqueTemps[i], map.get(i+""));
            System.out.println("Never saw temperature: " + map.get(i+""));
        }
    }

    @Test
    public void testTally(){
        Library library = new Library();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String expectedWinner = "Bush";
        String winner = library.tally(votes);
        System.out.println(winner + " received the most votes!");
        assertEquals("This method tests that Bush got the most votes", expectedWinner, winner);
    }

}

package ro.siit.bubbleSortingHomework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSortMethod {

    /**
     * This is the bubble sort function. At the beginning of the while, it assigns a boolean variable to false in order for the
     * if function to start and proceed with the loop. The loop compares the number at position i with the number at position i+1
     * and it swaps them if the condition is met. The loop will stop only when it has nothing to swap. The swap is done using the
     * temporary variable.
     * @param numbers represents an array of objects from the SalesRepresentatives class.
     */
    public static void sortSalesValues(SalesRepresentatives[] numbers) {
        boolean swap = true;

        while (swap) {

            swap = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i].getSalesValue() < numbers[i + 1].getSalesValue()) {
                    swap = true;
                    SalesRepresentatives temporary = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temporary;
                }
            }
        }
    }

    /**
     * Updated sorting method using Java 8 (Streams & Method Reference) to improve Bubble Sorting.
     * @param salesRepresentatives represents an array of SalesRepresentatives objects that is passed for sorting.
     * @return Returns a sorted list of Sales Representatives.
     */
    public List<SalesRepresentatives> alternativeSorting(SalesRepresentatives[] salesRepresentatives){

        return Arrays.stream(salesRepresentatives).sorted(Comparator.comparingDouble(SalesRepresentatives::getSalesValue).reversed()).collect(Collectors.toList());

    }
}

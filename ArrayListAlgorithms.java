import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ArrayListAlgorithms {
    /**
     * Returns true if any of the elements in stringList contain
     * target as a substring; false otherwise.
     * <p>
     * Does NOT mutate (modify) elements of stringList.
     * PRECONDITION: stringList.size() > 0
     *
     * @param stringList original arraylist of Strings
     * @return true if target is found in any of the strings, false otherwise
     */
    public static boolean containsTarget(ArrayList<String> stringList, String target)
    { for (String list : stringList){
    if (list.indexOf(target) != -1){
        return true;
    }

    }
        return false;
    }
    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */

    public static int belowAverage(ArrayList<Integer> intList)
    {
        double a = 0;
        int count =0;
        for (int i: intList) {
           a = a + (double)i;
    }
        a = a/(double)intList.size();
        for (int idx = 0; idx < intList.size(); idx++){
            if (intList.get(idx) < a){
                count++;
            }
        }
        return count;
    }
    public static void replaceWithCaps(ArrayList<String> wordList)
    { for (int i = 0; i < wordList.size(); i++)
    {
        String a = wordList.get(i);
        String b = a.substring(a.length()-1);
        if (b.equals("s")) {
            wordList.set(i, a.toUpperCase());
        }
        }
    }
    /** Returns the index at which the minimum value of all integers in
     *  intList appears; if the minimum value appears more than once in
     *  the arraylist, return the index of the first occurrence
     *
     *  Does NOT mutate (modify) elements in intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the index at which the minimum value occurs
     */
    public static int indexOfMinimum(ArrayList<Integer> intList)
    {
        int c = 0;
        int count = 0;
        int min = intList.get(0);
        for (int i = 1; i < intList.size(); i++){
            if (min > intList.get(i)) {
                min = intList.get(i);
            }

            for (int index : intList){
                while (index != min){
                    count++;
                }
            }
        }
        return count++;
    }
    }

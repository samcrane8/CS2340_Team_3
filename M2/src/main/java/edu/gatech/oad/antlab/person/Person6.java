package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 6
 *  returns their name and a
 *  modified string
 *
 *  @author Bob
 *  @version 1.1
 */
public class Person6 {
    /** Holds the persons real name */
    private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
    public Person6(String pname) {
        name = pname;
    }
    /**
     * This method should take the string
     * input and return its characters rotated
     * 2 positions.
     * given "gtg123b" it should return
     * "g123bgt".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        char[] arr = input.toCharArray();
        char[] ans = new char[input.length()];
        char temp1 = input.charAt(0);
        char temp2 = input.charAt(1);
        for (int i = 2; i < input.length(); i++) {
            ans[i - 2] = arr[i];
        }
        ans[input.length() - 2] = temp1;
        ans[input.length() - 1] = temp2;
        String ansString = new String(ans);
        return ansString;
    }

    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the
     *         object
     */
    public String toString(String input) {
        return name + calc(input);
    }

    //  Copied from Person5
}

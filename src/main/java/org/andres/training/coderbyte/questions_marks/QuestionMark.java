package org.andres.training.coderbyte.questions_marks;

/**
 * Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers,
 * letters, and question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10.
 * If so, then your program should return the string true, otherwise it should return the string false.
 * If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.
 * <p>
 * For example: if str is "arrb6???4xxbl5???eee5" then your program should return true
 * because there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.
 * <p>
 * Examples
 * Input: "aa6?9"
 * Output: false
 * <p>
 * Input: "acc?7??sss?3rr1??????5"
 * Output: true
 */
public class QuestionMark {
    public static final String THREE_QUESTIONS_MARKS = "???";

    public static void main(String[] args) {
        String str = "arrb6???4xxbl5???eee5";
        String str2 = "aa6?9";
        System.out.println(str.indexOf("???") - 1);
        System.out.println(str.indexOf("???") + 3);
        System.out.println(str2.indexOf("???"));
    }

    public boolean questionsMarks(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("null or empty String");
        }

        if (!str.contains(THREE_QUESTIONS_MARKS)) {
            return false;
        }

        int startIndex = str.indexOf(THREE_QUESTIONS_MARKS) - 1;
        int endIndex = str.indexOf(THREE_QUESTIONS_MARKS) + 3;

        return Character.isDigit(str.charAt(startIndex))
                &&
                Character.isDigit(str.charAt(endIndex));
    }
}

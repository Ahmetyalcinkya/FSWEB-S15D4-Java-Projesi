import com.workintech.stackChallange.StackChallange;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("checkForPalindrome");
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
        System.out.println("-----------------------------");
        System.out.println("checkForPalindromeQueue");
        System.out.println(checkForPalindromeQueue("abccba"));
        System.out.println(checkForPalindromeQueue("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindromeQueue("I did, did I?"));
        System.out.println(checkForPalindromeQueue("hello"));
        System.out.println(checkForPalindromeQueue("Don't node"));

        System.out.println(decimalToBinary(11));
    }

    public static boolean checkForPalindrome(String text) {
        StackChallange stack1 = new StackChallange(text);
        System.out.println("-----------------------------");
        System.out.println(stack1.getSentence());
        Stack<Character> charStack = new Stack<>();
        List<Character> charList = new LinkedList<>();
        List<Character> charList2 = new LinkedList<>();

        String removed = stack1.removeSpecials();
        char[] chars = removed.toCharArray();
        for(char c: chars){
            if(c != ' '){
               charStack.push(c); //push
               charList2.add(c);
            }
        }
        while (charStack.iterator().hasNext()){
            charList.add(charStack.pop()); //pop
        }
        if(charList.equals(charList2)){
            return true;
        }else {
        return false;
        }
    }
    public static boolean checkForPalindromeQueue(String text) {
        StackChallange stack1 = new StackChallange(text);
        System.out.println("-----------------------------");
        System.out.println(stack1.getSentence());
        Queue<Character> charQueue = new LinkedList<>();
        List<Character> charList = new LinkedList<>();
        List<Character> charList2 = new LinkedList<>();

        String removed = stack1.removeSpecials();
        char[] chars = removed.toCharArray();
        for(char c: chars){
            if(c != ' '){
                charQueue.add(c); //add
            }
        }
        for(int i = chars.length -1; i >= 0 ; i--){ //reversed
            if(chars[i] != ' '){
                charList2.add(chars[i]);
            }
        }
        while (!charQueue.isEmpty()){
            charList.add(charQueue.poll()); //poll
        }
        if(charList.equals(charList2)){
            return true;
        }else {
            return false;
        }
    }
    public static LinkedList<Integer> decimalToBinary(int number) {

        Stack<Integer> reminderStack = new Stack<>();
        LinkedList<Integer> result = new LinkedList<>();

        while(number > 0){
            int reminder = number % 2;
            reminderStack.push(reminder);
            number = number / 2;
        }
        Iterator<Integer> iterator = reminderStack.iterator();

        while (iterator.hasNext()){
            Integer binaryNum = iterator.next();
            result.push(binaryNum);
        }
        return result;
    }
}
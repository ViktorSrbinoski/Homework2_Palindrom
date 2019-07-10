import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T extends Comparable<T>> boolean isPalindrome(List<T> list){

        for(int i=0, j=list.size()-1; i<j; i++, j--){
            if(list.get(i).compareTo(list.get(j)) != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(3);
        integerList.add(2);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(2.2);
        doubleList.add(3.9);
        doubleList.add(5.0);
        doubleList.add(3.9);
        doubleList.add(2.2);

        List<String> stringList = new ArrayList<>();
        stringList.add("HELLO");
        stringList.add("BYE");
        stringList.add("HeLlO");
        stringList.add("HeLlO");
        stringList.add("BYE");
        stringList.add("HELLO");

        List<CustomClass> customList = new ArrayList<>();
        customList.add(new CustomClass(1, 2.2, "viktor"));
        customList.add(new CustomClass(77, 77.2, "mmm"));
        customList.add(new CustomClass(100, 45, "lalala"));
        customList.add(new CustomClass(77, 77.2, "mmm"));
        customList.add(new CustomClass(1, 2.2, "viktor"));

        if(isPalindrome(integerList)){
            System.out.println("Integer list IS a palindrome");
        }
        else{
            System.out.println("Integer list IS NOT a palindrome");
        }

        if(isPalindrome(doubleList)){
            System.out.println("Double list IS a palindrome");
        }
        else{
            System.out.println("Double list IS NOT a palindrome");
        }

        if(isPalindrome(stringList)){
            System.out.println("String list IS a palindrome");
        }
        else {
            System.out.println("String list IS NOT a palindrome");
        }

        if(isPalindrome(customList)){
            System.out.println("Custom list IS a palindrome");
        }
        else {
            System.out.println("Custom list IS NOT a palindrome");
        }

    }
}

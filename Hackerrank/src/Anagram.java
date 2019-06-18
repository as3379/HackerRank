import java.util.Arrays;

public class Anagram {
	
	static void isAnagram(String str1, String str2) {  
//        String s1 = str1.replaceAll("\\s", "");  
//        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (str1.length() != str2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = str1.toLowerCase().toCharArray();  
            char[] ArrayS2 = str2.toLowerCase().toCharArray();  
            System.out.println(ArrayS1);
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(str1 + " and " + str2 + " are anagrams");  
        } else {  
            System.out.println(str1 + " and " + str2 + " are not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {  
        isAnagram("KEEP", "Peek");  
        isAnagram("Mother In Law", "Hitler Womfn");  
    }  
}  
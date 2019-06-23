package StringManipulation;
import java.util.Arrays;

public class InsersionOrder {



	public static void process(String mystring) {
        StringBuilder sb = new StringBuilder();
        char[] mychar = mystring.toCharArray();
        //Arrays.sort(mychar);
        int count = 1;
        for(int i=0; i<(mychar.length)-1;i++) {
            
            if(mychar[i] == mychar[i+1]) {
                count = count+1;
               //System.out.println("count: "+count);
            }
            else {
                sb.append(mychar[i]);
                sb.append(count);
                count = 1;
            }
        
            if(i==(mychar.length)-2) {
                sb.append(mychar[i+1]);
                sb.append(count);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        process("aabbbccccaaa");
        process("ggggyyynnnkkkkkk");
        
    }

}
	  
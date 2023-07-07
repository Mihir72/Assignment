import java.util.*;

class Main{


public static boolean isAllAlphabet(String input){
    if(input.length() < 26)
       return false;

    HashMap<Character,Boolean> hm = new HashMap<>();
    for(int i = 0; i < 26; ++i){
         char ch = (char)(97+i);
         hm.put(ch,true);
    }
     input = input.toLowerCase();
    for(int i = 0; i <input.length(); ++i){
        if(hm.containsKey(input.charAt(i)))
           hm.remove(input.charAt(i));
    }

    if(hm.size() != 0)
    return false;

return true;

    
}

    public static void main(String[]args){
      System.out.println("Enter the input within a single line...");
      Scanner sc = new Scanner(System.in);
      String input = sc.next();
      System.out.println(isAllAlphabet(input));

    }
}
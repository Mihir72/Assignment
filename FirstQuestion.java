import java.util.*;

 class Main{

    public static char findUnique(String str){
        HashMap<Character, Integer> hm  = new HashMap<>();
        char answer = ' ';
        
        for(int i = 0; i < str.length(); ++i){
            char temp = str.charAt(i);
            if(temp != ' '){
                if(hm.containsKey(temp))
                hm.put(temp, hm.get(temp)+1);
                 else{
                  hm.put(temp, 1);
            }
            }
        }
       
       for(int i = 0; i < str.length(); ++i){
           if(hm.get(str.charAt(i)) == 1){
            answer = str.charAt(i);
            break;
           }
       }

        return answer;
    }
    public static void main(String[]args){
       System.out.println("Enter the input string to get the first non-repeating character...");
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
      
       System.out.println(findUnique(input));
    }
}
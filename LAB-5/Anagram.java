import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
       
        String[] arr = new String[n];
        System.out.println("Enter elements of array : ");
        
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        
        int random = (int)(Math.random()*n);
        String anagram = arr[random];

        System.out.println("random word is : "+anagram);
        System.out.print("Enter any word : ");
        String word = sc.next();

       

        if(anagram.length()!= word.length()){
            System.out.println("No anagram found");
            return;
        }

            char[] ana = anagram.toCharArray();
            char[] w = word.toCharArray();
        
            Arrays.sort(ana);
            Arrays.sort(w);
            
            if(Arrays.equals(ana, w)){
                System.out.println("Anagram found : "+anagram);
            }else{
                System.out.println("Anagram not found");
            }
        
            }
    }


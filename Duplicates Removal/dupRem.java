import java.util.*;
public class dupRem{
    public static boolean[] map=new boolean[26];
    public static void removeDup(String str, int  idx, String newStr){
        if(idx==str.length()){
            System.out.print(newStr);
            return;
        }
        char currchar=str.charAt(idx);
        if (map[currchar-'a']){
            removeDup(str, idx+1, newStr);
        }
        else{
            newStr+=currchar;
            map[currchar-'a']=true;
            removeDup(str, idx+1, newStr);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        removeDup(str, 0, "");
    }
}
package Strings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        ArrayList<String> ans = function("","abc");
        System.out.println(ans);
    }

    public static ArrayList<String> function(String processed , String unprocessed){
        ArrayList<String> list = new ArrayList<>();
        if (unprocessed.isEmpty()){
            list.add(processed);
            return list;
        }
        char ch  = unprocessed.charAt(0);
        ArrayList<String> ansFromLeft = function(processed + ch, unprocessed.substring(1));
        ArrayList<String> ansFromRight = function(processed  , unprocessed.substring(1));
        list.addAll(ansFromLeft);
        list.addAll(ansFromRight);

        return list;
    }
}

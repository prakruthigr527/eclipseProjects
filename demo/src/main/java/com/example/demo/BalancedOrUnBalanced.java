package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class BalancedOrUnBalanced {

    public static void main(String[] args) {

        // Get the String to be converted
        String str = "{{()}(({])){}}";

        List<Character> charList = new ArrayList<>();
        charList.add(str.charAt(0));
        boolean balanced = true;

        if(str.charAt(0)=='}' || str.charAt(0)==')' || str.charAt(0)==']'
                || str.charAt(str.length()-1)=='{' || str.charAt(str.length()-1)=='('
                || str.charAt(str.length()-1)=='[' || str.length()%2!=0)
        {
            balanced = false;
        }
        else {
            for (int i = 1; i < str.length(); i++) {
                if(str.charAt(i)=='}' || str.charAt(i)==')' || str.charAt(i)==']'){
                    if(isMatched(charList.get(charList.size()-1),str.charAt(i))){
                        charList.remove(charList.size()-1);
                    }
                    else {
                        balanced = false;
                        break;
                    }
                }
                else {
                    charList.add(str.charAt(i));
                }
            }
        }
        String x = balanced? "Balanced":"Not Balanced";
        System.out.println(x);
    }
    private static boolean isMatched(char a, char b){
        if (a == '(' && b == ')') {
            return true;
        } else if ( a == '{' && b == '}') {
            return true;
        } else if (a == '[' && b == ']') {
            return true;
        } else
        return false;
    }
}


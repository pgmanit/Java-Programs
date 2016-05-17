package com.test.pg.jp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by Prateek Gupta on 17/05/16.
 *
 * Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that only one letter can be changed at a time and each intermediate word must exist in the dictionary. For example, given:
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * One shortest transformation is "hit" ->"hot" ->"dot" ->"dog" ->"cog", the program should return its length 5.
 */
public class WordLadder
{
    public static void main(String[] args)
    {
        String startWord = "hit";
        String endWord = "cog";
        List<String> dictList = new ArrayList<>();
        dictList.add("hot");
        dictList.add("dot");
        dictList.add("log");
        dictList.add("dog");
        dictList.add("lot");
        char[] arr = startWord.toCharArray();

        System.out.print(startWord);
        dictList.add(endWord);

        boolean answerFound = false;
        {
            for(int i = 0; i < arr.length && !answerFound; i++)
            {
                boolean found = false;
                for(char c = 'a'; c <= 'z'; c++)
                {
                    char currChar = arr[i];

                    arr[i] = c;

                    String tempStr = new String(arr);
                    if(tempStr.equals(endWord))
                    {
                        System.out.print(" -> " + endWord);
                        answerFound = true;
                        break;
                    }
                    arr[i] = currChar;

                    if(dictList.contains(tempStr))
                    {
                        System.out.print(" -> " + tempStr);
                        arr = tempStr.toCharArray();
                        dictList.remove(tempStr);
                        if(i < arr.length - 1)
                        {
                            i++;
                        }
                        c = 'a';
                        found = true;
                    }
                }
                if(i == arr.length - 1 && found)
                {
                    i = -1;
                }
            }
        }
    }
}

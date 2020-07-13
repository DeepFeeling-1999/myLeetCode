package 回溯算法.Q17_电话号码的字母组合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<String,String> myHashMap=new HashMap<>(){
        {
            put("2","abc");
            put("3","def");
            put("4","ghi");
            put("5","jkl");
            put("6","mno");
            put("7","pqrs");
            put("8","tuv");
            put("9","wxyz");
        }
    };
    List<String> answer=new ArrayList<>();
    public void helper(String combination,String nextDigits){
        if(nextDigits.length()==0){
            answer.add(combination);
        }else{//遍历所有
            //下一个可用数字
            String digit=nextDigits.substring(0,1);
            String letters=myHashMap.get(digit);

            for(int i=0;i<letters.length();i++){
                //将当前字母加到组合中
                String letter=myHashMap.get(digit).substring(i,i+1);
                //然后跳到下一个数字
                helper(combination+letter,nextDigits.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length()!=0){
            helper("",digits);
        }
        return answer;
    }
}

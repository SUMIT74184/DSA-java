package Backtracking;

import java.util.HashSet;

public class letterTile {
    int len;
    public void backtrack(String tiles,boolean []used,HashSet<String>set,String curr){
        if(set.contains(curr)) return;
        //this is the main step not to explore the similar possibilities again
        set.add(curr);
        for(int i=0;i<len;i++){
            if(used[i]) continue;
            used[i]=true;
            backtrack(tiles, used, set, curr+tiles.charAt(i));
            //backtrack
            used[i]=false;
        }
    }
    public int numTilePossibilities(String tiles){
        len=tiles.length();
        boolean []used=new boolean[len];
        HashSet<String>set=new HashSet<>();
        backtrack(tiles,used,set,"");
        return set.size()-1;
    }
}

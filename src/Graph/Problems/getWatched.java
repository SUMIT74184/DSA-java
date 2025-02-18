package Graph.Problems;

import Graph.GraphLec;

import java.util.*;

public class getWatched {
    public class Pair implements Comparable <Pair>{
        String video;
        int freq;

         Pair(String video, int freq) {
            this.video = video;
            this.freq = freq;
        }
         int compareTo(Pair that){
             if(this.freq==that.freq){
                 return this.video.compareTo(that.video);
             }
             return this.freq-that.freq;
        }


    }
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        Queue<Integer>queue=new LinkedList<>();
        HashSet<Integer>visited=new HashSet<>();
        queue.offer(id);
        visited.add(id);
        int currLvl=0;
        while(!queue.isEmpty()){
            int size= queue.size();
            // level by level
         for(int i=0;i<size;i++){
             int currId=queue.poll();
             for(int friend:friends[currId]){
                 if(!visited.contains(friend)){
                     visited.add(friend);
                     queue.offer(friend);
                 }
             }
         }
            currLvl++;
            if(currLvl==level){
                break;
            }
        }
        HashMap<String,Integer>freqMap=new HashMap<>();
        while(!queue.isEmpty()){
            int currId= queue.poll();
            for(String video:watchedVideos.get(currId)){
                freqMap.put(video,freqMap.getOrDefault(video,0)+1);
            }
        }
        List<Pair>videoList=new ArrayList<>();
        for(String video:freqMap.keySet()){
            videoList.add(new Pair(video,freqMap.get(video)));
        }
        Collections.sort((videoList));
        List<String>res=new ArrayList<>();
        for(Pair pair:videoList){
            res.add(pair.video);
        }
        return res;
    }
}

package javatest;
import java.util.Date;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
class Song {
 
    String name;
    String runTime;
    String singer;
 
    public Song(String nm,String rt, String sng) {
        this.name = nm;
        this.runTime = rt;
        this.singer = sng;
    }

	
 
}
 
class PlayList {
 
    List<Song> songs = new ArrayList<>();
 
    public String playSong(String currentTime,Song song) {
        // currentTime < song.runTime 
    	
        
    	if( song.runTime.compareTo(currentTime) < 0) {
           return  "Song is being continued";
    	}
//        if (Integer.parseInt(currentTime.split(":")[0])
//        		<Integer.parseInt(song.runTime.split(":")[0])||
//        		Integer.parseInt(currentTime.split(":")[1])<
//        		Integer.parseInt(song.runTime.split(":")[1])) {
//            return  "Song is being continued";
//        }
        else {
            return "Song replayed";
        }
    } 
 
    public String addSong(Song song) {
        // songList contains song 
 
        if (songs.contains(song)) {
            return  "Cannot be added";
        }
        else {
        	songs.add(song);
            return "Added";
        }
    }
}
 
public class test1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    
    	PlayList p1 = new PlayList();
    	Song song = new Song("vika","4:30","sunil");
    	Song song1 = new Song("kika","3:30","sanil");
    	Song son2 = new Song("pika","5:30","snnil");
    	
    	System.out.println(p1.addSong(song));
    	System.out.println(p1.addSong(song1));
    	System.out.println(p1.addSong(son2));
    	
    	System.out.println(p1.playSong("2:30",song));
    	
//    	getTimeOnlyInstance();
//    	DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
//    	
    	
    }

	
}

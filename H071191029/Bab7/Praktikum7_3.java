import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
class Praktikum7_3{
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> movieData = new HashMap<>();
        movieData.put("title", new ArrayList<>());
        movieData.put("release", new ArrayList<>());
        movieData.put("duration", new ArrayList<>());
        movieData.put("Sysnopsis", new ArrayList<>());
        movieData.put("genre", new ArrayList<>());
        movieData.put("cast", new ArrayList<>());
    }
}    
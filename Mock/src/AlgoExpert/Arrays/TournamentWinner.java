package AlgoExpert.Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {

    public static void main(String [] args){
        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String> c1  = new ArrayList<>();
        ArrayList<String> c2 = new ArrayList<>();
        ArrayList<String> c3 = new ArrayList<>();
        //
        c1.add("HTML");
        c1.add("C#");
        list.add(c1);
        //
        c2.add("C#");
        c2.add("Python");
        list.add(c2);
        //
        c3.add("Python");
        c3.add("HTML");
        list.add(c3);

        tournamentWinner(list,results);


    }

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results){
        HashMap<String, Integer> map = new HashMap<>();
        String max = "currentMax";
        map.put("currentMax",0);

        for(int i = 0 ; i < competitions.size();i++){
            String homeName = competitions.get(i).get(0);
            String awayName = competitions.get(i).get(1);

            int result = results.get(i);

            String winner = result == 1 ? homeName : awayName;
            map.putIfAbsent(winner, 0);
            //System.out.println("Winner: " + winner);

            if(map.containsKey(winner)){
                map.put(winner,map.get(winner)+3);
            }
            //System.out.println("Get homeN: " + homeName);
            //System.out.println("Get awayN: " + awayName);

            if(map.get(max) < map.get(winner)){
                max = winner;
            }
        }
        //System.out.println("Map:" + map);
        //System.out.println("Max: " + max);

        return  max;
    }
}

package Excercises.SetsAndDictionaries;
import java.util.*;
public class LogsAggregator_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        alex: 62 [10.10.17.33, 212.50.118.81]
//        peter: 303 [10.10.17.34, 10.10.17.35, 192.168.0.11]

        int n=Integer.parseInt(s.nextLine());
        //IP addresses and duration
        TreeMap<String,Integer> durations=new TreeMap<>();
        //name and IP addresses
        HashMap<String, TreeSet<String>> ips=new HashMap<>();

        for (int i=0;i<n;i++){
            String input=s.nextLine();
            String ip=input.split("\\s+")[0];
            String name=input.split("\\s+")[1];
            int duration=Integer.parseInt(input.split("\\s+")[2]);

            if(!ips.containsKey(name)){
                durations.put(name,duration );
                ips.put(name, new TreeSet<>(){{add(ip);}});
            }else{
                Set<String> set=ips.get(name);
                if(set.contains(ip)){
                    int updateDuration=durations.get(name)+duration;
                    durations.put(name, updateDuration);
                }else{
                    ips.get(name).add(ip);
                    int updatedDuration=durations.get(name)+duration;
                    durations.put(name,updatedDuration);
                }
            }
        }

        for(Map.Entry<String, Integer> entry: durations.entrySet()){
            String userName=entry.getKey();
            System.out.printf("%s: %d [%s]%n",userName, entry.getValue(),
                    String.join(", ", ips.get(userName)));
        }
    }
}

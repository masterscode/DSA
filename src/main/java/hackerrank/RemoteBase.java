package hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class RemoteBase {

    private List<String> members;
    private List<Integer> files;
    Map<Integer, String> message;

    public RemoteBase(){
        members = new ArrayList<>();
        files = new ArrayList<>();
        message = new HashMap<>();
    }
//
//    public void add(String[] names){
//        members.addAll(Arrays.);
//    }

    public void add(int[] file){
            files.addAll(Arrays.stream(file).boxed().collect(Collectors.toList()));

    }

    public void remove(int messageId){
        var p = message.remove(messageId);
    }
}

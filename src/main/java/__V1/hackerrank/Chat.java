package __V1.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class Chat{
    private List<String> members;
    private List<Integer> files;
    Map<Integer, String> message;

    public Chat(){
        members = new ArrayList<>();
        files = new ArrayList<>();
        message = new HashMap<>();
    }

    public void add(String[] names){
        members.addAll(Arrays.asList(names));
    }

    public void add(int[] file){
        files.addAll(
                Arrays.stream(file)
                        .boxed()
                        .collect(Collectors.toList()));
    }
    public void add(int id, String newMessage){
        message.put(id, newMessage);
    }

    public void remove(String[] names){
        for (String name : names) {
            int nameIdx = members.indexOf(name);
            if(nameIdx < 0){
                System.out.println(String.format("Member with name { %s } does not exist", name));
            }else{
                members.remove(nameIdx);
            }
        }
    }
    public void remove(int[] file){
        for (int item : file) {
            int itemIdx = files.indexOf(item);
            if(itemIdx < 0){
                System.out.println(String.format("File with id { %d } does not exist", item));
            }else{
                members.remove(itemIdx);
            }
        }
    }

    public void remove(int messageId){
        String messageString =  message.remove(messageId);
        if(messageString == null){
            System.out.println(String.format("Message with id { %d } does not exist", messageId));
        }
    }

    public void printConversation(){
        System.out.println(
                String.format("Total number of members in the conversation are %d", message.size())
        );

        System.out.println(
                String.format("The names of these members are %s", String.join(" ", members))
        );

        System.out.println(
                String.format("Total number of files in the conversation are %d", files.size())
        );

        System.out.println(
                String.format("The messages in the conversation are %s", String.join("' ", message.values()))
        );
    }
}

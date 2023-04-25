package JAVA24;

import java.util.*;

public class StringLister {
    String[] names = {"Andrey", "Boris", "Tanya", "Svetlana", "Natali", "Alex", "Dmitriy", "Mary", "Nina"};
    
    public StringLister(String[] moreNames){
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i< names.length; i++){
            list.add(names[i]);
        }
        for(int i= 0; i < moreNames.length; i++){
            list.add(moreNames[i]);
        }
        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }
    }
    
    public static void main(String[] args) {
        StringLister lister = new StringLister(args);
    }
}

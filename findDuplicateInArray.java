import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class findDuplicateInArray {

    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.size();i++){
            if(!map.containsKey(arr.get(i))){
                map.put(arr.get(i),1);
            }

            else{
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }
        } 

        for(Map.Entry<Integer,Integer> e :map.entrySet())
        {
            if(e.getValue()>=2)
            {
                return e.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(2);
        int ans=findDuplicate(list, list.size());

        System.out.println("Duplicate Element "+ans);
    }
}

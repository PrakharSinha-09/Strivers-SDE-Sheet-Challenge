import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicates{

    public static int removeDuplicate(ArrayList<Integer> arr) {
		// Write your code here.

		Set<Integer> set=new HashSet<>(arr);
		return set.size();
	}
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        int ans=removeDuplicate(list);
        System.out.println(ans);
    }
}
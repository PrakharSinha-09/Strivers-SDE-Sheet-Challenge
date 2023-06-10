//https://www.codingninjas.com/codestudio/problems/merge-two-sorted-arrays_8230835?challengeSlug=striver-sde-challenge&le

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int i=0;
        for(int j=m;j<m+n;j++)
        {
            arr1[j]=arr2[i];
            i++;
        }

        Arrays.sort(arr1);

        return arr1;
    }
    public static void main(String[] args) {
        int[] arr1=new int[5];
        int[] arr2={4,10};

        arr1[0]=3;
        arr1[1]=6;
        arr1[2]=9;
        int n=3;           //no. of elements in arr1

        int[] ans=ninjaAndSortedArrays(arr1, arr2, n, arr2.length);

        System.out.println(Arrays.toString(ans));
    }
}

import java.util.ArrayList;

public class Searching {
    public static <T> int linear(ArrayList<T> arr, T target){
        for (int i = 0; i< arr.size(); i++){
            if(arr.get(i).equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> int binary(T[] arr, T target){
        int i = arr.length/2;
        int max = arr.length-1;
        int min =0;
        while(max > min){
            if (arr[i].equals(target)) {
                return i;
            } else if(arr[i].compareTo(target)<0){
                min= i;
                i= (min+max)/2;
                //System.out.println(i);
            }else if(arr[i].compareTo(target)>0){
                max= i;
                i= (min+max)/2;
                //System.out.println(i);
            }
        }
        return -1;
    }
    public static void main (String[] args){
        ArrayList<Integer> i = new ArrayList<>();
        Integer[] k = new Integer[10];
        for(int j =0; j<10; j++){
            i.add(j);
            k[j]=j;
        }
        for(int j= -1;j<=11;j++) {
            System.out.println(linear(i, j));
            System.out.println(binary(k, j));
        }
    }
}
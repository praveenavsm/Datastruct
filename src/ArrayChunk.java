import java.util.Arrays;

public class ArrayChunk {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int size =2;
        int[][] chunked = chunk(arr,size);
        for(int i =0;i< chunked.length;i++)
        System.out.println(Arrays.toString(chunked[i]));
    }
    public static int[][] chunk(int[] arr, int size){
       int x= arr.length/size;
       if(arr.length % size > 0) x++;
       int y = size;
       int[][] chunked = new int[x][y];
       int index = 0;
        int i=0, j= 0;
    while(index < arr.length) {

        chunked[i][j] = arr[index++];
        j++;
        if(j >= y)
        {
            j=0;
            i++;
            if(i >= x)
                break;
        }

    }

        return chunked;
    }
}

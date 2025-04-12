public class CountKOccurence {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4};
        int k = 5;
        System.out.println(occurence(arr,k,0));
    }
    static int occurence(int[] arr,int k,int index){
        if(index==arr.length){
            if(k==0) return 1;
            return 0;
        }
        k -=arr[index];
        int include = occurence(arr,k,index+1);

        k +=arr[index];
        int exclude = occurence(arr,k,index+1);

        return include + exclude;
    }
}

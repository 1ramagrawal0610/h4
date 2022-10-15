// print even numbers first then odds
public class even_odd_sort{
    public static void main (String args[]){
        int[] arr={1,2,5,3,4,6};
        int n=arr.length;
        int k=0;
        int m=1;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                res[k++]=arr[i];
            }
            else{
                res[n-m]=arr[i];
                m++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(res[i]);
        }
    }
}

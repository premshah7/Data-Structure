public class CountingSort{
    
    static void countSort(int[] arr){
        int k=arr[0];
        int n=arr.length;
        int[] ans = new int[n];
        
        for(int i=1 ; i<n ; i++){
            if(arr[i] > k){
                k = arr[i];
            }
        }
        int[] c = new int[k + 1];

        for(int j=0 ; j<n ; j++){
            c[arr[j]]++;
        }
        
        for(int i=1 ; i<=k ; i++){
            c[i] = c[i] + c[i-1];
        }

        for(int j=n-1 ; j>=0 ; j--){
            ans[c[arr[j]]-1] = arr[j];
            c[arr[j]]--;
        }
        
        for(int i=0 ; i<n-1 ; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1,8,0,2,9,19,1,2,8};
        countSort(a);
    }
}
class _8Segregate_1s_0s {
    void segregate0and1(int[] arr) {
        // code here
        int n =arr.length;
        int number_zeroes=0;
        int number_ones=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) number_zeroes++;
            else number_ones++;
        }
        for(int i=0;i<n;i++){
            if(number_zeroes!=0){
                arr[i]=0;
                number_zeroes--;
            }
            else{
                arr[i]=1;
                number_ones++;
            }
        }
    }
}

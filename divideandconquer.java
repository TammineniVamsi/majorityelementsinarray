public class Dividenconquerpracticeqs2 {
    public static int majorityelement(int arr[]){
        int majoritycount=arr.length/2; //logic to be reminded

        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count=count+1;
                }
            }
            if(count>majoritycount){
                return arr[i];
        }
    }
    return -1;
    }
    public static void main(String args[]){
        int arr[]={2,2,1,1,1,2,2,1,1};
        System.out.println(majorityelement(arr));

    }
    
}

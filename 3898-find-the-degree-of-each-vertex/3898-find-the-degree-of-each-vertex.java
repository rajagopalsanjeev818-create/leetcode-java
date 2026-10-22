class Solution{
    public int[] findDegrees(int[][] matrix){
        int[] arr=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix.length;j++){
                sum=sum+matrix[i][j];
            }
            arr[i]=sum;
        }
        return arr;
    }
}
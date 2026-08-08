class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> rowmin=new ArrayList<>();
        for(int i=0;i<n;i++){
            int rmin=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                rmin=Math.min(rmin,matrix[i][j]);
            }
            rowmin.add(rmin);
        }
        List<Integer> colmax=new ArrayList<>();
        for(int i=0;i<m;i++){
            int cmax=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                cmax=Math.max(cmax,matrix[j][i]);
            }
            colmax.add(cmax);
        }
        List<Integer> lucky=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==rowmin.get(i) && matrix[i][j]==colmax.get(j)){
                    lucky.add(matrix[i][j]);
                }
            }
        }
        return lucky;
    }
}
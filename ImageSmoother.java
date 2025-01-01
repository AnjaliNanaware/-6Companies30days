//661.Image Smoother -https://leetcode.com/problems/image-smoother/description/
// An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image by rounding down the average of the cell and the eight surrounding cells (i.e., the average of the nine cells in the blue smoother). If one or more of the surrounding cells of a cell is not present, we do not consider it in the average (i.e., the average of the four cells in the red smoother).
class Solution {
    public int[][] imageSmoother(int[][] img) {

        int m=img.length;
        int n=img[0].length;
    

        int[][] result= new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                int sum=0,count=0;

                for(int k=i-1;k<=i+1;k++)
                {
                    for(int l=j-1;l<=j+1;l++){
                        if(k>=0 && k<m && l>=0 && l<n){
                            sum+=img[k][l];
                            count++;
                        }
                    }
                }

                result[i][j]=sum/count;
            }
        }

        return result;
    }
}
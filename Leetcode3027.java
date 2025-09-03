import java.util.Arrays;

public class Leetcode3027 {
  public int numberOfPairs(int[][] points) {
        int n=points.length;
        Arrays.sort(points,(a,b)->{
            int cmp=b[0]-a[0];
            return (cmp==0)?a[1]-b[1]:cmp;
        }
            );
        int cntPair=0;
        for(int i=0;i<n-1;i++) {
            int min_y=Integer.MAX_VALUE;
            for(int j=i+1;j<n;j++) {
                if(points[j][1]>=points[i][1] && points[j][1]<min_y){
                    min_y=points[j][1];
                    cntPair++;
                }
            }
        } return cntPair;
    }
}

import java.util.*;
public class Dp_9465{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n= sc.nextInt();
            int[][] d = new int[n+1][3];
            int[][] a = new int[n+1][3];
            
            for(int i=1; i<=n; i++){
                a[i][1]=sc.nextInt();    
            }
            
            for(int i=1; i<=n; i++){
                a[i][2]=sc.nextInt();    
            }
            
            d[1][0]=0;
            d[1][1]=a[1][1];
            d[1][2]=a[1][2];
            
            for(int i=2; i<=n ; i++){
                d[i][0] = Math.max(d[i-1][0], Math.max(d[i-1][1], d[i-1][2]));
                d[i][1] = Math.max(d[i-1][0], d[i-1][2])+a[i][1];
                d[i][2] = Math.max(d[i-1][0], d[i-1][1])+a[i][2];
            }

            System.out.println(Math.max(d[n][0], Math.max(d[n][1], d[n][2])));
        }
        
    }
    
}
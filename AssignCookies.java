import java.util.*;

public class Assigncookies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int m=sc.nextInt();
         int n=sc.nextInt();
         int[]g=new int[m];
         int []s=new int[n];
         for(int i=0;i<m;i++){
            g[i]=sc.nextInt();
         }
         for(int j=0;j<n;j++){
            s[j]=sc.nextInt();
         }
         System.out.println(findContentChildren(g, s));

    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int content=0,cookie=0;
        while(cookie<s.length && content<g.length){
            if(s[cookie]>=g[content]){
                content++;

            }
            cookie++;
           
        }
        return content;
    }
}


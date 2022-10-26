class Solution{
    static int minFind(int n, String a[]){
        // code here
        int r=0, g=0, b=0;
        for(int i=0; i<n; i++){
            if(a[i].equals("R")){
                r++;
            }
            else if(a[i].equals("G")){
                g++;
            }
            else if(a[i].equals("B")){
                b++;
            }
        }
        
        if(r==n || g==n || b==n){
            return n;
        }
        
        if((r%2==0 && g%2==0 && b%2==0) || (r%2==1 && g%2==1 && b%2==1)){
            return 2;
        }
        
        return 1;
        
    }
}

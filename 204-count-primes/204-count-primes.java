class Solution {
    public int countPrimes(int n) {
        if(n<=2)
            return 0;
        int ans=0;
        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime, Boolean.TRUE);
        isPrime[0] = false;
        isPrime[1] = false;
        isPrime[2] = true;
        for(int i=2; i*i<n; i++)
        {
            for(int k=2; i*k<n; k++)
                isPrime[i*k] = false;
        }
        for(int i=2; i<n; i++)
        {
            if(isPrime[i])
                ans++;
        }
        return ans;
    }
}


/*
class Solution {
    public int countPrimes(int n) {
        int ans=0;
        for(int i=2; i<n ; i++)
        {
            if(i==2 || i==3 || i==5 ||i==7)
                ans++;
            else if(i%2!=0 && isPrime(i)==true)
                ans++;
        }
        return ans;
    }
    public static boolean isPrime(int n)
    {
        for(int i=2; i*i<=n; i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
*/
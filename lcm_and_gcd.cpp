class Solution {
  public:
  
     long long gcd(long long A,long long B){
         
         return B==0?A:gcd(B,A%B);
     }
    vector<long long> lcmAndGcd(long long A , long long B) {
        // code here
       vector<long long> res;
       long long gcde = gcd(A,B);
       res.push_back((A*B)/gcde);
       res.push_back(gcde);
        return res;
        
    }
};

//Time Complexity: O(log(min(A, B))
//Space Complexity: O(1)

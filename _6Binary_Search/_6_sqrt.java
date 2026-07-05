//package _6Binary_Search;
//
//public class _6_sqrt {
//    package _6Binary_Search;
//
//    public class _5_maxOfPosNegint {
//        //BRUTE FORCE
////    class Solution {
////        public int mySqrt(int n) {
////            int root=0;
////            for(int i=1;i<=n;i++){
////                if(i*i>n) break;
////                root=i;
////            }
////            return root;
////        }
//        //BINARYSEARCH
//        class Solution {
//            int floorSqrt(int n) {
//                // code here
//                int lo=1;
//                int hi=n;
//
//                while(lo<=hi){
//                    int mid= lo + (hi-lo)/2;
//                    if(mid==n/mid) return mid;
//                    else if(mid>n/mid) hi =mid-1;
//                    else lo=mid+1;
//                }
//                return hi;
//            }
//        }
//    }
//}
//
//}

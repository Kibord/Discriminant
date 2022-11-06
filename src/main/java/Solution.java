import static java.lang.Math.sqrt;

class Solution {
    int x1;
    int x2;

//    Solution(int x1, int x2) {
//        this.x1 = x1;
//        this.x2 = x2;
//    }

    Solution(int a, int b, int D) {
        if (D == 0){
            this.x1 = -b/(2*a);
        } else {
            this.x1 = (int)((-b + sqrt(D))/(2*a));
            this.x2 = (int)((-b - sqrt(D))/(2*a));
        }
    }

    @Override
    public String toString(){
        return "x1 = " +  this.x1 +  "; x2 = " + this.x2 +";";
    }
}

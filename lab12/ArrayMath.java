//Joey Carney
//11/12/14
//lab12--ArrayMath

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }

  public static boolean equals(double [] a, double [] b) {
    int length_a = a.length;
    int length_b = b.length;
    if(length_a == length_b) {
        for(int i = 0; i < length_a; i++) {
                if(a[i] == b[i]) {
                  continue;
                } else {
                    return false;
                }
          
      }
      return true;
  }
  return false;
}

    public static double[] addArrays(double [] a, double [] b) {
        int length_a = a.length;
        int length_b = b.length;
        int max;
        if(length_a > length_b) {
            max = length_b;
        } else {
            max = length_a;
        }
        
        double [] sum = new double[6];

        if(length_a == length_b) {
            for(int j = 0; j < length_a; j++) {
                
                sum[j] = a[j] + b[j];
            }
        } else {
            for(int k = 0; k < max; k++) {
                
                sum[k] = a[k] + b[k];
                if(length_b > length_a) {
                    for(int m = length_a; m < length_b; m++) {
                        
                        sum[m] = b[m];
                        
                    }
                } else {
                    for(int n = length_b; n < length_a; n++) {
                        
                        sum[n] = a[n];
                        
                    }
                }
            }
        }
        return sum;
        
    }
}

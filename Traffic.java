
package simulation;

public class Traffic {
 
      public static void main(String[] args) {
            // TODO Auto-generated method stub
            int w=0; //WestBound and EastBound
            int n=0; //NorthBound and SouthBound
            int k=0; //Green signal timer
            boolean signal = true; // Green(3 sec)=False
            int timer=0;
           
            System.out.println("Time Start = "+timer+"     Snell Road(S,N)="+n+"    Weaver Road(E,W)="+w);
            while(k<3){
                  k=k+1;
                 
                  if(signal){
                        w++;
                  }
                  else{
                        n++;
                  }
                        System.out.println("Time = "+(timer+1)+"                   "+n+"                    "+w);
                       
                  timer++;
                  if(k==3){
                        //Red signal for all roads for 1 sec
                        w++;n++;                        k=0;
                        System.out.println("Time = "+(timer+1)+"                   "+n+"                    "+w);
                        //Add one car for Green Signal 
                        if(signal){
                              w++;
                        }
                        else{
                              n++;
                        }
                        //Toggle the Signal
                        signal=!signal;
                        timer++;
            }
                  if(timer==20){
                        break;
                  }
            }
           
      }
}

 class TV
{
    public void switchon(){ System.out.println("TV switch on");}
    public void  changechannel(){ System.out.println("TV change channel");}
}
 class SmartTV extends TV
{
    public void switchon(){ System.out.println("SmartTV switch on");}
    public void  changechannel(){ System.out.println("SmartTV change channel");}
}
class car
{
    public void  start(){
        System.out.println("Start the Car");
       }
    public void accelerate()
    {
        System.out.println("Car is accelerated");
    }
}
class AdavanceCar extends car
{
    public void  start(){
        System.out.println("Start the AdvanceCar");
       }
    public void accelerate()
    {
        System.out.println("Advaence Car is accelerated");
    }
    public void openroof()
    {
        System.out.println("Open roof");
    }
}

public class method_overridepractice {
        public static void main(String args[])
        {    TV t2=new SmartTV();
            t2.changechannel();
            t2.switchon();

        //    SmartTV 



        }

    
}

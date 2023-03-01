package pl.javastart.task;

public class Room {
   private double size;
   private double temperature;
    private boolean haveAirConditioner;

    public Room(double size, double temperature, boolean isAirConditioner) {
        this.size = size;
        this.temperature = temperature;
        this.haveAirConditioner = isAirConditioner;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isAirConditioner() {
        return haveAirConditioner;
    }


   public boolean lowerTemperature(){
        if (haveAirConditioner==true && ((temperature)>  minTemperature()+1)) {
            temperature--;
            return true;
        } else if(haveAirConditioner==true && temperature > minTemperature() && (minTemperature() + 1) > temperature){
        temperature= temperature - (temperature- minTemperature());
         return  true;
        } else
               return  false;
        }
           private double minTemperature(){
        double minTemperature;
        if (size <=50) {
         return  minTemperature = 21;
        }else if (size>50&& size<=100) {
        return minTemperature= 23;

        } else
              return minTemperature=25;
        }

}


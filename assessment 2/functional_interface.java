@FunctionalInterface
interface TemperatureSensor {
    void readTemperature();
}

@FunctionalInterface
interface HumiditySensor {
    void readHumidity();
}

public class functional_interface
{
    public static void main(String[] args) 
    {
        TemperatureSensor tempSensor = new TemperatureSensor() {
            @Override
            public void readTemperature() 
            {
                System.out.println("Reading temperature: 25°C");
            }
        };
        tempSensor.readTemperature();

        new HumiditySensor() {
            @Override
            public void readHumidity()
            {
                 System.out.println("Reading humidity: 60%");
        
            }
        }.readHumidity();
    }
}

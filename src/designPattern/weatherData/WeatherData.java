package designPattern.weatherData;

/**
 * @Author Seungwhan Lee(sw4417@into.guru)
 */
public class WeatherData {

    public float getTemperature() {
        float a = 1;
        return a;
    }
    public float getHumidity() {
        float a = 1;
        return a;
    }
    public float getPressure() {
        float a = 1;
        return a;
    }
    public void measurementsChanged() {

        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
    }


    // 기타 메소드...
}

package designPattern.observer;

import java.util.FormatFlagsConversionMismatchException;

/**
 * @Author Seungwhan Lee(sw4417@into.guru)
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForcastDisplay(weatherData);

        weatherData.setMesurements(80, 65, 30.4f);
        weatherData.setMesurements(82, 70, 29.2f);
        weatherData.setMesurements(78, 90, 29.2f);

    }
}

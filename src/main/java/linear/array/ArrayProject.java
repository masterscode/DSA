package linear.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayProject {
    private final Logger log = LoggerFactory.getLogger(ArrayProject.class);
    private final Integer[] temperatures;
    private  final Scanner console = new Scanner(System.in);
    private double averageTemperature;


    public ArrayProject(){
        log.info("how many days temperature");
        final int numOfDays = console.nextInt();
        temperatures = new Integer[numOfDays];

        getTemperatureFromUser();
        setAverage();

        log.info(String.format("average temperature is: %s", averageTemperature));

        log.info(String.valueOf(getTemperaturesAboveAverage()));

    }

    public static void main(String[] args) {
        new ArrayProject();
    }

    public void getTemperatureFromUser(){
        for (int i=0; i < temperatures.length; i++){
            log.info(String.format("Enter the %d day(s) temperature value", i + 1));
            final int temperatureValue = console.nextInt();
            temperatures[i] = temperatureValue;
        }
    }

    public void setAverage(){
       final int sumOfTemperatures =  Arrays.stream(temperatures).reduce(Integer::sum).orElse(0);
       averageTemperature = (double)sumOfTemperatures / temperatures.length;
    }

    public List<Integer> getTemperaturesAboveAverage(){
        return  Arrays.stream(temperatures).filter(temperature -> temperature > averageTemperature).toList();
    }

}

package scanning.parkinglot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    parkinglot.Car wheelsOfDevil(){
        var chevroletCamaro = new ChevroletCamaro();
        chevroletCamaro.setEngine(powerOverwhelmingStuff());
        return chevroletCamaro;
    }

    @Bean
    parkinglot.Engine powerOverwhelmingStuff(){
        var v12Engine = new V12Engine();
        return v12Engine;
    }
}

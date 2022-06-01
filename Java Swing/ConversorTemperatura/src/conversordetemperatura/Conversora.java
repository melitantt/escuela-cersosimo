package conversordetemperatura;
public class Conversora {
    double CelsiusToFahrenheit(double cTemp){
        double fTemp;
        fTemp=(9*cTemp)/5+32;
        return fTemp;
    }double CelsiusToKelvin(double cTemp){
        double fTemp;
        fTemp=cTemp+273.15;
        return fTemp;
    }double FahrenheitToCelsius(double cTemp){
        double fTemp;
        fTemp=(cTemp-32)/1.8;
        return fTemp;
    }double FahrenheitToKelvin(double cTemp){
        double fTemp;
        fTemp=(cTemp-32)*5/9+273.15;
        return fTemp;
    }double KelvinToCelsius(double cTemp){
        double fTemp;
        fTemp=cTemp-273.15;
        return fTemp;
    }double KelvinToFahrenheit(double cTemp){
        double fTemp;
        fTemp=1.8*(cTemp-273.15)+32;
        return fTemp;
    }public Conversora() {}
}

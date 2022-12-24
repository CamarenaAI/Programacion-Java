#include "Arduino.h"
#include "CustomLm35.h"

//Constructor
CustomLm35::CustomLm35(int pin){

_pin = pin;	
	
}

//Metodos
float Customlm35::readCelcius(){
float TempC;
return  analogRead(_pin) * 0.4887585532746823;

}
float Customlm35::readKelvin(){
return	((analogRead(_pin) * 0.4887585532746823)+273.15;

}
float Customlm35::readFahrenheit(){
return (1.8*(analogRead(_pin) * 0.4887585532746823)+32;	

}

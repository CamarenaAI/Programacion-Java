#include <CustomLm35.h>
CustomLm35 Sensor1 (0);

void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
Serial.print("La temperatura em C es: ");
Serial.println(Sensor1.readCelsius());
Serial.print("La temperatura em Kelvin es: ");
Serial.println(Sensor1.readKelvin());
Serial.print("La temperatura em Fahrenheit es: ");
Serial.println(Sensor1.readFahrenheit());
Serial.println("");
delay(5000);
}

import cc.arduino.*;
import org.firmata.*;
import processing.serial.*;

Arduino arduino;  //Crea el objeto Arduino

int ledPin = 13;
int pinPot = 0;
int val;

void setup(){
size(200, 200);
arduino = new Arduino(this,"COM15",57600);
arduino.pinMode(ledPin, Arduino.OUTPUT);
}

void draw(){
//Lee la señal del potenciometro (0...1024), divide por cuatro(0...255);
  val = arduino.analogRead(pinPot)/4;
//Envia el LED el valor leido y ajustado (0...255) señal PWM
  arduino.analogWrite(ledPin, val);
//Varia la intensidad del color de la ventana de processing
  background(255-val,0,0);
}

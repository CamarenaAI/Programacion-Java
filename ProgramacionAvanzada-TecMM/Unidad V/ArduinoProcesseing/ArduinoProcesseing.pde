import cc.arduino.*;
import org.firmata.*;
import processing.serial.*;

Arduino arduino;  //Crea wl objeto Arduino

int ledPin = 13;

void setup(){
size(400, 400);
arduino = new Arduino(this,"COM15",57600);
arduino.pinMode(ledPin, Arduino.OUTPUT);
}

void draw(){
if (mousePressed == true){
arduino.digitalWrite(13,Arduino.LOW);
}
else{
arduino.digitalWrite(13,Arduino.HIGH);
}
}

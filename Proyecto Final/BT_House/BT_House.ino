#include<SoftwareSerial.h>
int bluetoothTx = 10;
int bluetoothRx = 11;
SoftwareSerial bluetooth(bluetoothTx, bluetoothRx);

#include <Servo.h>
Servo MyServo;

void setup() {
  MyServo.attach(9);
  Serial.begin(9600);
  bluetooth.begin(9600);
  pinMode(8,OUTPUT);
  pinMode(7,OUTPUT);
}

void loop() {
//Puerta
 if(bluetooth.available()> 0 ) // receive number from bluetooth
  {
    int servopos = bluetooth.read(); // save the received number to servopos
    Serial.println(servopos); // serial print servopos current number received from bluetooth
    MyServo.write(servopos); // roate the servo the angle received from the android app
  }

//Luces Puerta
  if(bluetooth.available()>0){
    char data = bluetooth.read();
    if (data == 'a'){
      digitalWrite(8,HIGH);
    }
    else if(data == 'b'){
      digitalWrite(8,LOW);
    }
  }

//Luces Jardin
  if(bluetooth.available()>0){
    char data = bluetooth.read();
    if (data == 'c'){
      digitalWrite(7,HIGH);
    }
    else if(data == 'd'){
      digitalWrite(7,LOW);
    }
  }
}

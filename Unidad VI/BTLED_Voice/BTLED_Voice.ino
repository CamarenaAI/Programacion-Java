#include<SoftwareSerial.h>
int bluetoothTx = 10;
int bluetoothRx = 11;
SoftwareSerial bluetooth(bluetoothTx, bluetoothRx);

void setup() {
  Serial.begin(9600);
  bluetooth.begin(9600);
  pinMode(8,OUTPUT);
}

void loop() {
  char X = bluetooth.read();
  if(X=='A')
    digitalWrite(8,HIGH);
  if(X=='B')
    digitalWrite(8,LOW);  
}

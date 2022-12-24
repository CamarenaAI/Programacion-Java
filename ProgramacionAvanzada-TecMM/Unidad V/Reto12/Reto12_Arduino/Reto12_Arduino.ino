int potPin = 0;

void setup() {
Serial.begin(9600);
}

void loop() {
int Val = analogRead(potPin);
Val = Val/4;
Serial.write(Val);
delay(100);
}

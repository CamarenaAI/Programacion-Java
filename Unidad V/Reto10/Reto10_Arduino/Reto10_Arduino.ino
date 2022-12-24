const int sensorPin = A8;

void setup() {
  Serial.begin(9600);
}

void loop() {
  int value = analogRead(sensorPin);
  float millivolts = (value / 1023.0) * 5000;
  float celcius = millivolts / 10;
  Serial.print(celcius);
  Serial.println(" C");
  Serial.println(analogRead(sensorPin)*4);
  delay(1000);
}

//25°C = 200
//35 = 7
//45 = 92
//55 = 400
//65 = 132
//75 = 152
//85 = 172
//95 = 192
//105 = 212

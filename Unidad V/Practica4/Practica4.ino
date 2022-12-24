int count = 0;

void setup() {
Serial.begin(9600);
}

void loop() {
Serial.write(count);
count++;
delay(1000);
}

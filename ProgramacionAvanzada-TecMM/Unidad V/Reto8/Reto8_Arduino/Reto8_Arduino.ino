int a, s;
void setup() {
  Serial.begin(9600);
  pinMode(A8, INPUT);
}

void loop() {
  a = analogRead(A8);
  s=map(a, 0, 1023, 1, 20);
  delay(100);
  Serial.write(s);
}

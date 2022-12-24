void setup() {
  for (int j = 2; j < 12; j++) {
    pinMode(j, OUTPUT);
    digitalWrite(j, LOW);
    delay(30);
  }
  Serial.begin(9600);
  for (int j = 2; j < 12; j++) {
    digitalWrite(j, HIGH);
    delay(30);
  }
}


void loop() {
  switch (Serial.read()) {
    case 1: digitalWrite(2, LOW); break;
    case 2: digitalWrite(2, HIGH); break;
    case 3: digitalWrite(3, LOW); break;
    case 4: digitalWrite(3, HIGH); break;
    case 5: digitalWrite(4, LOW); break;
    case 6: digitalWrite(4, HIGH); break;
    case 7: digitalWrite(5, LOW); break;
    case 8: digitalWrite(5, HIGH); break;
    case 9: digitalWrite(6, LOW); break;
    case 10: digitalWrite(6, HIGH); break;
    case 11: digitalWrite(7, LOW); break;
    case 12: digitalWrite(7, HIGH); break;
    case 13: digitalWrite(8, LOW); break;
    case 14: digitalWrite(8, HIGH); break;
    case 15: digitalWrite(9, LOW); break;
    case 16: digitalWrite(9, HIGH); break;
    case 17: digitalWrite(10, LOW); break;
    case 18: digitalWrite(10, HIGH); break;
    case 19: digitalWrite(11, LOW); break;
    case 20: digitalWrite(11, HIGH); break;
    case 21: for (int j = 2; j < 12; j++) {
        digitalWrite(j, LOW);
      } break;
    case 22: for (int j = 2; j < 12; j++) {
        digitalWrite(j, HIGH);
      } break;
  }
  delay(10);
}

int R;
int G;
int B;
void setup() {
Serial.begin(9600);
}

void loop() {
int pinPot1 = analogRead(A0);
R = map(pinPot1, 0, 1023, 0, 85);
Serial.write(R);

int pinPot2 = analogRead(A1);
G = map(pinPot2, 0, 1023, 0, 85);
Serial.write(G);

int pinPot3 = analogRead(A2);
B = map(pinPot3, 0, 1023, 0, 85);
Serial.write(B);

delay(500);
}

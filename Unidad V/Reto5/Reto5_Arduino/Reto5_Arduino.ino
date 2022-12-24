#define BTN 13
int val = 0;

void setup() {
Serial.begin(9600);
pinMode(BTN, INPUT);
}

void loop() {
val= digitalRead(BTN);
if (val == 1){
Serial.println("0");
delay(100);
}
else if(val == 0){
Serial.println("1");  
delay(100);
}
}

char val;

void setup() {
Serial.begin(9600);

}

void loop() {
if(Serial.available()){
  val = Serial.read();
  
}

if(val == 'a'){
  digitalWrite(13,HIGH);
}
else if(val == 'b'){
  digitalWrite(13,LOW);
}
}

char val;

void setup() {
Serial.begin(9600);
pinMode(2,OUTPUT);
}

void loop() {
if(Serial.available()){
  val=Serial.read();
}
if(val=='a'){
  digitalWrite(2,0);
}
else if(val== 'b'){
  digitalWrite(2,1);
}
}

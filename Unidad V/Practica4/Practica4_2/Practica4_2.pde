import processing.serial.*;

Serial myPort;

void setup(){
size (600,600);

myPort = new Serial(this,"COM15",9600);
}

void draw(){
  if(myPort.available()>0){    
  println(myPort.read());
  }
}

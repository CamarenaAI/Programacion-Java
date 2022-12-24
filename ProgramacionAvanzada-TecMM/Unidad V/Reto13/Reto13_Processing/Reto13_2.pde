import processing.serial.*;
Serial myPort;

int val;
int R;
int G;
int B;

void setup(){
  size(600,600);
  myPort = new Serial(this, "COM15", 9600);
}

void draw(){
  if(myPort.available()>=3){
    val = myPort.read();
    R = (int)map(val,0,85,0,255);
    val = myPort.read();
    G = (int)map(val,0,85,0,255);
    val = myPort.read();
    B = (int)map(val,0,85,0,255);
  }
  fill(R,G,B);
  ellipse(300,300,400,400);
  println("Color: ", + val);
}

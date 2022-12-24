import processing.serial.*;
Serial myPort;

void setup(){
  size(600,600); 
  myPort = new Serial(this, "COM15", 9600);
}

void draw(){
}

void mousePressed(){ 
  if(mouseButton == LEFT){
    myPort.write('a');
    fill(255,0,0);
  ellipse(300,300,400,400);
  fill(0,0,0);
  textSize(15);
  text("Apagado", 300,300); 
}

else if (mouseButton == RIGHT){
  myPort.write('b');
  fill(0,255,0);
  ellipse(300,300,400,400);
  fill(0,0,0);
  textSize(15);
  text("Encendido", 300,300);
}
}

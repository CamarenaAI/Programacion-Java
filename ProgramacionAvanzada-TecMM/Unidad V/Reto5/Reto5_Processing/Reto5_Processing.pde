import processing.serial.*;
Serial myPort;


void setup(){
size(600,600);
myPort = new Serial(this,"COM15",9600);
fill(255,0,0);
ellipse(300,300,400,400);
fill(0,0,0);
textSize(15);
text("Apagado",300,300);
}

void draw(){
//println(myPort.read());
//Encendido
if(myPort.available()>=48){ 
if(myPort.read() == 49){
fill(0,255,0);
ellipse(300,300,400,400);
fill(0,0,0);
textSize(15);
text("Encendido",300,300);
}
//Apagado
else if((myPort.available()>=48)){
if(myPort.read() == 48){  
fill(255,0,0);
ellipse(300,300,400,400);
fill(0,0,0);
textSize(15);
text("Apagado",300,300);
}
}
}
}

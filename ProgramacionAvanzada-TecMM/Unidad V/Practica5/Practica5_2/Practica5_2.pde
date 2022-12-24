import processing.serial.*;
Serial miPuerto;


void setup(){
miPuerto = new Serial(this,"COM15",9600);
}

void draw(){
  
}

void keyPressed(){
   miPuerto.write('1');
   if(key == '1'){
   print("Encnedido");
}
 else if(key == '0'){
   miPuerto.write('0');
}
}

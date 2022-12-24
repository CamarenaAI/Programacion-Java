import processing.serial.*;
Serial myPort;    // El puerto serial
int xPos = 1;     // Posicion horizontal del grafico
float inByte = 0; // Variable de almacenamiento para la lectura del potenciometro 

void setup () {
  size(1200, 600);         // Tamano de la pantalla:
  println(myPort); // Muestra el puerto conectado
  myPort = new Serial(this,"COM15", 9600); // En el lugar de [0], debe ir el puerto                                                     // al que esta conectado el Arduino
  myPort.bufferUntil('\n'); // Lee el puerto serial hasta encontrar un LF (Line feed)
  background(100);          // Fondo de pantalla
}

void draw () {
stroke(#03FA00);
textSize(30);
text("TEMPERATURA LM35",500,100);
//105°
text("105°", 10, 190);
fill(255,255,255); 
rect(0,190,1500,5); //Rectangulo(x,y,w,h)
//85°
text("85°", 10, 290);
fill(255,255,255); 
rect(0,290,1500,5); //Rectangulo(x,y,w,h)
//55°
text("55°", 10, 390);
fill(255,255,255); 
rect(0,390,1500,5); //Rectangulo(x,y,w,h)
//25°  
text("25°", 10, 490);
fill(255,255,255); 
rect(0,490,1500,5); //Rectangulo(x,y,w,h) 

  stroke(255,0,0); // Color de la linea 
  line(xPos, height, xPos, height - inByte); // Dibuja la linea
  if (xPos >= width) { // Verifica que hemos llegado al limite de pantalla
    xPos = 0;          // Reseteo de la posicion a la posicion inicial
    background(100);   // Fondo de pantalla
  } 
  else { xPos++; } // Nos movemos en la posicion horizontal 
}

void serialEvent (Serial Puerto) {
  String inString = Puerto.readStringUntil('\n'); // Lee la cadena hasta encontrar un enter

  if (inString != null) {
    inString = trim(inString); // Se quita los espacios en blanco:
    inByte = float(inString);  // Convierte en flotante el String leido
    println(inByte);           // Muestra el dato convertido
    inByte = map(inByte, 0, 1023, 0, 500); // Convierte el dato en la altura de salida
  }
}

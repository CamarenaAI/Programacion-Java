#include <SoftwareSerial.h>
SoftwareSerial mySerial(8,9); //Rx,Tx

/////////////////////
#include <SFE_BMP180.h>
#include <Wire.h>
SFE_BMP180 bmp180;
float temp;
int i;
int j;
int k;
int o; 
//////////////////////
char buffer[2];
 
void setup() {
  // Inicializamos comunicación serie
  mySerial.begin(9600);
  Serial.begin(9600);
  
  if (bmp180.begin())
    Serial.println("BMP180 iniciado correctamenten");
  else
  {
    Serial.println("Error al iniciar el BMP180");
    while(1); // bucle infinito
  }
 
}
 
void loop() {
  sprintf(buffer,"%d,%d",o,i,j,k);
  mySerial.println(buffer);
    // Esperamos 5 segundos entre medidas
  char status;
  double T,P;
  delay(500);

  //////////////////////////
  status = bmp180.startTemperature();//Inicio de lectura de temperatura
  if (status != 0)
  {   
    delay(status); //Pausa para que finalice la lectura
    status = bmp180.getTemperature(T); //Obtener la temperatura
    if (status != 0)
    {
      status = bmp180.startPressure(3); //Inicio lectura de presión
      if (status != 0)
      {        
        delay(status);//Pausa para que finalice la lectura        
        status = bmp180.getPressure(P,T); //Obtenemos la presión
        if (status != 0)
        {                  
   temp=T; 
    i = (int) temp;  
        }      
      }      
    }   
  }
  mySerial.println(temp); 
  delay(300);
}

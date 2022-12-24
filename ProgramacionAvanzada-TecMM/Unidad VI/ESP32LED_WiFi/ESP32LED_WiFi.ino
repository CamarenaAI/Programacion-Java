#include <WiFi.h>
#include <WiFiClient.h>
#include <WiFiServer.h>
#include <WiFiUdp.h>


const char* ssid = "Lenovo";
const char* password = "mecatronica";
WiFiServer server(80);

void setup() {
Serial.begin(115200); //Start Serial
WiFi.begin(ssid, password); //Connect to WiFi
while(WiFi.status() != WL_CONNECTED){
  delay(500);
  Serial.print(".");
}

Serial.print("");
Serial.println("WiFi connected");
Serial.println(WiFi.localIP());
pinMode(2,OUTPUT);

server.begin();
Serial.println("Server Started");
}

void loop() {
WiFiClient client = server.available();
if(!client){
  return;
}

//Wait for data

Serial.println("New Client");
while(!client.available()){
  delay(1);
}

//Read the request

String request = client.readStringUntil('\r');
Serial.println(request);
client.flush();

//Match the request
//int value = LOW;
if(request.indexOf("/LED=ON")!= -1){
  digitalWrite(2,HIGH);
}
if(request.indexOf("/LED=OFF")!= -1){
  digitalWrite(2,LOW);
}
}

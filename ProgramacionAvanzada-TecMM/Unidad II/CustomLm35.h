#ifnedf CustomLm35_h
#define CustomLm35_h

#include "Arduino.h"

class CustomLm35 {

public:

CustomLm35(int pin);
float readKelvin();
float readFahrenheit();
float readCelcius();

private:
int _pin;

};

#endif
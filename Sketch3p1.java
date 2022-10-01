void setup(){
  size(500,500);
}
float ch = 0; // horizontal tranformation
float y;// y cordinate

float amplitude = random(500); // amplitude
float frequency =9; // Frequency

void draw(){
  background(254);
  

 
 for(float i = 0;i<720;i = i+ 0.04){
  
   ch = ch - 0.02; // Allows the waves to move
   y = ( amplitude * sin(radians(i*(frequency) + ch)) )+ 180 ; // creates one set of waves sine
  
  y+= amplitude * cos(radians(i*frequency)) ; // addes to the first set of waves cosine
   ellipse(i,y,2,2); 
   
   
 }
  amplitude = random(500); // changes the amplitude everytime it loops through the for loop 
}

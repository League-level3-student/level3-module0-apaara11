/* Copy the code into a new Processing sketch and complete then steps. */

//1. create an array of ints. don't initialize it yet.
int[] integers;

void setup() {
  //2. set the size of your window
size(800,600);
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.
  

  //3. initialize your array with the built in width variable
integers= new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
    //for(int i = 0; i<
  // Random random = new Random().nextInt(height); 
  
  //   the x value will be the index of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array

      //5. call the noStroke() method
  noStroke();
  }
    
    


void draw() {
  //6. set the background color with background(r, g, b);
background(0, 153, 153);

  //7. set the color for your graph

 fill(160, 160, 160);
      for(int i = 0; i < integers.length; i++){
      //8. draw a rectangle for each int in your array.
      rect(i,height,1,-integers[i]);
      }
  
  

  //9. call the stepSort method
 stepSort(integers);

  //10. extract the code that randomizes the array into a method.
 
  //11. call the method you made in step 10 when the mouse is pressed
  if(mousePressed){
    
  randomizingArray();
  }
}
void randomizingArray(){
   for(int i = 0; i < integers.length; i++){
 integers[i]= (int)random(height);
   }
}
void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
//
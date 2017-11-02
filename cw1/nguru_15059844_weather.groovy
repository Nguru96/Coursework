/*
Write your name and student id below as a comment:   
Nguru Iandavis
15059844
*/
//Begin your program below here: 
//import the java class for using the JOptionpane
import javax.swing.*;
double avgHighTemp;
Date today = new Date();
println(today);

String user = new String("Nguru");

String enterName = JOptionPane.showInputDialog("Please Enter Your Name");


println("Welcome to Weather View, " + enterName);    //welcome message
/*
program is run using this function.
*/
runWeather();

def void runWeather(){
     String input = displayMenu();
     if (input.equals(null)){
     println("Thank you for using Weather View. Good day! =)");
     }else if(input.equalsIgnoreCase("CN")){
        cityNames(loadData());
        runWeather();
    } else if(input.equalsIgnoreCase("WD")){
        weatherData(loadData());
        runWeather();
    } else if(input.equalsIgnoreCase("SCH")){
        searchCity(loadData());
        runWeather();
    }else if(input.equalsIgnoreCase("HT")){
        highTemp(loadData());
        runWeather();
    }else if (input.equalsIgnoreCase("LT")){
        lowTemp(loadData());
        runWeather();
    }else{
        println("Thank you for using Weather View. Good day!   =)");    //exit message
    }
}

/*
displaying a menu
*/

//displayMenu();
def String displayMenu(){
   String nextInput = JOptionPane.showInputDialog("<HTML>Please type <br>CN to print a list of city names,<br> WD to print a list of all cities and their weather data <br> SCH to search for a city <br> HT for the city with the highest temp <br> LT for the city with the lowest temp <br> or anything else to exit");
   //println("check input " + nextInput);
   return nextInput;
}



//cityNames(loadData());
def void cityNames(String [][] data){
println("-------");
    for (int i = 0; i < data.length; i++){
        println(data[i][0]);
    }
println("-------");
}

//weatherData(loadData());
def void weatherData(String[][] data){
println("-------");
    for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[i].length; j++){
        println(data[i][j] );
        }
    println();        
    }
println("-------");
}

//searchCity(loadData());
def void searchCity(String [][] data){
println("-------");
    String input = JOptionPane.showInputDialog("Please enter the city you want to search");
    boolean search = false;
    
        for (int i = 0; i < data.length; i++){
            if(input.equalsIgnoreCase(data[i][0])){
            search = true;
            count = i;
            }     
        }
    if(search == true){
        for (int j = 0; j < data[count].length; j++){
            println(data[count][j]);
        }
    }
     else{
                println("City not found");
            }
println("-------");
}

//highTemp(loadData());
def String highTemp(String [][] data){
println("-------");
    double highest = 0;
    int count = 0
    for(int i = 0; i < data.length; i++){
        double currentHigh = Double.parseDouble(data[i][1]);  
        if(highest < currentHigh){
             highest = currentHigh;
             count = i
        }else{
            
        }    
    }
    println("The city with the highest temperature is " + data[count][0] + " where the temperature is " + highest );
    println("The average High Temperature is " + avgHighTemp);
println("-------");
}

//lowTemp(loadData());
def String lowTemp(String [][] data){
println("-------");
    double lowest = 0;
    int count = 0;
    for (int i = 0; i < data.length; i++){
        double currentLow = Double.parseDouble(data[i][2]);
        if (lowest > currentLow){
            lowest = currentLow;
            count = i;
        }else{
        
        }
    }
    println("The city with the lowest temperature is " + data[count][0] + " where the temperature is " + lowest );
    println("-------");
}

//average high temperatures.

def String avgHT(String [][] data){
println("-------");
double values = 0;
int valuesCount = 0;
    for(int i = 0; i < data.length; i++){

    double currentHigh = Double.parseDouble(data[i][1]);
   // values = currentHigh;
     values = values + currentHigh
    valuesCount++;
    }
    avgHighTemp = values / valuesCount;
    println("The average High Temperature is " + avgHighTemp);
println("-------");
}
/*
This function loads weather data from a file.  The file must have each piece of information on a new line.  
You may edit this function if you wish as long as it does what it needs to an you can work with your
code in the demo  (in-class test demo). 

The file being loaded from has this format for each city:
City name
high temp
low temp
rainfall
pressure

The function converts the file into an array which looks like this: 
city_name1  city_name2  etc...
high_temp1  high_temp2
low_temp1   low_temp2
rainfall1   rainfall2
pressure1   pressure2


*/
def String[][] loadData(){
//you can use a local file if you wish but do not change the format - the online version currently enabled will be used for marking
      text = new File("U://cities.txt").text;
    //text = new URL("https://dl.dropboxusercontent.com/u/18820742/cities.txt").text;
       
    int groupSize = 5;
    List <String> list = text.readLines();  //read the text from the textfile
    String []tempArray = list.toArray();    //store the contents of teh list in an array
    String [][] data = new String [tempArray.length/groupSize][groupSize];
    //println(list);//uncomment for debugging
    int count =0; 
    for (int i =0; i < data.length; i++){
        for(int j=0; j< data[i].length; j++){
           data[i][j] = tempArray[count];
        //   print(data[i][j]+" ");//uncomment for debugging
            count++;
         }
    }
    return data;
}

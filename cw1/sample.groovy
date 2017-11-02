loadData();


def String[][] loadData(){
//you can use a local file if you wish but do not change the format - the online version currently enabled will be used for marking
   //text = new File("C:\\Users\\Personal\\4COM1037\\weather\\cities.txt").text;
    text = new URL("https://dl.dropboxusercontent.com/u/18820742/cities.txt").text;
       
    int groupSize = 5;
    List <String> list = text.readLines();
    String []tempArray = list.toArray();
    String [][] data = new String [tempArray.length/groupSize][groupSize];
   // println(list);//uncomment for debugging
    int count =0; 
    for (int i =0; i < data.length; i++){
        for(int j=0; j< data[i].length; j++){
           data[i][j] = tempArray[count];
           //print(data[i][j]+" ");//uncomment for debugging
            count++;
         }
    }
    return data;
}
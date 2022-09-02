class Animal{

public static void main(String[] args) {

int num=Integer.parseInt(args[0]);

int cCount=0, dCount=0, lCount=0, tCount=0;

System.out.println("<" + num + "회 반복 합니다>");

            

for(int i=1; i<=num; i++ ){

System.out.print(i + ".");   

if(i%3==0){

System.out.print("cat ");

             cCount+=1;

}if(i%4==0){

             System.out.print("dog ");

             dCount+=1;

}if(i%5==0){

             System.out.print("lion ");

             lCount+=1;

}if(i%8==0){

             System.out.print("tiger ");

             tCount+=1;

}

System.out.println("");       

}

 

System.out.println("\n"+"<AnimalCount List>");

System.out.println("\t"+ "cat " + cCount + "회");

System.out.println("\t"+ "dog " + dCount + "회");

System.out.println("\t"+ "lion " + lCount + "회");

System.out.println("\t"+ "tiger " + tCount + "회");

}

}

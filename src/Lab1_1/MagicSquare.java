package Lab1_1;

import java.io.*;


public class MagicSquare {
    static boolean isLegalMagicSquare(String fileName) {
      try { FileReader fr=new FileReader(fileName);
       BufferedReader br=new BufferedReader(fr);
       
       String line=null;
       String[] sp;
       int[] lineArray;
       int[][] array=new int[20][20];
       int row=0,col=0;
       while((line=br.readLine())!=null) {
           sp=line.split("\t");//以\t为分割取入数组
           col=sp.length;
           lineArray=new int[sp.length];
           for(int j=0,l=sp.length;j<l;++j) {
               lineArray[j]=Integer.parseInt(sp[j]);  
           }
        array[row++]=lineArray;//按行（维）赋值入二维数组
       }
       br.close();
       System.out.println("col="+col);
       for(int i=0;i<col;i++) {
           for(int j=0;j<row;j++) {
               System.out.print(" "+array[i][j]);
               }
          System.out.println(); 
       /*if(col==row) return true;
       else return false;*/
   }
      }
       finally {
           return true;
       }
    }
    
    public static void main(String[] args) {
    System.out.println(isLegalMagicSquare("D:\\Users\\94727\\eclipse-workspace\\Lab1-162100124\\src\\Lab1_1\\P1\\txt\\1.txt"));
    /*isLegalMagicSquare("D:\\Users\\94727\\eclipse-workspace\\Lab1-162100124\\src\\Lab1_1\\P1\\txt\\2.txt");
    isLegalMagicSquare("D:\\Users\\94727\\eclipse-workspace\\Lab1-162100124\\src\\Lab1_1\\P1\\txt\\3.txt");
    isLegalMagicSquare("D:\\Users\\94727\\eclipse-workspace\\Lab1-162100124\\src\\Lab1_1\\P1\\txt\\4.txt");
    isLegalMagicSquare("D:\\Users\\94727\\eclipse-workspace\\Lab1-162100124\\src\\Lab1_1\\P1\\txt\\5.txt");
*/}
}

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {

    int rowNumber, colnumber, size;
    int[][] map;
    int[][] board;
    boolean game = true;


    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    public MayinTarlasi(int rowNumber, int colnumber) {
        this.rowNumber = rowNumber;
        this.colnumber = colnumber;
        this.map = new int[rowNumber][colnumber];
        this.board = new int[rowNumber][colnumber];
        this.size = rowNumber*colnumber;
    }

    public void run() {
        int row, col, success=0;
        prepareGame();
        //Tarlayı görmek için yorumu kaldır
        // print(map);
        System.out.println("Oyun başladı!");
        while (game){

            print(board);
            System.out.print("Satır: ");
            row = scan.nextInt();
            System.out.print("Sütun: ");
            col = scan.nextInt();

            if (row < 0 || row  >= rowNumber){

                System.out.println("Geçersiz Koordinat!");
                continue;
            }
            if (col < 0 || col  >= colnumber){

                System.out.println("Geçersiz Koordinat!");
                continue;
            }
            if (map[row][col] !=-1){

                 check(row,col);
                success++;
                if(success == (size - (size/4))){

                    System.out.println("----------------TEBRİKLER MAYIN TARLASINI GEÇTİNİZ!!!----------------");

                    break;
                }
            }else{

                game=false;
                System.out.println("----------------MAYINA BASTIN----------------");

            }

        }
    }

    public void prepareGame() {
        int randRow, randCol, count = 0;

        while (count != (size/4) ){

           randRow = rand.nextInt(rowNumber);
           randCol = rand.nextInt(colnumber);
           if (map[randRow][randCol] != -1 ) {
               map[randRow][randCol] = -1;
               count++;
           }
        }
    }

    public void check(int r, int c){
        if (board[r][c]==0) {
            if ((c < colnumber-1) && (map[r][c + 1] == -1)) {
                board[r][c]++;
            }
            if ((r < rowNumber-3) && (map[r + 1][c] == -1)) {
                board[r][c]++;
            }
            if ((r>0) && (map[r - 1][c] == -1)) {
                board[r][c]++;
            }
            if ((c>0) && (map[r][c - 1] == -1)) {
                board[r][c]++;
            }

            if (board [r][c] ==0){

                board[r][c]= -2;
            }
        }
    }

    public void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if (arr[i][j] >= 0){
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }

    }
}
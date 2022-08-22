package src.day17.Task2;

import java.util.Arrays;

public class ChessBoard {

    private final ChessPiece[][] chessPiece;

    public ChessPiece[][] getChessPiece() {
        return chessPiece;
    }

    public ChessBoard(ChessPiece[][] chessPiece){
            this.chessPiece =chessPiece;
    }

    void print(){
        for(int i=0; i<chessPiece.length; i++){
            System.out.println();
            for(int j =0; j<chessPiece[i].length; j++){
                System.out.print(chessPiece[i][j].getPictureName());
            }
        }
    }


}

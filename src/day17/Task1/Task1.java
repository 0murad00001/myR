package src.day17.Task1;

public class Task1 {
    public static void main(String[] args){
        ChessPiece[] massiv = new  ChessPiece[]{ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};


        for(ChessPiece figura: massiv){
            System.out.print (figura.getPictureName());
        }
    }
}

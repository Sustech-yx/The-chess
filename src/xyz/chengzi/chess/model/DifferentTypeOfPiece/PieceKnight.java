package xyz.chengzi.chess.model.DifferentTypeOfPiece;

import xyz.chengzi.chess.model.ChessPiece;
import xyz.chengzi.chess.model.Type;

public class PieceKnight extends ChessPiece {
    public PieceKnight(int player) {
        super(player);
        this.type = Type.Knight;
    }
}
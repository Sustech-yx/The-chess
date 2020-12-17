package xyz.chengzi.halma.model.DifferentTypeOfPiece;

import xyz.chengzi.halma.model.ChessPiece;
import xyz.chengzi.halma.model.Type;

public class PieceBishop extends ChessPiece {
    public PieceBishop(int player) {
        super(player);
        this.type = Type.Bishop;
    }
}

package main.java.week7.assignment_problems.problem2;
public abstract class ArtPiece {

    private static int nextId = 1001;

    private final String pieceId;

    public ArtPiece() {
        pieceId = "ART-" + nextId;
        nextId++;
    }

    public abstract String describe();

    public String getPieceId() {
        return pieceId;
    }
}
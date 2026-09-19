package main.java.week7.assignment_problems.problem2;

public class Sculpture extends ArtPiece {

    private String title;

    public Sculpture(String title) {
        this.title = title;
    }

    @Override
    public String describe() {
        return "Sculpture: " + title + ", carved from stone";
    }
    public static void main(String[] args) {

    Painting p = new Painting("Sunset Fields");
    Sculpture s = new Sculpture("The Thinker II");

    System.out.println(p.describe());
    System.out.println(s.describe());

    System.out.println(p.getPieceId());
    System.out.println(s.getPieceId());
}
}

package main.java.week7.assignment_problems.problem2;

public class Painting extends ArtPiece {

    private String title;

    public Painting(String title) {
        this.title = title;
    }

    @Override
    public String describe() {
        return "Painting: " + title + ", framed on canvas";
    }
}
package main.java.week7.assignment_problems.problem3;
 public class CuttingTool extends GardenTool {

    public CuttingTool() {
        super();
    }

    @Override
    public String use() {
        return super.use() + ", blade sharpened first";
    }
}
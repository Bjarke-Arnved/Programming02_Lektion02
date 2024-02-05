public class Shape {
    private int xAxis;
    private int yAxis;
    private int area;

    public Shape(int xAxis, int yAxis, int area) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.area = area;
    }

    public int getxAxis() {
        return xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public int getArea() {
        return area;
    }
}
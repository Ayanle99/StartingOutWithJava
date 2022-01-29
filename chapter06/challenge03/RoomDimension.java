package challenge03;

public class RoomDimension {

    private double length;
    private double width;

    public RoomDimension(double l, double w){
        length = l;
        width = w;
    }
    public double getArea(){
        return  length * width;
    }


}


public class VolumeCalculator {
    // methods
    //cylinder volume
    public double calculateVolume(double radius, double height){
        return 3.14 * radius * radius * height;
    }
    
    //cuboid volume
    public double calculateVolume(int length, int breadth, int height){
        return length * breadth * height;
    }
    
}

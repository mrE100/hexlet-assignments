package exercise;

// BEGIN
public interface Home {
    double getArea();

    public default int compareTo(Home object2) {
        if (this.getArea() > object2.getArea()) {
            return 1;
        }
        if (this.getArea() == object2.getArea()) {
            return 0;
        }
        if (this.getArea() < object2.getArea()) {
            return -1;
        }
        return 555;
    }


}
// END

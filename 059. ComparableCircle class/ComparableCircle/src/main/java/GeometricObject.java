public abstract class GeometricObject {

    private String color = "while";
    private boolean filled;

    //region getters, setters & constructor
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public GeometricObject() {
        this.color = "pink";
        this.filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //endregion

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

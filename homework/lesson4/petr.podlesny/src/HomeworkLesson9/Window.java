public class Window {
    private String model;
    private String color;
    private String shape;
    private String material;
    private int windth;
    private int height;
    private int ventilationMode;

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    void setShape(String shape) {
        this.shape = shape;
    }

    String getShape() {
        return shape;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    String getMaterial() {
        return material;
    }

    void setWindth(int windth) {
        this.windth = windth;
    }

    int getWindth() {
        return windth;
    }

    void setHeight(int height) {
        this.height = height;
    }

    int getHeight() {
        return height;
    }

    void setVentilationMode(int ventilationMode) {
        if ((ventilationMode > 0) && (ventilationMode < 4)) {
            this.ventilationMode = ventilationMode;
            switch(ventilationMode) {
                case(1):
                    closedWindow();
                case(2):
                    halfOpenedWindow();
                case(3):
                    fullyOpenedWindow();
            }
        }
        else {
            System.out.println("Incorrect mode of ventilation.It should be from 1 to 3.");
        }
    }

    int getVentilationMode() {
        return ventilationMode;
    }

    int calcArea() {
        int windth = getWindth();
        int height = getHeight();
        int area = windth * height;
        return area;
    }

    void closedWindow() {
        System.out.println("Window is closed");
    }

    void halfOpenedWindow() {
        System.out.println("Window is opened only in half");
    }

    void fullyOpenedWindow() {
        System.out.println("Window is opened");
    }

    void windowInfo() {
        System.out.println("Window model: " + model + ".Color is: " + color + ".Shape is: " + shape +
                ".Material is: " + material + ".Windth is: " + windth + ".Height is: " + height + ".Area is: " +
                calcArea() + ".Ventilation mode is: " + ventilationMode);
    }

    public static void main(String[] args) {
        Window w = new Window();
        w.setModel("Veka zx-90");
        w.setColor("Brown");
        w.setMaterial("Plastic");
        w.setShape("Square");
        w.setHeight(25);
        w.setWindth(25);
        w.setVentilationMode(3);
        w.windowInfo();
    }
}


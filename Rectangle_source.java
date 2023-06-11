// Добавить пять интерфейсов к классам из ДЗ 1, включающих все концепции, упомянутые на семинаре. 
// включающих:
// - интерфейсы,
// - константы,
// - default методы,
// - абстрактные классы,
// - перегрузки и переопределения методов.Вы можете выбрать любой класс из ДЗ 1 и добавить к нему интерфейсы. 
// Вам также предоставляется возможность добавить новые методы или использовать уже существующие методы в классе.

public class Rectangle_source {
    double wight;
    double height;

    public Rectangle_source() {
        height = 8;
        wight = 2;
    }

    public Rectangle_source(double height, double wight ) {
        this.height = height;
        this.wight = wight;
    }
    void calculateArea() {
        System.out.println("Площадь прямоугольника = " + height * wight);
    }
    void calculatePerimeter() {
        System.out.println("Периметр прямоугольника = " + (height + wight) * 2);
    }

    void setWight(double wight) {
        this.wight = wight;
}
    void setHeight(double height) {
        this.height = height;
}
    double getWight() {
        return wight;
}
    double getHeight() {
        return height;
    }    
}


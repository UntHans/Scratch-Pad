package Shape;

/**
 * Created by hannesv on 2017/07/05.
 */

public class Traingle extends Shape{

    @Override
    public void calculateArea(int base, int height) {
        this.area = (base * height) / 2;
        super.calculateArea();
    }
}

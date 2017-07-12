package Shape;

/**
 * Created by hannesv on 2017/07/05.
 */

public class Rectangel extends Shape{

    @Override
    public void calculateArea(int lenght, int width) {


        this.area = lenght * width;
        super.calculateArea();

    }
}

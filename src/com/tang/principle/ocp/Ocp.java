package com.tang.principle.ocp;

/** ClassName:Ocp Package:com.tang.principle.ocp @Describe: @Date:2021/10/17 15:49 @Author:TYH */
public class Ocp {
    /**
     * 功能描述
     *
     * @author TYH
     * @date 2021/10/17
     * @param * @param args
     * @return void
     */
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Triangle());
        if ("123".equals("321")) {
            editor.drawShape(new Recangle());
            editor.drawShape(new Triangle());
        } else {
            editor.drawShape(new Cricle());
        }
    }
}

class GraphicEditor {
    // 接收Shape 对象，调用draw 方法
    /**
     * 功能描述
     *
     * @author TYH
     * @date 2021/10/17
     * @param * @param s
     * @return
     */
    public void drawShape(Shape s) {
        s.draw();
        System.out.println();
    }
}
/**
 * 功能描述
 *
 * @author TYH
 * @date 2021/10/17
 * @param * @param null
 * @return
 */
abstract class Shape {
    public abstract void draw();
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

class Cricle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Recangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制长方形");
    }
}

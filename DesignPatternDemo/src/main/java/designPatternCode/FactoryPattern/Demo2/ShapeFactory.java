package designPatternCode.FactoryPattern.Demo2;

import designPatternCode.FactoryPattern.Demo1.Shape;

public class ShapeFactory {
    public static Object getClass(Class<?extends Shape> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }
}



package designPatternCode.FactoryPattern.Demo3;

public class ShapeFactory {
    public static <T> T getClass(Class<? extends T> clazz) {
        T obj = null;

        try {
            obj = (T)Class.forName(clazz.getName()).newInstance();
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

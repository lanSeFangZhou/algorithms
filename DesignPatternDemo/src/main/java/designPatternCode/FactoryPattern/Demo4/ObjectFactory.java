package designPatternCode.FactoryPattern.Demo4;

public class ObjectFactory {
    public <T> Object getObject(Class<T> clazz) {
        if (clazz == null) {
            return null;
        }

        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

}

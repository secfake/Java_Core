public class MyGenneric <T>{
    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "MyGenneric{" +
                "obj=" + obj +
                '}';
    }

    public MyGenneric(T obj) {
        this.obj = obj;
    }
}

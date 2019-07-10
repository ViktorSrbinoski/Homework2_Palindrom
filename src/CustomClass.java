public class CustomClass implements Comparable {

    private int a;
    private double b;
    private String c;

    public CustomClass(int a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public CustomClass() {
    }

    @Override
    public int compareTo(Object o) {
        if(o == null || o.getClass() != CustomClass.class){
            throw new IllegalArgumentException();
        }
        CustomClass comp = (CustomClass)o;
        if(this.a == comp.a){
            if(this.b == comp.b){
                return this.c.compareTo(comp.c);
            }
            else{
                if(this.b < comp.b){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        }
        else {
            if (this.a < comp.a) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

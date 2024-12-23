@ToString(value = ToString.Value.YES)
public class ClassDefault {

    @Default(value = String.class)
    String name;
    public ClassDefault(String name){
        this.name = name;
    }
}

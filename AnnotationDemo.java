class N
{
    public void showMyProjectData(){
        System.out.println("This is N");
    }
}
class M extends N
{
    @Override
    public void showMyProjectData(){
        System.out.println("This is extended M from N");
    }
}
public class AnnotationDemo {
    public static void main(String[] args) {
        M obj = new M();
        obj.showMyProjectData();
    }
}

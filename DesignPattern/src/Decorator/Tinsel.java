package Decorator;

public class Tinsel extends Decorator{
    public Tinsel(ChrismasTree chrismasTree) {
        super(chrismasTree);
    }

    @Override
    public String decorate() {
        return super.decorate();
    }
    public String decorateWithTinsel(){
        return "decorateWithTinsel";
    }
}

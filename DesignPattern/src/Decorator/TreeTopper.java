package Decorator;

class TreeTopper extends Decorator{
    public TreeTopper(ChrismasTree chrismasTree) {
        super(chrismasTree);
    }

    @Override
    public String decorate() {
        return super.decorate()+decorateWithTreeTopper();
    }

    public String decorateWithTreeTopper(){
      return " DecorateWithTreeTopper";
    }

}

package Decorator;

abstract class Decorator implements ChrismasTree {
    private ChrismasTree chrismasTree;

    public Decorator(ChrismasTree chrismasTree) {
        this.chrismasTree = chrismasTree;
    }

    @Override
    public String decorate() {
        return chrismasTree.decorate();
    }
}

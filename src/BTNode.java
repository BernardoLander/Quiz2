
public class BTNode {
    private int level;
    private BTNode rightSon, leftSon, father;
    private int element;

    public BTNode(int element) {
        this.element = element;
        this.rightSon = this.leftSon = this.father = null;
        this.level = 0;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public BTNode getRightSon() {
        return rightSon;
    }

    public void setRightSon(BTNode rightSon) {
        this.rightSon = rightSon;
    }

    public BTNode getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(BTNode leftSon) {
        this.leftSon = leftSon;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public BTNode getFather() {
        return father;
    }

    public void setFather(BTNode father) {
        this.father = father;
    }

    void erasesons() {
        this.rightSon = this.leftSon = null;
    }

}


public class BinaryTree {
    private BTNode root;
    private String treepath;

    public BinaryTree() {
        this.root = null;
        this.treepath = "R";
    }

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }
    
    public void printPreOrden(BTNode root) {
        
        if(root != null) {
            setTreepath(getTreepath().concat("[ "+root.getElement()+" ]"));
            printPreOrden(root.getLeftSon());
            printPreOrden(root.getRightSon());
        }
    }
    
    public boolean emptyTree(){
        return getRoot() == null;
    }
    
    public int insertBTNode(int element,  int Fatherof, boolean leftRight, BTNode root){
//    Returns: 1 if inserted correctly, 2 if Father already has son on space, 3 if fatherless on tree   
        BTNode node = new BTNode(element);
        BTNode temp = root;
        if (emptyTree()){
            setRoot(node);
            node.setLevel(1);
            return 1;
        }else{
            if (temp != null){
                if(temp.getElement() != Fatherof){
                
                    insertBTNode(element, Fatherof, leftRight,temp.getLeftSon());
                    insertBTNode(element, Fatherof, leftRight,temp.getRightSon());    
                }
                else{
    //                True is Left, False is Right
                      if(leftRight){
                          if(temp.getLeftSon() == null){
                              temp.setLeftSon(node);
                              node.setFather(temp);
                              node.setLevel(temp.getLevel() + 1);
                              return 1;
                          }else{
    //                          space occupied
                                return 2;
                          }
                      } else{
                            if(temp.getRightSon() == null){
                              temp.setRightSon(node);
                              node.setFather(temp);
                              node.setLevel(temp.getLevel() + 1);
                              return 1;
                          }else{
    //                          space occupied
                                return 2;
                          } 
                      }
                }
            }else{
                return 3;
            }
        }
        return 0;
    }
    
    public void borrarNivel(BTNode root,int n){
            if(root != null) {
                if (root.getLevel() <= n){
                    borrarNivel(root.getLeftSon(),n);
                    borrarNivel(root.getRightSon(),n);
                }else{
//                  n < root.getLevel()
                    root.getFather().erasesons();
                }
        }
    }

    public String getTreepath() {
        return treepath;
    }

    public void setTreepath(String treepath) {
        this.treepath = treepath;
    }
    
    
}

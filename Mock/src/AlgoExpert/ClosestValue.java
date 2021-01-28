package AlgoExpert;

public class ClosestValue {

    public static void main(String[]args){
        BST tree = new BST(10);
        tree.right = new BST(15);
        tree.left = new BST(5);

        findClosestValueInBst(tree,13);

    }
    public static int findClosestValueInBst(BST tree, int target){

        return findClosestValueInBst(tree,target,tree.value);
    }

    public static int findClosestValueInBst(BST tree, int target, int closest){
        BST currentNode = tree;

        while(currentNode != null){
            System.out.println(tree.value);
            if(Math.abs(target-closest)> Math.abs(target-currentNode.value)){
                closest = currentNode.value;
            }

            if(target > currentNode.value){
                currentNode = currentNode.right;
            }

            else if(target < currentNode.value){
                currentNode = currentNode.left;
            }else break;

        }
        return closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}



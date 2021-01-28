package AlgoExpert;
//Per A.E.
public class BST {

        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            //If parameter value is higher than original
            if(this.value > value){
                //Create new left node
                if(left == null){
                    BST newBST = new BST(value);
                    left = newBST;
                }
                //Recursive call
                else{
                    left.insert(value);
                }
            }else{
                //Right node DNE. New leaf.Else recursive call.
                if(right == null){
                    BST newBST = new BST(value);
                    right = newBST;
                }else{
                    right.insert(value);
                }
            }
            return this;
        }

        public boolean contains(int value) {
            //If parameter value is less than current value go left. If finally null, DNE.
            //If parameter value is greater than current go right. If finally null DNE.
            if(this.value > value){
                if(left == null){
                    return false;
                }else{
                    return left.contains(value);
                }
            }
            else if(this.value < value){
                if(right == null){
                    return false;
                }else{
                    return right.contains(value);
                }
            }
            else {return true;}
        }

        public BST remove(int value){
            remove(value, null);
            return this;
        }

        public void remove(int value, BST parent) {
            //Go left if parameter is less.Right if more
            if(value < this.value){
                if(left != null){
                    left.remove(value, this);
                }
            }else if(value > this.value){
                if(right != null){
                    right.remove(value,this);
                }
            }else{
                if(left != null && right !=null){
                    this.value = right.getMinValue();
                    right.remove(this.value,this);
                }else if(parent == null){
                    if(left != null){
                        this.value = left.value;
                        right = left.right;
                        left = left.left;
                    }else if(right != null){
                        this.value = right.value;
                        left = right.left;
                        right = right.right;
                    }
                    else{
                        //Single node Tree.
                    }
                }else if(parent.left == this){
                    parent.left = left != null? left : right;
                }else if(parent.right == this){
                    parent.right = left != null? left : right;
                }
            }
        }

        public int getMinValue(){
            if(left == null){
                return this.value;
            }
            else return left.getMinValue();
        }

}

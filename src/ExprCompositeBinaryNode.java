
public class ExprCompositeBinaryNode extends ExprCompositeUnaryNode {

	private ExprTreeComponentNode left;
	
	public ExprCompositeBinaryNode(ExprTreeComponentNode left,ExprTreeComponentNode right) {
		super(right);
		this.left = left;
	}

	public ExprTreeComponentNode getLeft() {
		return left;
	}

	public void setLeft(ExprTreeComponentNode left) {
		this.left = left;
	}
	
	

}

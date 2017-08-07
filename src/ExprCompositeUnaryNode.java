/**
 * defines a right child!
 * why din't we choose the single child to be a left child ?
 * Still Unanswered.
 * @author kaushik
 *
 */
public class ExprCompositeUnaryNode extends ExprTreeComponentNode {

	private ExprTreeComponentNode right;

	public ExprCompositeUnaryNode(ExprTreeComponentNode right) {
		super();
		this.right = right;
	}

	public ExprTreeComponentNode getRight() {
		return right;
	}

	public void setRight(ExprTreeComponentNode right) {
		this.right = right;
	}
	
	
}

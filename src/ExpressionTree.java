
public class ExpressionTree {

	private ExprTreeComponentNode root;

	public ExpressionTree(ExprTreeComponentNode root) {
		super();
		this.root = root;
	}
	
	public void accept(Visitor v){
		root.accept(v);
	}
}

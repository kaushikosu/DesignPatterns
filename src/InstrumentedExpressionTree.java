/**
 * This is a refined abstraction of the type Expression Tree
 * @author kaushik
 *
 */
public class InstrumentedExpressionTree extends ExpressionTree {

	public InstrumentedExpressionTree(ExprTreeComponentNode root) {
		super(root);
		// TODO Auto-generated constructor stub
	}

	
	public void accept(Visitor v){
		//log operation 1
		super.accept(v);
		// log operation 2
	}
}

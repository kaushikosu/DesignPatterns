

/**
 * base class of the nodes of the Expression tree hierarchy
 * @author kaushik
 *
 */
public abstract class ExprTreeComponentNode {
	
	
	/**
	 * We are implementing these methods so that subClasses that are not meant to have this functionality can
	 * just ignore their implementations. If we make them abstract the concrete subclasses have to implement them
	 * which doesn't make sense at that point.
	 * @return
	 */
	
	public ExprTreeComponentNode getRightNode(){
		return null;
	}
	
	public ExprTreeComponentNode getLeftNode(){
		return null;
	}
	
	
	public void accept(Visitor v){
		return;
	}
	
}

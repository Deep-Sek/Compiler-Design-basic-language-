package cop5556sp17.AST;

import cop5556sp17.AST.Type.TypeName;
import cop5556sp17.Scanner.Token;

public abstract class Expression extends ASTNode {
	
	private TypeName type;
	
	public TypeName getExpressionType() {
		return type;
	} 
	
	public void setExpressionType(TypeName type) {
		this.type = type;
	}
	
	protected Expression(Token firstToken) {
		super(firstToken);
	}

	@Override
	abstract public Object visit(ASTVisitor v, Object arg) throws Exception;

}

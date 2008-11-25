// Autogenerated AST node
package org.python.antlr.ast;
import java.util.ArrayList;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.adapter.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Lambda extends exprType {
    private argumentsType args;
    public argumentsType getInternalArgs() {
        return args;
    }
    public Object getArgs() {
        return args;
    }
    public void setArgs(Object args) {
        this.args = AstAdapters.to_arguments(args);
    }

    private exprType body;
    public exprType getInternalBody() {
        return body;
    }
    public Object getBody() {
        return body;
    }
    public void setBody(Object body) {
        this.body = AstAdapters.to_expr(body);
    }


    private final static String[] fields = new String[] {"args", "body"};
    public String[] get_fields() { return fields; }

    public Lambda() {}
    public Lambda(Object args, Object body) {
        setArgs(args);
        setBody(body);
    }

    public Lambda(Token token, argumentsType args, exprType body) {
        super(token);
        this.args = args;
        this.body = body;
        addChild(body);
    }

    public Lambda(Integer ttype, Token token, argumentsType args, exprType
    body) {
        super(ttype, token);
        this.args = args;
        this.body = body;
        addChild(body);
    }

    public Lambda(PythonTree tree, argumentsType args, exprType body) {
        super(tree);
        this.args = args;
        this.body = body;
        addChild(body);
    }

    public String toString() {
        return "Lambda";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Lambda(");
        sb.append("args=");
        sb.append(dumpThis(args));
        sb.append(",");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitLambda(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null)
            args.accept(visitor);
        if (body != null)
            body.accept(visitor);
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}

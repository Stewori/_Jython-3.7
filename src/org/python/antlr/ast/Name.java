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

public class Name extends exprType implements Context {
    private String id;
    public String getInternalId() {
        return id;
    }
    public Object getId() {
        return id;
    }
    public void setId(Object id) {
        this.id = AstAdapters.to_identifier(id);
    }

    private expr_contextType ctx;
    public expr_contextType getInternalCtx() {
        return ctx;
    }
    public Object getCtx() {
        return ctx;
    }
    public void setCtx(Object ctx) {
        this.ctx = AstAdapters.to_expr_context(ctx);
    }


    private final static String[] fields = new String[] {"id", "ctx"};
    public String[] get_fields() { return fields; }

    public Name() {}
    public Name(Object id, Object ctx) {
        setId(id);
        setCtx(ctx);
    }

    public Name(Token token, String id, expr_contextType ctx) {
        super(token);
        this.id = id;
        this.ctx = ctx;
    }

    public Name(Integer ttype, Token token, String id, expr_contextType ctx) {
        super(ttype, token);
        this.id = id;
        this.ctx = ctx;
    }

    public Name(PythonTree tree, String id, expr_contextType ctx) {
        super(tree);
        this.id = id;
        this.ctx = ctx;
    }

    public String toString() {
        return "Name";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Name(");
        sb.append("id=");
        sb.append(dumpThis(id));
        sb.append(",");
        sb.append("ctx=");
        sb.append(dumpThis(ctx));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitName(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

    public void setContext(expr_contextType c) {
        this.ctx = c;
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

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

public class Print extends stmtType {
    private exprType dest;
    public exprType getInternalDest() {
        return dest;
    }
    public Object getDest() {
        return dest;
    }
    public void setDest(Object dest) {
        this.dest = AstAdapters.to_expr(dest);
    }

    private java.util.List<exprType> values;
    public java.util.List<exprType> getInternalValues() {
        return values;
    }
    public Object getValues() {
        return new ListWrapper(values);
    }
    public void setValues(Object values) {
        this.values = AstAdapters.to_exprList(values);
    }

    private Boolean nl;
    public Boolean getInternalNl() {
        return nl;
    }
    public Object getNl() {
        return nl;
    }
    public void setNl(Object nl) {
        this.nl = AstAdapters.to_bool(nl);
    }


    private final static String[] fields = new String[] {"dest", "values",
                                                          "nl"};
    public String[] get_fields() { return fields; }

    public Print() {}
    public Print(Object dest, Object values, Object nl) {
        setDest(dest);
        setValues(values);
        setNl(nl);
    }

    public Print(Token token, exprType dest, java.util.List<exprType> values,
    Boolean nl) {
        super(token);
        this.dest = dest;
        addChild(dest);
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<exprType>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
        this.nl = nl;
    }

    public Print(Integer ttype, Token token, exprType dest,
    java.util.List<exprType> values, Boolean nl) {
        super(ttype, token);
        this.dest = dest;
        addChild(dest);
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<exprType>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
        this.nl = nl;
    }

    public Print(PythonTree tree, exprType dest, java.util.List<exprType>
    values, Boolean nl) {
        super(tree);
        this.dest = dest;
        addChild(dest);
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<exprType>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
        this.nl = nl;
    }

    public String toString() {
        return "Print";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Print(");
        sb.append("dest=");
        sb.append(dumpThis(dest));
        sb.append(",");
        sb.append("values=");
        sb.append(dumpThis(values));
        sb.append(",");
        sb.append("nl=");
        sb.append(dumpThis(nl));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitPrint(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (dest != null)
            dest.accept(visitor);
        if (values != null) {
            for (PythonTree t : values) {
                if (t != null)
                    t.accept(visitor);
            }
        }
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

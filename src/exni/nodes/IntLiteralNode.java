package exni.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class IntLiteralNode extends ExniNode
{
    public final long value;

    public IntLiteralNode (long value) {
        this.value = value;
    }

    @Override public Object execute (VirtualFrame frame) {
        return value;
    }
}
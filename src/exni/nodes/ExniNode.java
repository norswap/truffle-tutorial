package exni.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public abstract class ExniNode extends Node
{
    /** main execute method */
    public abstract Object execute (VirtualFrame frame);
}

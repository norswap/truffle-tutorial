package exni.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;

public final class ExniRootNode extends RootNode
{
    @SuppressWarnings("FieldMayBeFinal")
    private @Child ExniNode root;

    public ExniRootNode(ExniNode root) {
        super(null);
        this.root = root;
    }

    @Override public Object execute (VirtualFrame frame) {
        return root.execute(frame);
    }
}

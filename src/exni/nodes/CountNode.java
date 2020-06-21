package exni.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class CountNode extends ExniNode {

    public long counter;

    @Override public Object execute (VirtualFrame frame) {
        return counter++;
    }
}

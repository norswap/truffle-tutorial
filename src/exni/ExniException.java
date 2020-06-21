package exni;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.TruffleException;
import com.oracle.truffle.api.nodes.Node;

public final class ExniException extends RuntimeException implements TruffleException
{
    public final Node location;

    @TruffleBoundary
    public ExniException (String message, Node location) {
        super(message);
        this.location = location;
    }

    @Override public Node getLocation() {
        return location;
    }
}

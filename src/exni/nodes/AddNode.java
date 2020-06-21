package exni.nodes;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import exni.ExniException;

@NodeChild("left")
@NodeChild("right")
public abstract class AddNode extends ExniNode
{
    public static AddNode create (ExniNode left, ExniNode right) {
        return AddNodeGen.create(left, right);
    }

    @Specialization protected long addLongs (long left, long right) {
        return left + right;
    }

    @Specialization String addStrings (String left, String right) {
        return left + right;
    }

    @Fallback protected void typeError (Object left, Object right) {
        throw new ExniException("type error: args must be two longs, or two strings", this);
    }
}

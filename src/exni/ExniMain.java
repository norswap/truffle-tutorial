package exni;

import com.oracle.truffle.api.Truffle;
import exni.nodes.AddNode;
import exni.nodes.IntLiteralNode;
import exni.nodes.ExniRootNode;

public abstract class ExniMain
{
    public static void main (String[] args)
    {
        var add = AddNode.create(new IntLiteralNode(1), new IntLiteralNode(2));
        var root = new ExniRootNode(add);
        var target = Truffle.getRuntime().createCallTarget(root);

        // Uncomment this in order to use a CountNode instead of an AddNode.
        // target = Truffle.getRuntime().createCallTarget(new MainNode(new CountNode()));

        System.out.println(target.call());

        // Uncomment this in order to force the compilation of the node.
         while (true) target.call();
    }
}

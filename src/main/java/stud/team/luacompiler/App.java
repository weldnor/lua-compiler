package stud.team.luacompiler;

import anltr4.LuaLexer;
import anltr4.LuaParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import stud.team.luacompiler.util.ThreeUtils;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        String script = "" +
                "b = 10;" +
                "c = (10 + 3) * (2 + 4)" +
                "while true do k = 1 end";
        LuaLexer lexer = new LuaLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LuaParser parser = new LuaParser(tokens);
        ParseTree root = parser.block();

        List<String> ruleNamesList = Arrays.asList(parser.getRuleNames());
        String prettyTree = ThreeUtils.toPrettyTree(root, ruleNamesList);
        System.out.println(prettyTree);
    }
}

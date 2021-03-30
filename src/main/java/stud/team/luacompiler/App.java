package stud.team.luacompiler;

import stud.team.luacompiler.*;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        String javaClassContent = "public class SampleClass { void DoSomething(){} }";
        Java8Lexer java8Lexer = new Java8Lexer(CharStreams.fromString(javaClassContent));
    }
}

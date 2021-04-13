// Generated from /home/anton/IdeaProjects/lua-compiler/src/main/java/anltr4/Lua.g4 by ANTLR 4.9.1
package anltr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuaParser#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(LuaParser.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(LuaParser.ChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LuaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LuaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LuaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LuaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(LuaParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(LuaParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(LuaParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(LuaParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#gotoStat}.
	 * @param ctx the parse tree
	 */
	void enterGotoStat(LuaParser.GotoStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#gotoStat}.
	 * @param ctx the parse tree
	 */
	void exitGotoStat(LuaParser.GotoStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#doStat}.
	 * @param ctx the parse tree
	 */
	void enterDoStat(LuaParser.DoStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#doStat}.
	 * @param ctx the parse tree
	 */
	void exitDoStat(LuaParser.DoStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(LuaParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(LuaParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#repeatStat}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStat(LuaParser.RepeatStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#repeatStat}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStat(LuaParser.RepeatStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(LuaParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(LuaParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(LuaParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(LuaParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#forInStat}.
	 * @param ctx the parse tree
	 */
	void enterForInStat(LuaParser.ForInStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#forInStat}.
	 * @param ctx the parse tree
	 */
	void exitForInStat(LuaParser.ForInStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcStat}.
	 * @param ctx the parse tree
	 */
	void enterFuncStat(LuaParser.FuncStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcStat}.
	 * @param ctx the parse tree
	 */
	void exitFuncStat(LuaParser.FuncStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#localFuncStat}.
	 * @param ctx the parse tree
	 */
	void enterLocalFuncStat(LuaParser.LocalFuncStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#localFuncStat}.
	 * @param ctx the parse tree
	 */
	void exitLocalFuncStat(LuaParser.LocalFuncStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#localVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarDecl(LuaParser.LocalVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#localVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarDecl(LuaParser.LocalVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#retstat}.
	 * @param ctx the parse tree
	 */
	void enterRetstat(LuaParser.RetstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#retstat}.
	 * @param ctx the parse tree
	 */
	void exitRetstat(LuaParser.RetstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(LuaParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(LuaParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(LuaParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(LuaParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(LuaParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(LuaParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#namelist}.
	 * @param ctx the parse tree
	 */
	void enterNamelist(LuaParser.NamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#namelist}.
	 * @param ctx the parse tree
	 */
	void exitNamelist(LuaParser.NamelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#attnamelist}.
	 * @param ctx the parse tree
	 */
	void enterAttnamelist(LuaParser.AttnamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#attnamelist}.
	 * @param ctx the parse tree
	 */
	void exitAttnamelist(LuaParser.AttnamelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttrib(LuaParser.AttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttrib(LuaParser.AttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(LuaParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(LuaParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LuaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LuaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(LuaParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(LuaParser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void enterVarOrExp(LuaParser.VarOrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void exitVarOrExp(LuaParser.VarOrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LuaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LuaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void enterVarSuffix(LuaParser.VarSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void exitVarSuffix(LuaParser.VarSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#nameAndArgs}.
	 * @param ctx the parse tree
	 */
	void enterNameAndArgs(LuaParser.NameAndArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#nameAndArgs}.
	 * @param ctx the parse tree
	 */
	void exitNameAndArgs(LuaParser.NameAndArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(LuaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(LuaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef(LuaParser.FunctiondefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef(LuaParser.FunctiondefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(LuaParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(LuaParser.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#parlist}.
	 * @param ctx the parse tree
	 */
	void enterParlist(LuaParser.ParlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#parlist}.
	 * @param ctx the parse tree
	 */
	void exitParlist(LuaParser.ParlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableconstructor(LuaParser.TableconstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableconstructor(LuaParser.TableconstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void enterFieldlist(LuaParser.FieldlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void exitFieldlist(LuaParser.FieldlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(LuaParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(LuaParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void enterFieldsep(LuaParser.FieldsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void exitFieldsep(LuaParser.FieldsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#linkOperator}.
	 * @param ctx the parse tree
	 */
	void enterLinkOperator(LuaParser.LinkOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#linkOperator}.
	 * @param ctx the parse tree
	 */
	void exitLinkOperator(LuaParser.LinkOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(LuaParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(LuaParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LuaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LuaParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LuaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LuaParser.StringContext ctx);
}
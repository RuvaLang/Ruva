// Generated from RuvaParser.g4 by ANTLR 4.9.3

 package me.hydos.ruva.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuvaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, VAR=51, YIELD=52, RECORD=53, SEALED=54, PERMITS=55, NON_SEALED=56, 
		DECIMAL_LITERAL=57, HEX_LITERAL=58, OCT_LITERAL=59, BINARY_LITERAL=60, 
		FLOAT_LITERAL=61, HEX_FLOAT_LITERAL=62, BOOL_LITERAL=63, CHAR_LITERAL=64, 
		STRING_LITERAL=65, TEXT_BLOCK=66, NULL_LITERAL=67, LPAREN=68, RPAREN=69, 
		LBRACE=70, RBRACE=71, LBRACK=72, RBRACK=73, SEMI=74, COMMA=75, DOT=76, 
		ASSIGN=77, GT=78, LT=79, BANG=80, TILDE=81, QUESTION=82, COLON=83, EQUAL=84, 
		LE=85, GE=86, NOTEQUAL=87, AND=88, OR=89, INC=90, DEC=91, ADD=92, SUB=93, 
		MUL=94, DIV=95, BITAND=96, BITOR=97, CARET=98, MOD=99, ADD_ASSIGN=100, 
		SUB_ASSIGN=101, MUL_ASSIGN=102, DIV_ASSIGN=103, AND_ASSIGN=104, OR_ASSIGN=105, 
		XOR_ASSIGN=106, MOD_ASSIGN=107, LSHIFT_ASSIGN=108, RSHIFT_ASSIGN=109, 
		URSHIFT_ASSIGN=110, ARROW=111, COLONCOLON=112, AT=113, ELLIPSIS=114, WS=115, 
		COMMENT=116, LINE_COMMENT=117, IDENTIFIER=118, OPEN=119, REQUIRES=120, 
		EXPORTS=121, OPENS=122, TO=123, USES=124, PROVIDES=125, WITH=126, TRANSITIVE=127;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_classBody = 16, RULE_interfaceBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_memberDeclaration = 19, RULE_methodDeclaration = 20, 
		RULE_methodBody = 21, RULE_typeTypeOrVoid = 22, RULE_genericMethodDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_constructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31, 
		RULE_interfaceMethodModifier = 32, RULE_genericInterfaceMethodDeclaration = 33, 
		RULE_interfaceCommonBodyDeclaration = 34, RULE_variableDeclarators = 35, 
		RULE_variableDeclarator = 36, RULE_variableDeclaratorId = 37, RULE_variableInitializer = 38, 
		RULE_arrayInitializer = 39, RULE_classOrInterfaceType = 40, RULE_typeArgument = 41, 
		RULE_qualifiedNameList = 42, RULE_formalParameters = 43, RULE_receiverParameter = 44, 
		RULE_formalParameterList = 45, RULE_formalParameter = 46, RULE_lastFormalParameter = 47, 
		RULE_lambdaLVTIList = 48, RULE_lambdaLVTIParameter = 49, RULE_qualifiedName = 50, 
		RULE_literal = 51, RULE_integerLiteral = 52, RULE_floatLiteral = 53, RULE_altAnnotationQualifiedName = 54, 
		RULE_annotation = 55, RULE_elementValuePairs = 56, RULE_elementValuePair = 57, 
		RULE_elementValue = 58, RULE_elementValueArrayInitializer = 59, RULE_annotationTypeDeclaration = 60, 
		RULE_annotationTypeBody = 61, RULE_annotationTypeElementDeclaration = 62, 
		RULE_annotationTypeElementRest = 63, RULE_annotationMethodOrConstantRest = 64, 
		RULE_annotationMethodRest = 65, RULE_annotationConstantRest = 66, RULE_defaultValue = 67, 
		RULE_recordDeclaration = 68, RULE_recordHeader = 69, RULE_recordComponentList = 70, 
		RULE_recordComponent = 71, RULE_recordBody = 72, RULE_block = 73, RULE_blockStatement = 74, 
		RULE_localVariableDeclaration = 75, RULE_identifier = 76, RULE_localTypeDeclaration = 77, 
		RULE_statement = 78, RULE_catchClause = 79, RULE_catchType = 80, RULE_finallyBlock = 81, 
		RULE_resourceSpecification = 82, RULE_resources = 83, RULE_resource = 84, 
		RULE_switchBlockStatementGroup = 85, RULE_switchLabel = 86, RULE_forControl = 87, 
		RULE_forInit = 88, RULE_enhancedForControl = 89, RULE_parExpression = 90, 
		RULE_expressionList = 91, RULE_methodCall = 92, RULE_expression = 93, 
		RULE_pattern = 94, RULE_lambdaExpression = 95, RULE_lambdaParameters = 96, 
		RULE_lambdaBody = 97, RULE_primary = 98, RULE_switchExpression = 99, RULE_switchLabeledRule = 100, 
		RULE_guardedPattern = 101, RULE_switchRuleOutcome = 102, RULE_classType = 103, 
		RULE_creator = 104, RULE_createdName = 105, RULE_innerCreator = 106, RULE_arrayCreatorRest = 107, 
		RULE_classCreatorRest = 108, RULE_explicitGenericInvocation = 109, RULE_typeArgumentsOrDiamond = 110, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 111, RULE_nonWildcardTypeArguments = 112, 
		RULE_typeList = 113, RULE_typeType = 114, RULE_primitiveType = 115, RULE_typeArguments = 116, 
		RULE_superSuffix = 117, RULE_explicitGenericInvocationSuffix = 118, RULE_arguments = 119;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
			"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "classBody", 
			"interfaceBody", "classBodyDeclaration", "memberDeclaration", "methodDeclaration", 
			"methodBody", "typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
			"interfaceCommonBodyDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "classOrInterfaceType", 
			"typeArgument", "qualifiedNameList", "formalParameters", "receiverParameter", 
			"formalParameterList", "formalParameter", "lastFormalParameter", "lambdaLVTIList", 
			"lambdaLVTIParameter", "qualifiedName", "literal", "integerLiteral", 
			"floatLiteral", "altAnnotationQualifiedName", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "recordDeclaration", "recordHeader", "recordComponentList", 
			"recordComponent", "recordBody", "block", "blockStatement", "localVariableDeclaration", 
			"identifier", "localTypeDeclaration", "statement", "catchClause", "catchType", 
			"finallyBlock", "resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "expression", "pattern", "lambdaExpression", 
			"lambdaParameters", "lambdaBody", "primary", "switchExpression", "switchLabeledRule", 
			"guardedPattern", "switchRuleOutcome", "classType", "creator", "createdName", 
			"innerCreator", "arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'var'", "'yield'", 
			"'record'", "'sealed'", "'permits'", "'non-sealed'", null, null, null, 
			null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'>>>='", "'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "VAR", "YIELD", 
			"RECORD", "SEALED", "PERMITS", "NON_SEALED", "DECIMAL_LITERAL", "HEX_LITERAL", 
			"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "TEXT_BLOCK", "NULL_LITERAL", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", 
			"COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", 
			"OPEN", "REQUIRES", "EXPORTS", "OPENS", "TO", "USES", "PROVIDES", "WITH", 
			"TRANSITIVE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RuvaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuvaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(240);
				packageDeclaration();
				}
				break;
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(243);
				importDeclaration();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					typeDeclaration();
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << NON_SEALED))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (BITAND - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (OPEN - 70)) | (1L << (REQUIRES - 70)) | (1L << (EXPORTS - 70)) | (1L << (OPENS - 70)) | (1L << (TO - 70)) | (1L << (USES - 70)) | (1L << (PROVIDES - 70)) | (1L << (WITH - 70)) | (1L << (TRANSITIVE - 70)))) != 0)) {
				{
				{
				setState(255);
				classBodyDeclaration();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(RuvaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (AT - 113)) | (1L << (IDENTIFIER - 113)) | (1L << (OPEN - 113)) | (1L << (REQUIRES - 113)) | (1L << (EXPORTS - 113)) | (1L << (OPENS - 113)) | (1L << (TO - 113)) | (1L << (USES - 113)) | (1L << (PROVIDES - 113)) | (1L << (WITH - 113)) | (1L << (TRANSITIVE - 113)))) != 0)) {
				{
				{
				setState(261);
				annotation();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(PACKAGE);
			setState(268);
			qualifiedName();
			setState(269);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(RuvaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(RuvaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(RuvaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(RuvaParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(IMPORT);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(272);
				match(STATIC);
				}
			}

			setState(275);
			qualifiedName();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(276);
				match(DOT);
				setState(277);
				match(MUL);
				}
			}

			setState(280);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			int _alt;
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(282);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(287);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(288);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(289);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(290);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(291);
					annotationTypeDeclaration();
					}
					break;
				case RECORD:
					{
					setState(292);
					recordDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(RuvaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(RuvaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(RuvaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(RuvaParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(RuvaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(RuvaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(RuvaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(RuvaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(RuvaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(RuvaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(RuvaParser.STRICTFP, 0); }
		public TerminalNode SEALED() { return getToken(RuvaParser.SEALED, 0); }
		public TerminalNode NON_SEALED() { return getToken(RuvaParser.NON_SEALED, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				annotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(PUBLIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(PROTECTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(PRIVATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				match(STATIC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				match(ABSTRACT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				match(FINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(312);
				match(STRICTFP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(313);
				match(SEALED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(314);
				match(NON_SEALED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(RuvaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(FINAL);
				}
				break;
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(RuvaParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(RuvaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(RuvaParser.IMPLEMENTS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(RuvaParser.PERMITS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(CLASS);
			setState(322);
			identifier();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(323);
				typeParameters();
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(326);
				match(EXTENDS);
				setState(327);
				typeType();
				}
			}

			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(330);
				match(IMPLEMENTS);
				setState(331);
				typeList();
				}
			}

			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(334);
				match(PERMITS);
				setState(335);
				typeList();
				}
			}

			setState(338);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RuvaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(RuvaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(LT);
			setState(341);
			typeParameter();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(342);
				match(COMMA);
				setState(343);
				typeParameter();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(RuvaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(351);
					annotation();
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(357);
			identifier();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(358);
				match(EXTENDS);
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(359);
						annotation();
						}
						} 
					}
					setState(364);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(365);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(RuvaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(RuvaParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			typeType();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(369);
				match(BITAND);
				setState(370);
				typeType();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(RuvaParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(RuvaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RuvaParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(RuvaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RuvaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ENUM);
			setState(377);
			identifier();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(378);
				match(IMPLEMENTS);
				setState(379);
				typeList();
				}
			}

			setState(382);
			match(LBRACE);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (AT - 113)) | (1L << (IDENTIFIER - 113)) | (1L << (OPEN - 113)) | (1L << (REQUIRES - 113)) | (1L << (EXPORTS - 113)) | (1L << (OPENS - 113)) | (1L << (TO - 113)) | (1L << (USES - 113)) | (1L << (PROVIDES - 113)) | (1L << (WITH - 113)) | (1L << (TRANSITIVE - 113)))) != 0)) {
				{
				setState(383);
				enumConstants();
				}
			}

			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(386);
				match(COMMA);
				}
			}

			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(389);
				enumBodyDeclarations();
				}
			}

			setState(392);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			enumConstant();
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(395);
					match(COMMA);
					setState(396);
					enumConstant();
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					annotation();
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(408);
			identifier();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(409);
				arguments();
				}
			}

			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(412);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(SEMI);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << NON_SEALED))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (BITAND - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (OPEN - 70)) | (1L << (REQUIRES - 70)) | (1L << (EXPORTS - 70)) | (1L << (OPENS - 70)) | (1L << (TO - 70)) | (1L << (USES - 70)) | (1L << (PROVIDES - 70)) | (1L << (WITH - 70)) | (1L << (TRANSITIVE - 70)))) != 0)) {
				{
				{
				setState(416);
				classBodyDeclaration();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(RuvaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(RuvaParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(INTERFACE);
			setState(423);
			identifier();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(424);
				typeParameters();
				}
			}

			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(427);
				match(EXTENDS);
				setState(428);
				typeList();
				}
			}

			setState(431);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(RuvaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RuvaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(LBRACE);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << NON_SEALED))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (BITAND - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (OPEN - 70)) | (1L << (REQUIRES - 70)) | (1L << (EXPORTS - 70)) | (1L << (OPENS - 70)) | (1L << (TO - 70)) | (1L << (USES - 70)) | (1L << (PROVIDES - 70)) | (1L << (WITH - 70)) | (1L << (TRANSITIVE - 70)))) != 0)) {
				{
				{
				setState(434);
				classBodyDeclaration();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(RuvaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RuvaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(LBRACE);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << NON_SEALED))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SEMI - 74)) | (1L << (LT - 74)) | (1L << (BITAND - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN - 74)) | (1L << (REQUIRES - 74)) | (1L << (EXPORTS - 74)) | (1L << (OPENS - 74)) | (1L << (TO - 74)) | (1L << (USES - 74)) | (1L << (PROVIDES - 74)) | (1L << (WITH - 74)) | (1L << (TRANSITIVE - 74)))) != 0)) {
				{
				{
				setState(443);
				interfaceBodyDeclaration();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(RuvaParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(452);
					match(STATIC);
					}
				}

				setState(455);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(456);
						modifier();
						}
						} 
					}
					setState(461);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(462);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_memberDeclaration);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(471);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(472);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(473);
				enumDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(474);
				recordDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(RuvaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(RuvaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(RuvaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(RuvaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(RuvaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			typeTypeOrVoid();
			setState(478);
			identifier();
			setState(479);
			formalParameters();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(480);
				match(LBRACK);
				setState(481);
				match(RBRACK);
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(487);
				match(THROWS);
				setState(488);
				qualifiedNameList();
				}
			}

			setState(491);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodBody);
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(RuvaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitTypeTypeOrVoid(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeTypeOrVoid);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case BITAND:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			typeParameters();
			setState(502);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			typeParameters();
			setState(505);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(RuvaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			identifier();
			setState(508);
			formalParameters();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(509);
				match(THROWS);
				setState(510);
				qualifiedNameList();
				}
			}

			setState(513);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			typeType();
			setState(516);
			variableDeclarators();
			setState(517);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case LT:
			case BITAND:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(519);
						modifier();
						}
						} 
					}
					setState(524);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(525);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(533);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(534);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(535);
				enumDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(536);
				recordDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			typeType();
			setState(540);
			constantDeclarator();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(541);
				match(COMMA);
				setState(542);
				constantDeclarator();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RuvaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(RuvaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(RuvaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(RuvaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(RuvaParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			identifier();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(551);
				match(LBRACK);
				setState(552);
				match(RBRACK);
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
			match(ASSIGN);
			setState(559);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(561);
					interfaceMethodModifier();
					}
					} 
				}
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(567);
			interfaceCommonBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(RuvaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(RuvaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(RuvaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(RuvaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(RuvaParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodModifier);
		try {
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(573);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(574);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (AT - 113)) | (1L << (IDENTIFIER - 113)) | (1L << (OPEN - 113)) | (1L << (REQUIRES - 113)) | (1L << (EXPORTS - 113)) | (1L << (OPENS - 113)) | (1L << (TO - 113)) | (1L << (USES - 113)) | (1L << (PROVIDES - 113)) | (1L << (WITH - 113)) | (1L << (TRANSITIVE - 113)))) != 0)) {
				{
				{
				setState(577);
				interfaceMethodModifier();
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
			typeParameters();
			setState(584);
			interfaceCommonBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceCommonBodyDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(RuvaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(RuvaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(RuvaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(RuvaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(RuvaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCommonBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterInterfaceCommonBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitInterfaceCommonBodyDeclaration(this);
		}
	}

	public final InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() throws RecognitionException {
		InterfaceCommonBodyDeclarationContext _localctx = new InterfaceCommonBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_interfaceCommonBodyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(586);
					annotation();
					}
					} 
				}
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(592);
			typeTypeOrVoid();
			setState(593);
			identifier();
			setState(594);
			formalParameters();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(595);
				match(LBRACK);
				setState(596);
				match(RBRACK);
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(602);
				match(THROWS);
				setState(603);
				qualifiedNameList();
				}
			}

			setState(606);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			variableDeclarator();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(609);
				match(COMMA);
				setState(610);
				variableDeclarator();
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RuvaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			variableDeclaratorId();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(617);
				match(ASSIGN);
				setState(618);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(RuvaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(RuvaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(RuvaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(RuvaParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			identifier();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(622);
				match(LBRACK);
				setState(623);
				match(RBRACK);
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableInitializer);
		try {
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case BITAND:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(RuvaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RuvaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(LBRACE);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
				{
				setState(634);
				variableInitializer();
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(635);
						match(COMMA);
						setState(636);
						variableInitializer();
						}
						} 
					}
					setState(641);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(642);
					match(COMMA);
					}
				}

				}
			}

			setState(647);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(RuvaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RuvaParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			identifier();
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(650);
				typeArguments();
				}
				break;
			}
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(653);
					match(DOT);
					setState(654);
					identifier();
					setState(656);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(655);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RuvaParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(RuvaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(RuvaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArgument);
		int _la;
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (AT - 113)) | (1L << (IDENTIFIER - 113)) | (1L << (OPEN - 113)) | (1L << (REQUIRES - 113)) | (1L << (EXPORTS - 113)) | (1L << (OPENS - 113)) | (1L << (TO - 113)) | (1L << (USES - 113)) | (1L << (PROVIDES - 113)) | (1L << (WITH - 113)) | (1L << (TRANSITIVE - 113)))) != 0)) {
					{
					{
					setState(664);
					annotation();
					}
					}
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(670);
				match(QUESTION);
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(671);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(672);
					typeType();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			qualifiedName();
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(678);
				match(COMMA);
				setState(679);
				qualifiedName();
				}
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RuvaParser.COMMA, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(LPAREN);
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (BITAND - 96)) | (1L << (AT - 96)) | (1L << (IDENTIFIER - 96)) | (1L << (OPEN - 96)) | (1L << (REQUIRES - 96)) | (1L << (EXPORTS - 96)) | (1L << (OPENS - 96)) | (1L << (TO - 96)) | (1L << (USES - 96)) | (1L << (PROVIDES - 96)) | (1L << (WITH - 96)) | (1L << (TRANSITIVE - 96)))) != 0)) {
					{
					setState(686);
					receiverParameter();
					}
				}

				}
				break;
			case 2:
				{
				setState(689);
				receiverParameter();
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(690);
					match(COMMA);
					setState(691);
					formalParameterList();
					}
				}

				}
				break;
			case 3:
				{
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (BITAND - 96)) | (1L << (AT - 96)) | (1L << (IDENTIFIER - 96)) | (1L << (OPEN - 96)) | (1L << (REQUIRES - 96)) | (1L << (EXPORTS - 96)) | (1L << (OPENS - 96)) | (1L << (TO - 96)) | (1L << (USES - 96)) | (1L << (PROVIDES - 96)) | (1L << (WITH - 96)) | (1L << (TRANSITIVE - 96)))) != 0)) {
					{
					setState(694);
					formalParameterList();
					}
				}

				}
				break;
			}
			setState(699);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(RuvaParser.THIS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(RuvaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RuvaParser.DOT, i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			typeType();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (IDENTIFIER - 118)) | (1L << (OPEN - 118)) | (1L << (REQUIRES - 118)) | (1L << (EXPORTS - 118)) | (1L << (OPENS - 118)) | (1L << (TO - 118)) | (1L << (USES - 118)) | (1L << (PROVIDES - 118)) | (1L << (WITH - 118)) | (1L << (TRANSITIVE - 118)))) != 0)) {
				{
				{
				setState(702);
				identifier();
				setState(703);
				match(DOT);
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				formalParameter();
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(713);
						match(COMMA);
						setState(714);
						formalParameter();
						}
						} 
					}
					setState(719);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(720);
					match(COMMA);
					setState(721);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(727);
					variableModifier();
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(733);
			typeType();
			setState(734);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(RuvaParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lastFormalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(736);
					variableModifier();
					}
					} 
				}
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(742);
			typeType();
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (AT - 113)) | (1L << (IDENTIFIER - 113)) | (1L << (OPEN - 113)) | (1L << (REQUIRES - 113)) | (1L << (EXPORTS - 113)) | (1L << (OPENS - 113)) | (1L << (TO - 113)) | (1L << (USES - 113)) | (1L << (PROVIDES - 113)) | (1L << (WITH - 113)) | (1L << (TRANSITIVE - 113)))) != 0)) {
				{
				{
				setState(743);
				annotation();
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(749);
			match(ELLIPSIS);
			setState(750);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaLVTIListContext extends ParserRuleContext {
		public List<LambdaLVTIParameterContext> lambdaLVTIParameter() {
			return getRuleContexts(LambdaLVTIParameterContext.class);
		}
		public LambdaLVTIParameterContext lambdaLVTIParameter(int i) {
			return getRuleContext(LambdaLVTIParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public LambdaLVTIListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterLambdaLVTIList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitLambdaLVTIList(this);
		}
	}

	public final LambdaLVTIListContext lambdaLVTIList() throws RecognitionException {
		LambdaLVTIListContext _localctx = new LambdaLVTIListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lambdaLVTIList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			lambdaLVTIParameter();
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(753);
				match(COMMA);
				setState(754);
				lambdaLVTIParameter();
				}
				}
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaLVTIParameterContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(RuvaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LambdaLVTIParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterLambdaLVTIParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitLambdaLVTIParameter(this);
		}
	}

	public final LambdaLVTIParameterContext lambdaLVTIParameter() throws RecognitionException {
		LambdaLVTIParameterContext _localctx = new LambdaLVTIParameterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lambdaLVTIParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(760);
					variableModifier();
					}
					} 
				}
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(766);
			match(VAR);
			setState(767);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(RuvaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RuvaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			identifier();
			setState(774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(770);
					match(DOT);
					setState(771);
					identifier();
					}
					} 
				}
				setState(776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(RuvaParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(RuvaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(RuvaParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(RuvaParser.NULL_LITERAL, 0); }
		public TerminalNode TEXT_BLOCK() { return getToken(RuvaParser.TEXT_BLOCK, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		try {
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(779);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(780);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(781);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(782);
				match(NULL_LITERAL);
				}
				break;
			case TEXT_BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(783);
				match(TEXT_BLOCK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(RuvaParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(RuvaParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(RuvaParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(RuvaParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(RuvaParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(RuvaParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltAnnotationQualifiedNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(RuvaParser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(RuvaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RuvaParser.DOT, i);
		}
		public AltAnnotationQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAnnotationQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterAltAnnotationQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitAltAnnotationQualifiedName(this);
		}
	}

	public final AltAnnotationQualifiedNameContext altAnnotationQualifiedName() throws RecognitionException {
		AltAnnotationQualifiedNameContext _localctx = new AltAnnotationQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_altAnnotationQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (IDENTIFIER - 118)) | (1L << (OPEN - 118)) | (1L << (REQUIRES - 118)) | (1L << (EXPORTS - 118)) | (1L << (OPENS - 118)) | (1L << (TO - 118)) | (1L << (USES - 118)) | (1L << (PROVIDES - 118)) | (1L << (WITH - 118)) | (1L << (TRANSITIVE - 118)))) != 0)) {
				{
				{
				setState(790);
				identifier();
				setState(791);
				match(DOT);
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(798);
			match(AT);
			setState(799);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(RuvaParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AltAnnotationQualifiedNameContext altAnnotationQualifiedName() {
			return getRuleContext(AltAnnotationQualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(801);
				match(AT);
				setState(802);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(803);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(806);
				match(LPAREN);
				setState(809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(807);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(808);
					elementValue();
					}
					break;
				}
				setState(811);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			elementValuePair();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(815);
				match(COMMA);
				setState(816);
				elementValuePair();
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RuvaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			identifier();
			setState(823);
			match(ASSIGN);
			setState(824);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementValue);
		try {
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				elementValueArrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(RuvaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RuvaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(LBRACE);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
				{
				setState(832);
				elementValue();
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(833);
						match(COMMA);
						setState(834);
						elementValue();
						}
						} 
					}
					setState(839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
			}

			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(842);
				match(COMMA);
				}
			}

			setState(845);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(RuvaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(RuvaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(AT);
			setState(848);
			match(INTERFACE);
			setState(849);
			identifier();
			setState(850);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(RuvaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RuvaParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(LBRACE);
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << NON_SEALED))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SEMI - 74)) | (1L << (BITAND - 74)) | (1L << (AT - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN - 74)) | (1L << (REQUIRES - 74)) | (1L << (EXPORTS - 74)) | (1L << (OPENS - 74)) | (1L << (TO - 74)) | (1L << (USES - 74)) | (1L << (PROVIDES - 74)) | (1L << (WITH - 74)) | (1L << (TRANSITIVE - 74)))) != 0)) {
				{
				{
				setState(853);
				annotationTypeElementDeclaration();
				}
				}
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(859);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case BITAND:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(861);
						modifier();
						}
						} 
					}
					setState(866);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				setState(867);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationTypeElementRest);
		try {
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				typeType();
				setState(872);
				annotationMethodOrConstantRest();
				setState(873);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				classDeclaration();
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(876);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
				interfaceDeclaration();
				setState(881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(880);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(883);
				enumDeclaration();
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(884);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(887);
				annotationTypeDeclaration();
				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(888);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(891);
				recordDeclaration();
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(892);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationMethodOrConstantRest);
		try {
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			identifier();
			setState(902);
			match(LPAREN);
			setState(903);
			match(RPAREN);
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(904);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(RuvaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(DEFAULT);
			setState(910);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordDeclarationContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(RuvaParser.RECORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordHeaderContext recordHeader() {
			return getRuleContext(RecordHeaderContext.class,0);
		}
		public RecordBodyContext recordBody() {
			return getRuleContext(RecordBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(RuvaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterRecordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitRecordDeclaration(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(RECORD);
			setState(913);
			identifier();
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(914);
				typeParameters();
				}
			}

			setState(917);
			recordHeader();
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(918);
				match(IMPLEMENTS);
				setState(919);
				typeList();
				}
			}

			setState(922);
			recordBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordHeaderContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public RecordComponentListContext recordComponentList() {
			return getRuleContext(RecordComponentListContext.class,0);
		}
		public RecordHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterRecordHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitRecordHeader(this);
		}
	}

	public final RecordHeaderContext recordHeader() throws RecognitionException {
		RecordHeaderContext _localctx = new RecordHeaderContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_recordHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(LPAREN);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (BITAND - 96)) | (1L << (AT - 96)) | (1L << (IDENTIFIER - 96)) | (1L << (OPEN - 96)) | (1L << (REQUIRES - 96)) | (1L << (EXPORTS - 96)) | (1L << (OPENS - 96)) | (1L << (TO - 96)) | (1L << (USES - 96)) | (1L << (PROVIDES - 96)) | (1L << (WITH - 96)) | (1L << (TRANSITIVE - 96)))) != 0)) {
				{
				setState(925);
				recordComponentList();
				}
			}

			setState(928);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordComponentListContext extends ParserRuleContext {
		public List<RecordComponentContext> recordComponent() {
			return getRuleContexts(RecordComponentContext.class);
		}
		public RecordComponentContext recordComponent(int i) {
			return getRuleContext(RecordComponentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public RecordComponentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterRecordComponentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitRecordComponentList(this);
		}
	}

	public final RecordComponentListContext recordComponentList() throws RecognitionException {
		RecordComponentListContext _localctx = new RecordComponentListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_recordComponentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			recordComponent();
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(931);
				match(COMMA);
				setState(932);
				recordComponent();
				}
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordComponentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterRecordComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitRecordComponent(this);
		}
	}

	public final RecordComponentContext recordComponent() throws RecognitionException {
		RecordComponentContext _localctx = new RecordComponentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_recordComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			typeType();
			setState(939);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(RuvaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RuvaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public RecordBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterRecordBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitRecordBody(this);
		}
	}

	public final RecordBodyContext recordBody() throws RecognitionException {
		RecordBodyContext _localctx = new RecordBodyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_recordBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(LBRACE);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << NON_SEALED))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (BITAND - 70)) | (1L << (AT - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (OPEN - 70)) | (1L << (REQUIRES - 70)) | (1L << (EXPORTS - 70)) | (1L << (OPENS - 70)) | (1L << (TO - 70)) | (1L << (USES - 70)) | (1L << (PROVIDES - 70)) | (1L << (WITH - 70)) | (1L << (TRANSITIVE - 70)))) != 0)) {
				{
				{
				setState(942);
				classBodyDeclaration();
				}
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(RuvaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RuvaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(LBRACE);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << NON_SEALED) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
				{
				{
				setState(951);
				blockStatement();
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(957);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_blockStatement);
		try {
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				localVariableDeclaration();
				setState(960);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(962);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(963);
				localTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(RuvaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RuvaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(966);
					variableModifier();
					}
					} 
				}
				setState(971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(972);
				typeType();
				setState(973);
				variableDeclarators();
				}
				break;
			case 2:
				{
				setState(975);
				match(VAR);
				setState(976);
				identifier();
				setState(977);
				match(ASSIGN);
				setState(978);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(RuvaParser.IDENTIFIER, 0); }
		public TerminalNode OPEN() { return getToken(RuvaParser.OPEN, 0); }
		public TerminalNode REQUIRES() { return getToken(RuvaParser.REQUIRES, 0); }
		public TerminalNode EXPORTS() { return getToken(RuvaParser.EXPORTS, 0); }
		public TerminalNode OPENS() { return getToken(RuvaParser.OPENS, 0); }
		public TerminalNode TO() { return getToken(RuvaParser.TO, 0); }
		public TerminalNode USES() { return getToken(RuvaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(RuvaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(RuvaParser.WITH, 0); }
		public TerminalNode TRANSITIVE() { return getToken(RuvaParser.TRANSITIVE, 0); }
		public TerminalNode YIELD() { return getToken(RuvaParser.YIELD, 0); }
		public TerminalNode SEALED() { return getToken(RuvaParser.SEALED, 0); }
		public TerminalNode PERMITS() { return getToken(RuvaParser.PERMITS, 0); }
		public TerminalNode RECORD() { return getToken(RuvaParser.RECORD, 0); }
		public TerminalNode VAR() { return getToken(RuvaParser.VAR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (IDENTIFIER - 118)) | (1L << (OPEN - 118)) | (1L << (REQUIRES - 118)) | (1L << (EXPORTS - 118)) | (1L << (OPENS - 118)) | (1L << (TO - 118)) | (1L << (USES - 118)) | (1L << (PROVIDES - 118)) | (1L << (WITH - 118)) | (1L << (TRANSITIVE - 118)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitLocalTypeDeclaration(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_localTypeDeclaration);
		try {
			int _alt;
			setState(996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(984);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(989);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				setState(993);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(990);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(991);
					interfaceDeclaration();
					}
					break;
				case RECORD:
					{
					setState(992);
					recordDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public IdentifierContext identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(RuvaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(RuvaParser.COLON, 0); }
		public TerminalNode IF() { return getToken(RuvaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(RuvaParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(RuvaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(RuvaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(RuvaParser.DO, 0); }
		public TerminalNode TRY() { return getToken(RuvaParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(RuvaParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(RuvaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RuvaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(RuvaParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(RuvaParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(RuvaParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(RuvaParser.BREAK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(RuvaParser.CONTINUE, 0); }
		public TerminalNode YIELD() { return getToken(RuvaParser.YIELD, 0); }
		public SwitchExpressionContext switchExpression() {
			return getRuleContext(SwitchExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				match(ASSERT);
				setState(1000);
				expression(0);
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1001);
					match(COLON);
					setState(1002);
					expression(0);
					}
				}

				setState(1005);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				match(IF);
				setState(1008);
				parExpression();
				setState(1009);
				statement();
				setState(1012);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1010);
					match(ELSE);
					setState(1011);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1014);
				match(FOR);
				setState(1015);
				match(LPAREN);
				setState(1016);
				forControl();
				setState(1017);
				match(RPAREN);
				setState(1018);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1020);
				match(WHILE);
				setState(1021);
				parExpression();
				setState(1022);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1024);
				match(DO);
				setState(1025);
				statement();
				setState(1026);
				match(WHILE);
				setState(1027);
				parExpression();
				setState(1028);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1030);
				match(TRY);
				setState(1031);
				block();
				setState(1041);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1033); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1032);
						catchClause();
						}
						}
						setState(1035); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1038);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1037);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1040);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1043);
				match(TRY);
				setState(1044);
				resourceSpecification();
				setState(1045);
				block();
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1046);
					catchClause();
					}
					}
					setState(1051);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1052);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1055);
				match(SWITCH);
				setState(1056);
				parExpression();
				setState(1057);
				match(LBRACE);
				setState(1061);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1058);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(1063);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1064);
					switchLabel();
					}
					}
					setState(1069);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1070);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1072);
				match(SYNCHRONIZED);
				setState(1073);
				parExpression();
				setState(1074);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1076);
				match(RETURN);
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
					{
					setState(1077);
					expression(0);
					}
				}

				setState(1080);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1081);
				match(THROW);
				setState(1082);
				expression(0);
				setState(1083);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1085);
				match(BREAK);
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (IDENTIFIER - 118)) | (1L << (OPEN - 118)) | (1L << (REQUIRES - 118)) | (1L << (EXPORTS - 118)) | (1L << (OPENS - 118)) | (1L << (TO - 118)) | (1L << (USES - 118)) | (1L << (PROVIDES - 118)) | (1L << (WITH - 118)) | (1L << (TRANSITIVE - 118)))) != 0)) {
					{
					setState(1086);
					identifier();
					}
				}

				setState(1089);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1090);
				match(CONTINUE);
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (IDENTIFIER - 118)) | (1L << (OPEN - 118)) | (1L << (REQUIRES - 118)) | (1L << (EXPORTS - 118)) | (1L << (OPENS - 118)) | (1L << (TO - 118)) | (1L << (USES - 118)) | (1L << (PROVIDES - 118)) | (1L << (WITH - 118)) | (1L << (TRANSITIVE - 118)))) != 0)) {
					{
					setState(1091);
					identifier();
					}
				}

				setState(1094);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1095);
				match(YIELD);
				setState(1096);
				expression(0);
				setState(1097);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1099);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1100);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1101);
				match(SEMI);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1103);
				switchExpression();
				setState(1105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1104);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1107);
				((StatementContext)_localctx).identifierLabel = identifier();
				setState(1108);
				match(COLON);
				setState(1109);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(RuvaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			match(CATCH);
			setState(1114);
			match(LPAREN);
			setState(1118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1115);
					variableModifier();
					}
					} 
				}
				setState(1120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			setState(1121);
			catchType();
			setState(1122);
			identifier();
			setState(1123);
			match(RPAREN);
			setState(1124);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(RuvaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(RuvaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			qualifiedName();
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1127);
				match(BITOR);
				setState(1128);
				qualifiedName();
				}
				}
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(RuvaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			match(FINALLY);
			setState(1135);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RuvaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(LPAREN);
			setState(1138);
			resources();
			setState(1140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1139);
				match(SEMI);
				}
			}

			setState(1142);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(RuvaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(RuvaParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			resource();
			setState(1149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1145);
					match(SEMI);
					setState(1146);
					resource();
					}
					} 
				}
				setState(1151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(RuvaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode VAR() { return getToken(RuvaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_resource);
		try {
			int _alt;
			setState(1169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1152);
						variableModifier();
						}
						} 
					}
					setState(1157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				}
				setState(1163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1158);
					classOrInterfaceType();
					setState(1159);
					variableDeclaratorId();
					}
					break;
				case 2:
					{
					setState(1161);
					match(VAR);
					setState(1162);
					identifier();
					}
					break;
				}
				setState(1165);
				match(ASSIGN);
				setState(1166);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1171);
				switchLabel();
				}
				}
				setState(1174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1176);
				blockStatement();
				}
				}
				setState(1179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << NON_SEALED) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public IdentifierContext varName;
		public TerminalNode CASE() { return getToken(RuvaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(RuvaParser.COLON, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(RuvaParser.IDENTIFIER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(RuvaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_switchLabel);
		try {
			setState(1192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				match(CASE);
				setState(1187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1182);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1183);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(1184);
					typeType();
					setState(1185);
					((SwitchLabelContext)_localctx).varName = identifier();
					}
					break;
				}
				setState(1189);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				match(DEFAULT);
				setState(1191);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(RuvaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(RuvaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_forControl);
		int _la;
		try {
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
					{
					setState(1195);
					forInit();
					}
				}

				setState(1198);
				match(SEMI);
				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
					{
					setState(1199);
					expression(0);
					}
				}

				setState(1202);
				match(SEMI);
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
					{
					setState(1203);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_forInit);
		try {
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1209);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RuvaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(RuvaParser.VAR, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1212);
					variableModifier();
					}
					} 
				}
				setState(1217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1218);
				typeType();
				}
				break;
			case 2:
				{
				setState(1219);
				match(VAR);
				}
				break;
			}
			setState(1222);
			variableDeclaratorId();
			setState(1223);
			match(COLON);
			setState(1224);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(LPAREN);
			setState(1227);
			expression(0);
			setState(1228);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			expression(0);
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1231);
				match(COMMA);
				setState(1232);
				expression(0);
				}
				}
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public TerminalNode BANG() { return getToken(RuvaParser.BANG, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(RuvaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(RuvaParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_methodCall);
		int _la;
		try {
			setState(1260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				identifier();
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BANG) {
					{
					setState(1239);
					match(BANG);
					}
				}

				setState(1242);
				match(LPAREN);
				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
					{
					setState(1243);
					expressionList();
					}
				}

				setState(1246);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				match(THIS);
				setState(1249);
				match(LPAREN);
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
					{
					setState(1250);
					expressionList();
					}
				}

				setState(1253);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1254);
				match(SUPER);
				setState(1255);
				match(LPAREN);
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
					{
					setState(1256);
					expressionList();
					}
				}

				setState(1259);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(RuvaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(RuvaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(RuvaParser.BITAND, i);
		}
		public TerminalNode ADD() { return getToken(RuvaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(RuvaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(RuvaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(RuvaParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(RuvaParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(RuvaParser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public SwitchExpressionContext switchExpression() {
			return getRuleContext(SwitchExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(RuvaParser.COLONCOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(RuvaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RuvaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RuvaParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(RuvaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(RuvaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(RuvaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(RuvaParser.GT, i);
		}
		public TerminalNode LE() { return getToken(RuvaParser.LE, 0); }
		public TerminalNode GE() { return getToken(RuvaParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(RuvaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(RuvaParser.NOTEQUAL, 0); }
		public TerminalNode CARET() { return getToken(RuvaParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(RuvaParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(RuvaParser.AND, 0); }
		public TerminalNode OR() { return getToken(RuvaParser.OR, 0); }
		public TerminalNode COLON() { return getToken(RuvaParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(RuvaParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(RuvaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(RuvaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(RuvaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RuvaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RuvaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(RuvaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(RuvaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(RuvaParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(RuvaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(RuvaParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(RuvaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RuvaParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(RuvaParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(RuvaParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(RuvaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(RuvaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(RuvaParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(RuvaParser.INSTANCEOF, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1263);
				primary();
				}
				break;
			case 2:
				{
				setState(1264);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1265);
				match(NEW);
				setState(1266);
				creator();
				}
				break;
			case 4:
				{
				setState(1267);
				match(LPAREN);
				setState(1271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1268);
						annotation();
						}
						} 
					}
					setState(1273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				}
				setState(1274);
				typeType();
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1275);
					match(BITAND);
					setState(1276);
					typeType();
					}
					}
					setState(1281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1282);
				match(RPAREN);
				setState(1283);
				expression(22);
				}
				break;
			case 5:
				{
				setState(1285);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (INC - 90)) | (1L << (DEC - 90)) | (1L << (ADD - 90)) | (1L << (SUB - 90)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1286);
				expression(20);
				}
				break;
			case 6:
				{
				setState(1287);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1288);
				expression(19);
				}
				break;
			case 7:
				{
				setState(1289);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1290);
				switchExpression();
				}
				break;
			case 9:
				{
				setState(1291);
				typeType();
				setState(1292);
				match(COLONCOLON);
				setState(1298);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case LT:
				case IDENTIFIER:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
					{
					setState(1294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1293);
						typeArguments();
						}
					}

					setState(1296);
					identifier();
					}
					break;
				case NEW:
					{
					setState(1297);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				{
				setState(1300);
				classType();
				setState(1301);
				match(COLONCOLON);
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1302);
					typeArguments();
					}
				}

				setState(1305);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1390);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1309);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1310);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (MUL - 94)) | (1L << (DIV - 94)) | (1L << (MOD - 94)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1311);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1312);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1313);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1314);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1315);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1323);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
						case 1:
							{
							setState(1316);
							match(LT);
							setState(1317);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1318);
							match(GT);
							setState(1319);
							match(GT);
							setState(1320);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1321);
							match(GT);
							setState(1322);
							match(GT);
							}
							break;
						}
						setState(1325);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1326);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1327);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (GT - 78)) | (1L << (LT - 78)) | (1L << (LE - 78)) | (1L << (GE - 78)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1328);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1329);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1330);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1331);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1332);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1333);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1334);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1335);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1336);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1337);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1338);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1339);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1340);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1341);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1342);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1343);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1344);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1345);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1346);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1347);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1348);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1349);
						expression(0);
						setState(1350);
						match(COLON);
						setState(1351);
						expression(7);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1353);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1354);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (ASSIGN - 77)) | (1L << (ADD_ASSIGN - 77)) | (1L << (SUB_ASSIGN - 77)) | (1L << (MUL_ASSIGN - 77)) | (1L << (DIV_ASSIGN - 77)) | (1L << (AND_ASSIGN - 77)) | (1L << (OR_ASSIGN - 77)) | (1L << (XOR_ASSIGN - 77)) | (1L << (MOD_ASSIGN - 77)) | (1L << (LSHIFT_ASSIGN - 77)) | (1L << (RSHIFT_ASSIGN - 77)) | (1L << (URSHIFT_ASSIGN - 77)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1355);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1356);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1357);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1369);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
						case 1:
							{
							setState(1358);
							identifier();
							}
							break;
						case 2:
							{
							setState(1359);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1360);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1361);
							match(NEW);
							setState(1363);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1362);
								nonWildcardTypeArguments();
								}
							}

							setState(1365);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1366);
							match(SUPER);
							setState(1367);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1368);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1371);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1372);
						match(LBRACK);
						setState(1373);
						expression(0);
						setState(1374);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1376);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1377);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1378);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1379);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1382);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
						case 1:
							{
							setState(1380);
							typeType();
							}
							break;
						case 2:
							{
							setState(1381);
							pattern();
							}
							break;
						}
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1384);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1385);
						match(COLONCOLON);
						setState(1387);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1386);
							typeArguments();
							}
						}

						setState(1389);
						identifier();
						}
						break;
					}
					} 
				}
				setState(1394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1395);
					variableModifier();
					}
					} 
				}
				setState(1400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			setState(1401);
			typeType();
			setState(1405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1402);
					annotation();
					}
					} 
				}
				setState(1407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1408);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(RuvaParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			lambdaParameters();
			setState(1411);
			match(ARROW);
			setState(1412);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public LambdaLVTIListContext lambdaLVTIList() {
			return getRuleContext(LambdaLVTIListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_lambdaParameters);
		int _la;
		try {
			setState(1436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1414);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1415);
				match(LPAREN);
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (BITAND - 96)) | (1L << (AT - 96)) | (1L << (IDENTIFIER - 96)) | (1L << (OPEN - 96)) | (1L << (REQUIRES - 96)) | (1L << (EXPORTS - 96)) | (1L << (OPENS - 96)) | (1L << (TO - 96)) | (1L << (USES - 96)) | (1L << (PROVIDES - 96)) | (1L << (WITH - 96)) | (1L << (TRANSITIVE - 96)))) != 0)) {
					{
					setState(1416);
					formalParameterList();
					}
				}

				setState(1419);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1420);
				match(LPAREN);
				setState(1421);
				identifier();
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1422);
					match(COMMA);
					setState(1423);
					identifier();
					}
					}
					setState(1428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1429);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1431);
				match(LPAREN);
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (AT - 113)) | (1L << (IDENTIFIER - 113)) | (1L << (OPEN - 113)) | (1L << (REQUIRES - 113)) | (1L << (EXPORTS - 113)) | (1L << (OPENS - 113)) | (1L << (TO - 113)) | (1L << (USES - 113)) | (1L << (PROVIDES - 113)) | (1L << (WITH - 113)) | (1L << (TRANSITIVE - 113)))) != 0)) {
					{
					setState(1432);
					lambdaLVTIList();
					}
				}

				setState(1435);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_lambdaBody);
		try {
			setState(1440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case BITAND:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1438);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(RuvaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(RuvaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RuvaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(RuvaParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_primary);
		try {
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				match(LPAREN);
				setState(1443);
				expression(0);
				setState(1444);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1447);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1448);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1449);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1450);
				typeTypeOrVoid();
				setState(1451);
				match(DOT);
				setState(1452);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1454);
				nonWildcardTypeArguments();
				setState(1458);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case IDENTIFIER:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
					{
					setState(1455);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1456);
					match(THIS);
					setState(1457);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchExpressionContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(RuvaParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(RuvaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RuvaParser.RBRACE, 0); }
		public List<SwitchLabeledRuleContext> switchLabeledRule() {
			return getRuleContexts(SwitchLabeledRuleContext.class);
		}
		public SwitchLabeledRuleContext switchLabeledRule(int i) {
			return getRuleContext(SwitchLabeledRuleContext.class,i);
		}
		public SwitchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterSwitchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitSwitchExpression(this);
		}
	}

	public final SwitchExpressionContext switchExpression() throws RecognitionException {
		SwitchExpressionContext _localctx = new SwitchExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			match(SWITCH);
			setState(1463);
			parExpression();
			setState(1464);
			match(LBRACE);
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1465);
				switchLabeledRule();
				}
				}
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1471);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabeledRuleContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(RuvaParser.CASE, 0); }
		public SwitchRuleOutcomeContext switchRuleOutcome() {
			return getRuleContext(SwitchRuleOutcomeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(RuvaParser.ARROW, 0); }
		public TerminalNode COLON() { return getToken(RuvaParser.COLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NULL_LITERAL() { return getToken(RuvaParser.NULL_LITERAL, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(RuvaParser.DEFAULT, 0); }
		public SwitchLabeledRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabeledRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterSwitchLabeledRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitSwitchLabeledRule(this);
		}
	}

	public final SwitchLabeledRuleContext switchLabeledRule() throws RecognitionException {
		SwitchLabeledRuleContext _localctx = new SwitchLabeledRuleContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_switchLabeledRule);
		int _la;
		try {
			setState(1484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				match(CASE);
				setState(1477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1474);
					expressionList();
					}
					break;
				case 2:
					{
					setState(1475);
					match(NULL_LITERAL);
					}
					break;
				case 3:
					{
					setState(1476);
					guardedPattern(0);
					}
					break;
				}
				setState(1479);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1480);
				switchRuleOutcome();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1481);
				match(DEFAULT);
				setState(1482);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1483);
				switchRuleOutcome();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardedPatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(RuvaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RuvaParser.AND, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GuardedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterGuardedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitGuardedPattern(this);
		}
	}

	public final GuardedPatternContext guardedPattern() throws RecognitionException {
		return guardedPattern(0);
	}

	private GuardedPatternContext guardedPattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GuardedPatternContext _localctx = new GuardedPatternContext(_ctx, _parentState);
		GuardedPatternContext _prevctx = _localctx;
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_guardedPattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1487);
				match(LPAREN);
				setState(1488);
				guardedPattern(0);
				setState(1489);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case BITAND:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				{
				setState(1494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1491);
						variableModifier();
						}
						} 
					}
					setState(1496);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				setState(1497);
				typeType();
				setState(1501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1498);
						annotation();
						}
						} 
					}
					setState(1503);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				setState(1504);
				identifier();
				setState(1509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1505);
						match(AND);
						setState(1506);
						expression(0);
						}
						} 
					}
					setState(1511);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GuardedPatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guardedPattern);
					setState(1514);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1515);
					match(AND);
					setState(1516);
					expression(0);
					}
					} 
				}
				setState(1521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SwitchRuleOutcomeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchRuleOutcomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchRuleOutcome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterSwitchRuleOutcome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitSwitchRuleOutcome(this);
		}
	}

	public final SwitchRuleOutcomeContext switchRuleOutcome() throws RecognitionException {
		SwitchRuleOutcomeContext _localctx = new SwitchRuleOutcomeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_switchRuleOutcome);
		int _la;
		try {
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << NON_SEALED) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
					{
					{
					setState(1523);
					blockStatement();
					}
					}
					setState(1528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RuvaParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1531);
				classOrInterfaceType();
				setState(1532);
				match(DOT);
				}
				break;
			}
			setState(1539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1536);
					annotation();
					}
					} 
				}
				setState(1541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			setState(1542);
			identifier();
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1543);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_creator);
		try {
			setState(1555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1546);
				nonWildcardTypeArguments();
				setState(1547);
				createdName();
				setState(1548);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1550);
				createdName();
				setState(1553);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1551);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1552);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(RuvaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RuvaParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_createdName);
		int _la;
		try {
			setState(1572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				identifier();
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1558);
					typeArgumentsOrDiamond();
					}
				}

				setState(1568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1561);
					match(DOT);
					setState(1562);
					identifier();
					setState(1564);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1563);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1571);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			identifier();
			setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1575);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1578);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(RuvaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(RuvaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(RuvaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(RuvaParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(LBRACK);
			setState(1608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1581);
				match(RBRACK);
				setState(1586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1582);
					match(LBRACK);
					setState(1583);
					match(RBRACK);
					}
					}
					setState(1588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1589);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case BITAND:
			case AT:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				{
				setState(1590);
				expression(0);
				setState(1591);
				match(RBRACK);
				setState(1598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1592);
						match(LBRACK);
						setState(1593);
						expression(0);
						setState(1594);
						match(RBRACK);
						}
						} 
					}
					setState(1600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				setState(1605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1601);
						match(LBRACK);
						setState(1602);
						match(RBRACK);
						}
						} 
					}
					setState(1607);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			arguments();
			setState(1612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1611);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			nonWildcardTypeArguments();
			setState(1615);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RuvaParser.LT, 0); }
		public TerminalNode GT() { return getToken(RuvaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_typeArgumentsOrDiamond);
		try {
			setState(1620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1617);
				match(LT);
				setState(1618);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1619);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RuvaParser.LT, 0); }
		public TerminalNode GT() { return getToken(RuvaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1622);
				match(LT);
				setState(1623);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1624);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RuvaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(RuvaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			match(LT);
			setState(1628);
			typeList();
			setState(1629);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			typeType();
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1632);
				match(COMMA);
				setState(1633);
				typeType();
				}
				}
				setState(1638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(RuvaParser.BITAND, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(RuvaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(RuvaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(RuvaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(RuvaParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITAND) {
				{
				setState(1639);
				match(BITAND);
				}
			}

			setState(1645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1642);
					annotation();
					}
					} 
				}
				setState(1647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			}
			setState(1650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				{
				setState(1648);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1649);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1655);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (AT - 113)) | (1L << (IDENTIFIER - 113)) | (1L << (OPEN - 113)) | (1L << (REQUIRES - 113)) | (1L << (EXPORTS - 113)) | (1L << (OPENS - 113)) | (1L << (TO - 113)) | (1L << (USES - 113)) | (1L << (PROVIDES - 113)) | (1L << (WITH - 113)) | (1L << (TRANSITIVE - 113)))) != 0)) {
						{
						{
						setState(1652);
						annotation();
						}
						}
						setState(1657);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1658);
					match(LBRACK);
					setState(1659);
					match(RBRACK);
					}
					} 
				}
				setState(1664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(RuvaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(RuvaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(RuvaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(RuvaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(RuvaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(RuvaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(RuvaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(RuvaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RuvaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(RuvaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RuvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RuvaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			match(LT);
			setState(1668);
			typeArgument();
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1669);
				match(COMMA);
				setState(1670);
				typeArgument();
				}
				}
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1676);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RuvaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_superSuffix);
		int _la;
		try {
			setState(1687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1678);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1679);
				match(DOT);
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1680);
					typeArguments();
					}
				}

				setState(1683);
				identifier();
				setState(1685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1684);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(RuvaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1689);
				match(SUPER);
				setState(1690);
				superSuffix();
				}
				break;
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1691);
				identifier();
				setState(1692);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RuvaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RuvaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuvaParserListener ) ((RuvaParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			match(LPAREN);
			setState(1698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << VAR) | (1L << YIELD) | (1L << RECORD) | (1L << SEALED) | (1L << PERMITS) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (TEXT_BLOCK - 64)) | (1L << (NULL_LITERAL - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (BITAND - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN - 64)) | (1L << (REQUIRES - 64)) | (1L << (EXPORTS - 64)) | (1L << (OPENS - 64)) | (1L << (TO - 64)) | (1L << (USES - 64)) | (1L << (PROVIDES - 64)) | (1L << (WITH - 64)) | (1L << (TRANSITIVE - 64)))) != 0)) {
				{
				setState(1697);
				expressionList();
				}
			}

			setState(1700);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 93:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 101:
			return guardedPattern_sempred((GuardedPatternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 26);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 14);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean guardedPattern_sempred(GuardedPatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0081\u06a9\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\3\2\5\2\u00f4\n\2\3\2\7\2\u00f7\n\2\f\2\16\2\u00fa\13"+
		"\2\3\2\7\2\u00fd\n\2\f\2\16\2\u0100\13\2\3\2\7\2\u0103\n\2\f\2\16\2\u0106"+
		"\13\2\3\3\7\3\u0109\n\3\f\3\16\3\u010c\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5"+
		"\4\u0114\n\4\3\4\3\4\3\4\5\4\u0119\n\4\3\4\3\4\3\5\7\5\u011e\n\5\f\5\16"+
		"\5\u0121\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u0128\n\5\3\5\5\5\u012b\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0132\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u013e\n\7\3\b\3\b\5\b\u0142\n\b\3\t\3\t\3\t\5\t\u0147\n\t\3\t\3\t"+
		"\5\t\u014b\n\t\3\t\3\t\5\t\u014f\n\t\3\t\3\t\5\t\u0153\n\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\7\n\u015b\n\n\f\n\16\n\u015e\13\n\3\n\3\n\3\13\7\13\u0163"+
		"\n\13\f\13\16\13\u0166\13\13\3\13\3\13\3\13\7\13\u016b\n\13\f\13\16\13"+
		"\u016e\13\13\3\13\5\13\u0171\n\13\3\f\3\f\3\f\7\f\u0176\n\f\f\f\16\f\u0179"+
		"\13\f\3\r\3\r\3\r\3\r\5\r\u017f\n\r\3\r\3\r\5\r\u0183\n\r\3\r\5\r\u0186"+
		"\n\r\3\r\5\r\u0189\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0190\n\16\f\16\16"+
		"\16\u0193\13\16\3\17\7\17\u0196\n\17\f\17\16\17\u0199\13\17\3\17\3\17"+
		"\5\17\u019d\n\17\3\17\5\17\u01a0\n\17\3\20\3\20\7\20\u01a4\n\20\f\20\16"+
		"\20\u01a7\13\20\3\21\3\21\3\21\5\21\u01ac\n\21\3\21\3\21\5\21\u01b0\n"+
		"\21\3\21\3\21\3\22\3\22\7\22\u01b6\n\22\f\22\16\22\u01b9\13\22\3\22\3"+
		"\22\3\23\3\23\7\23\u01bf\n\23\f\23\16\23\u01c2\13\23\3\23\3\23\3\24\3"+
		"\24\5\24\u01c8\n\24\3\24\3\24\7\24\u01cc\n\24\f\24\16\24\u01cf\13\24\3"+
		"\24\5\24\u01d2\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u01de\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u01e5\n\26\f\26\16\26\u01e8"+
		"\13\26\3\26\3\26\5\26\u01ec\n\26\3\26\3\26\3\27\3\27\5\27\u01f2\n\27\3"+
		"\30\3\30\5\30\u01f6\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\5\33\u0202\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\7\35\u020b\n"+
		"\35\f\35\16\35\u020e\13\35\3\35\3\35\5\35\u0212\n\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u021c\n\36\3\37\3\37\3\37\3\37\7\37\u0222"+
		"\n\37\f\37\16\37\u0225\13\37\3\37\3\37\3 \3 \3 \7 \u022c\n \f \16 \u022f"+
		"\13 \3 \3 \3 \3!\7!\u0235\n!\f!\16!\u0238\13!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u0242\n\"\3#\7#\u0245\n#\f#\16#\u0248\13#\3#\3#\3#\3$\7$\u024e"+
		"\n$\f$\16$\u0251\13$\3$\3$\3$\3$\3$\7$\u0258\n$\f$\16$\u025b\13$\3$\3"+
		"$\5$\u025f\n$\3$\3$\3%\3%\3%\7%\u0266\n%\f%\16%\u0269\13%\3&\3&\3&\5&"+
		"\u026e\n&\3\'\3\'\3\'\7\'\u0273\n\'\f\'\16\'\u0276\13\'\3(\3(\5(\u027a"+
		"\n(\3)\3)\3)\3)\7)\u0280\n)\f)\16)\u0283\13)\3)\5)\u0286\n)\5)\u0288\n"+
		")\3)\3)\3*\3*\5*\u028e\n*\3*\3*\3*\5*\u0293\n*\7*\u0295\n*\f*\16*\u0298"+
		"\13*\3+\3+\7+\u029c\n+\f+\16+\u029f\13+\3+\3+\3+\5+\u02a4\n+\5+\u02a6"+
		"\n+\3,\3,\3,\7,\u02ab\n,\f,\16,\u02ae\13,\3-\3-\5-\u02b2\n-\3-\3-\3-\5"+
		"-\u02b7\n-\3-\5-\u02ba\n-\5-\u02bc\n-\3-\3-\3.\3.\3.\3.\7.\u02c4\n.\f"+
		".\16.\u02c7\13.\3.\3.\3/\3/\3/\7/\u02ce\n/\f/\16/\u02d1\13/\3/\3/\5/\u02d5"+
		"\n/\3/\5/\u02d8\n/\3\60\7\60\u02db\n\60\f\60\16\60\u02de\13\60\3\60\3"+
		"\60\3\60\3\61\7\61\u02e4\n\61\f\61\16\61\u02e7\13\61\3\61\3\61\7\61\u02eb"+
		"\n\61\f\61\16\61\u02ee\13\61\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u02f6"+
		"\n\62\f\62\16\62\u02f9\13\62\3\63\7\63\u02fc\n\63\f\63\16\63\u02ff\13"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u0307\n\64\f\64\16\64\u030a\13"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0313\n\65\3\66\3\66\3\67"+
		"\3\67\38\38\38\78\u031c\n8\f8\168\u031f\138\38\38\38\39\39\39\59\u0327"+
		"\n9\39\39\39\59\u032c\n9\39\59\u032f\n9\3:\3:\3:\7:\u0334\n:\f:\16:\u0337"+
		"\13:\3;\3;\3;\3;\3<\3<\3<\5<\u0340\n<\3=\3=\3=\3=\7=\u0346\n=\f=\16=\u0349"+
		"\13=\5=\u034b\n=\3=\5=\u034e\n=\3=\3=\3>\3>\3>\3>\3>\3?\3?\7?\u0359\n"+
		"?\f?\16?\u035c\13?\3?\3?\3@\7@\u0361\n@\f@\16@\u0364\13@\3@\3@\5@\u0368"+
		"\n@\3A\3A\3A\3A\3A\3A\5A\u0370\nA\3A\3A\5A\u0374\nA\3A\3A\5A\u0378\nA"+
		"\3A\3A\5A\u037c\nA\3A\3A\5A\u0380\nA\5A\u0382\nA\3B\3B\5B\u0386\nB\3C"+
		"\3C\3C\3C\5C\u038c\nC\3D\3D\3E\3E\3E\3F\3F\3F\5F\u0396\nF\3F\3F\3F\5F"+
		"\u039b\nF\3F\3F\3G\3G\5G\u03a1\nG\3G\3G\3H\3H\3H\7H\u03a8\nH\fH\16H\u03ab"+
		"\13H\3I\3I\3I\3J\3J\7J\u03b2\nJ\fJ\16J\u03b5\13J\3J\3J\3K\3K\7K\u03bb"+
		"\nK\fK\16K\u03be\13K\3K\3K\3L\3L\3L\3L\3L\5L\u03c7\nL\3M\7M\u03ca\nM\f"+
		"M\16M\u03cd\13M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u03d7\nM\3N\3N\3O\7O\u03dc"+
		"\nO\fO\16O\u03df\13O\3O\3O\3O\5O\u03e4\nO\3O\5O\u03e7\nO\3P\3P\3P\3P\3"+
		"P\5P\u03ee\nP\3P\3P\3P\3P\3P\3P\3P\5P\u03f7\nP\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\6P\u040c\nP\rP\16P\u040d\3P\5P\u0411"+
		"\nP\3P\5P\u0414\nP\3P\3P\3P\3P\7P\u041a\nP\fP\16P\u041d\13P\3P\5P\u0420"+
		"\nP\3P\3P\3P\3P\7P\u0426\nP\fP\16P\u0429\13P\3P\7P\u042c\nP\fP\16P\u042f"+
		"\13P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0439\nP\3P\3P\3P\3P\3P\3P\3P\5P\u0442"+
		"\nP\3P\3P\3P\5P\u0447\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0454\nP"+
		"\3P\3P\3P\3P\5P\u045a\nP\3Q\3Q\3Q\7Q\u045f\nQ\fQ\16Q\u0462\13Q\3Q\3Q\3"+
		"Q\3Q\3Q\3R\3R\3R\7R\u046c\nR\fR\16R\u046f\13R\3S\3S\3S\3T\3T\3T\5T\u0477"+
		"\nT\3T\3T\3U\3U\3U\7U\u047e\nU\fU\16U\u0481\13U\3V\7V\u0484\nV\fV\16V"+
		"\u0487\13V\3V\3V\3V\3V\3V\5V\u048e\nV\3V\3V\3V\3V\5V\u0494\nV\3W\6W\u0497"+
		"\nW\rW\16W\u0498\3W\6W\u049c\nW\rW\16W\u049d\3X\3X\3X\3X\3X\3X\5X\u04a6"+
		"\nX\3X\3X\3X\5X\u04ab\nX\3Y\3Y\5Y\u04af\nY\3Y\3Y\5Y\u04b3\nY\3Y\3Y\5Y"+
		"\u04b7\nY\5Y\u04b9\nY\3Z\3Z\5Z\u04bd\nZ\3[\7[\u04c0\n[\f[\16[\u04c3\13"+
		"[\3[\3[\5[\u04c7\n[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\7]\u04d4\n]\f"+
		"]\16]\u04d7\13]\3^\3^\5^\u04db\n^\3^\3^\5^\u04df\n^\3^\3^\3^\3^\3^\5^"+
		"\u04e6\n^\3^\3^\3^\3^\5^\u04ec\n^\3^\5^\u04ef\n^\3_\3_\3_\3_\3_\3_\3_"+
		"\7_\u04f8\n_\f_\16_\u04fb\13_\3_\3_\3_\7_\u0500\n_\f_\16_\u0503\13_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0511\n_\3_\3_\5_\u0515\n_\3_\3"+
		"_\3_\5_\u051a\n_\3_\3_\5_\u051e\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\5_\u052e\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0556"+
		"\n_\3_\3_\3_\3_\5_\u055c\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0569"+
		"\n_\3_\3_\3_\5_\u056e\n_\3_\7_\u0571\n_\f_\16_\u0574\13_\3`\7`\u0577\n"+
		"`\f`\16`\u057a\13`\3`\3`\7`\u057e\n`\f`\16`\u0581\13`\3`\3`\3a\3a\3a\3"+
		"a\3b\3b\3b\5b\u058c\nb\3b\3b\3b\3b\3b\7b\u0593\nb\fb\16b\u0596\13b\3b"+
		"\3b\3b\3b\5b\u059c\nb\3b\5b\u059f\nb\3c\3c\5c\u05a3\nc\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u05b5\nd\5d\u05b7\nd\3e\3e\3e\3e"+
		"\7e\u05bd\ne\fe\16e\u05c0\13e\3e\3e\3f\3f\3f\3f\5f\u05c8\nf\3f\3f\3f\3"+
		"f\3f\5f\u05cf\nf\3g\3g\3g\3g\3g\3g\7g\u05d7\ng\fg\16g\u05da\13g\3g\3g"+
		"\7g\u05de\ng\fg\16g\u05e1\13g\3g\3g\3g\7g\u05e6\ng\fg\16g\u05e9\13g\5"+
		"g\u05eb\ng\3g\3g\3g\7g\u05f0\ng\fg\16g\u05f3\13g\3h\3h\7h\u05f7\nh\fh"+
		"\16h\u05fa\13h\5h\u05fc\nh\3i\3i\3i\5i\u0601\ni\3i\7i\u0604\ni\fi\16i"+
		"\u0607\13i\3i\3i\5i\u060b\ni\3j\3j\3j\3j\3j\3j\3j\5j\u0614\nj\5j\u0616"+
		"\nj\3k\3k\5k\u061a\nk\3k\3k\3k\5k\u061f\nk\7k\u0621\nk\fk\16k\u0624\13"+
		"k\3k\5k\u0627\nk\3l\3l\5l\u062b\nl\3l\3l\3m\3m\3m\3m\7m\u0633\nm\fm\16"+
		"m\u0636\13m\3m\3m\3m\3m\3m\3m\3m\7m\u063f\nm\fm\16m\u0642\13m\3m\3m\7"+
		"m\u0646\nm\fm\16m\u0649\13m\5m\u064b\nm\3n\3n\5n\u064f\nn\3o\3o\3o\3p"+
		"\3p\3p\5p\u0657\np\3q\3q\3q\5q\u065c\nq\3r\3r\3r\3r\3s\3s\3s\7s\u0665"+
		"\ns\fs\16s\u0668\13s\3t\5t\u066b\nt\3t\7t\u066e\nt\ft\16t\u0671\13t\3"+
		"t\3t\5t\u0675\nt\3t\7t\u0678\nt\ft\16t\u067b\13t\3t\3t\7t\u067f\nt\ft"+
		"\16t\u0682\13t\3u\3u\3v\3v\3v\3v\7v\u068a\nv\fv\16v\u068d\13v\3v\3v\3"+
		"w\3w\3w\5w\u0694\nw\3w\3w\5w\u0698\nw\5w\u069a\nw\3x\3x\3x\3x\3x\5x\u06a1"+
		"\nx\3y\3y\5y\u06a5\ny\3y\3y\3y\2\4\u00bc\u00ccz\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\2\20\4\2"+
		"\23\23**\3\2;>\3\2?@\4\2\659x\u0081\3\2\\_\3\2RS\4\2`aee\3\2^_\4\2PQW"+
		"X\4\2VVYY\4\2OOfp\3\2\\]\4\2UUqq\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37"+
		"\37\'\'\2\u076d\2\u00f3\3\2\2\2\4\u010a\3\2\2\2\6\u0111\3\2\2\2\b\u012a"+
		"\3\2\2\2\n\u0131\3\2\2\2\f\u013d\3\2\2\2\16\u0141\3\2\2\2\20\u0143\3\2"+
		"\2\2\22\u0156\3\2\2\2\24\u0164\3\2\2\2\26\u0172\3\2\2\2\30\u017a\3\2\2"+
		"\2\32\u018c\3\2\2\2\34\u0197\3\2\2\2\36\u01a1\3\2\2\2 \u01a8\3\2\2\2\""+
		"\u01b3\3\2\2\2$\u01bc\3\2\2\2&\u01d1\3\2\2\2(\u01dd\3\2\2\2*\u01df\3\2"+
		"\2\2,\u01f1\3\2\2\2.\u01f5\3\2\2\2\60\u01f7\3\2\2\2\62\u01fa\3\2\2\2\64"+
		"\u01fd\3\2\2\2\66\u0205\3\2\2\28\u0211\3\2\2\2:\u021b\3\2\2\2<\u021d\3"+
		"\2\2\2>\u0228\3\2\2\2@\u0236\3\2\2\2B\u0241\3\2\2\2D\u0246\3\2\2\2F\u024f"+
		"\3\2\2\2H\u0262\3\2\2\2J\u026a\3\2\2\2L\u026f\3\2\2\2N\u0279\3\2\2\2P"+
		"\u027b\3\2\2\2R\u028b\3\2\2\2T\u02a5\3\2\2\2V\u02a7\3\2\2\2X\u02af\3\2"+
		"\2\2Z\u02bf\3\2\2\2\\\u02d7\3\2\2\2^\u02dc\3\2\2\2`\u02e5\3\2\2\2b\u02f2"+
		"\3\2\2\2d\u02fd\3\2\2\2f\u0303\3\2\2\2h\u0312\3\2\2\2j\u0314\3\2\2\2l"+
		"\u0316\3\2\2\2n\u031d\3\2\2\2p\u0326\3\2\2\2r\u0330\3\2\2\2t\u0338\3\2"+
		"\2\2v\u033f\3\2\2\2x\u0341\3\2\2\2z\u0351\3\2\2\2|\u0356\3\2\2\2~\u0367"+
		"\3\2\2\2\u0080\u0381\3\2\2\2\u0082\u0385\3\2\2\2\u0084\u0387\3\2\2\2\u0086"+
		"\u038d\3\2\2\2\u0088\u038f\3\2\2\2\u008a\u0392\3\2\2\2\u008c\u039e\3\2"+
		"\2\2\u008e\u03a4\3\2\2\2\u0090\u03ac\3\2\2\2\u0092\u03af\3\2\2\2\u0094"+
		"\u03b8\3\2\2\2\u0096\u03c6\3\2\2\2\u0098\u03cb\3\2\2\2\u009a\u03d8\3\2"+
		"\2\2\u009c\u03e6\3\2\2\2\u009e\u0459\3\2\2\2\u00a0\u045b\3\2\2\2\u00a2"+
		"\u0468\3\2\2\2\u00a4\u0470\3\2\2\2\u00a6\u0473\3\2\2\2\u00a8\u047a\3\2"+
		"\2\2\u00aa\u0493\3\2\2\2\u00ac\u0496\3\2\2\2\u00ae\u04aa\3\2\2\2\u00b0"+
		"\u04b8\3\2\2\2\u00b2\u04bc\3\2\2\2\u00b4\u04c1\3\2\2\2\u00b6\u04cc\3\2"+
		"\2\2\u00b8\u04d0\3\2\2\2\u00ba\u04ee\3\2\2\2\u00bc\u051d\3\2\2\2\u00be"+
		"\u0578\3\2\2\2\u00c0\u0584\3\2\2\2\u00c2\u059e\3\2\2\2\u00c4\u05a2\3\2"+
		"\2\2\u00c6\u05b6\3\2\2\2\u00c8\u05b8\3\2\2\2\u00ca\u05ce\3\2\2\2\u00cc"+
		"\u05ea\3\2\2\2\u00ce\u05fb\3\2\2\2\u00d0\u0600\3\2\2\2\u00d2\u0615\3\2"+
		"\2\2\u00d4\u0626\3\2\2\2\u00d6\u0628\3\2\2\2\u00d8\u062e\3\2\2\2\u00da"+
		"\u064c\3\2\2\2\u00dc\u0650\3\2\2\2\u00de\u0656\3\2\2\2\u00e0\u065b\3\2"+
		"\2\2\u00e2\u065d\3\2\2\2\u00e4\u0661\3\2\2\2\u00e6\u066a\3\2\2\2\u00e8"+
		"\u0683\3\2\2\2\u00ea\u0685\3\2\2\2\u00ec\u0699\3\2\2\2\u00ee\u06a0\3\2"+
		"\2\2\u00f0\u06a2\3\2\2\2\u00f2\u00f4\5\4\3\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f8\3\2\2\2\u00f5\u00f7\5\6\4\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fe\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\5\b\5\2\u00fc\u00fb\3\2"+
		"\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0104\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\5&\24\2\u0102\u0101\3\2"+
		"\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\3\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\5p9\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\"\2\2\u010e\u010f\5f\64\2\u010f"+
		"\u0110\7L\2\2\u0110\5\3\2\2\2\u0111\u0113\7\33\2\2\u0112\u0114\7(\2\2"+
		"\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118"+
		"\5f\64\2\u0116\u0117\7N\2\2\u0117\u0119\7`\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7L\2\2\u011b\7\3\2\2\2"+
		"\u011c\u011e\5\f\7\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0127\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0128\5\20\t\2\u0123\u0128\5\30\r\2\u0124\u0128\5 \21\2\u0125\u0128\5"+
		"z>\2\u0126\u0128\5\u008aF\2\u0127\u0122\3\2\2\2\u0127\u0123\3\2\2\2\u0127"+
		"\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u012b\7L\2\2\u012a\u011f\3\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\t\3\2\2\2\u012c\u0132\5\f\7\2\u012d\u0132\7 \2\2\u012e\u0132\7,\2\2\u012f"+
		"\u0132\7\60\2\2\u0130\u0132\7\63\2\2\u0131\u012c\3\2\2\2\u0131\u012d\3"+
		"\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\13\3\2\2\2\u0133\u013e\5p9\2\u0134\u013e\7%\2\2\u0135\u013e\7$\2\2\u0136"+
		"\u013e\7#\2\2\u0137\u013e\7(\2\2\u0138\u013e\7\3\2\2\u0139\u013e\7\24"+
		"\2\2\u013a\u013e\7)\2\2\u013b\u013e\78\2\2\u013c\u013e\7:\2\2\u013d\u0133"+
		"\3\2\2\2\u013d\u0134\3\2\2\2\u013d\u0135\3\2\2\2\u013d\u0136\3\2\2\2\u013d"+
		"\u0137\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013a\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\r\3\2\2\2\u013f\u0142"+
		"\7\24\2\2\u0140\u0142\5p9\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\17\3\2\2\2\u0143\u0144\7\13\2\2\u0144\u0146\5\u009aN\2\u0145\u0147\5"+
		"\22\n\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0149\7\23\2\2\u0149\u014b\5\u00e6t\2\u014a\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014d\7\32\2\2\u014d\u014f\5\u00e4"+
		"s\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u0151\79\2\2\u0151\u0153\5\u00e4s\2\u0152\u0150\3\2\2\2\u0152\u0153\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\5\"\22\2\u0155\21\3\2\2\2\u0156"+
		"\u0157\7Q\2\2\u0157\u015c\5\24\13\2\u0158\u0159\7M\2\2\u0159\u015b\5\24"+
		"\13\2\u015a\u0158\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7P"+
		"\2\2\u0160\23\3\2\2\2\u0161\u0163\5p9\2\u0162\u0161\3\2\2\2\u0163\u0166"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u0170\5\u009aN\2\u0168\u016c\7\23\2\2\u0169\u016b"+
		"\5p9\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\5\26"+
		"\f\2\u0170\u0168\3\2\2\2\u0170\u0171\3\2\2\2\u0171\25\3\2\2\2\u0172\u0177"+
		"\5\u00e6t\2\u0173\u0174\7b\2\2\u0174\u0176\5\u00e6t\2\u0175\u0173\3\2"+
		"\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\27\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7\22\2\2\u017b\u017e\5\u009a"+
		"N\2\u017c\u017d\7\32\2\2\u017d\u017f\5\u00e4s\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\7H\2\2\u0181\u0183\5\32"+
		"\16\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184"+
		"\u0186\7M\2\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2"+
		"\2\2\u0187\u0189\5\36\20\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\7I\2\2\u018b\31\3\2\2\2\u018c\u0191\5\34\17"+
		"\2\u018d\u018e\7M\2\2\u018e\u0190\5\34\17\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\33\3\2\2"+
		"\2\u0193\u0191\3\2\2\2\u0194\u0196\5p9\2\u0195\u0194\3\2\2\2\u0196\u0199"+
		"\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019c\5\u009aN\2\u019b\u019d\5\u00f0y\2\u019c\u019b"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\5\"\22\2"+
		"\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\35\3\2\2\2\u01a1\u01a5"+
		"\7L\2\2\u01a2\u01a4\5&\24\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\37\3\2\2\2\u01a7\u01a5\3\2\2"+
		"\2\u01a8\u01a9\7\36\2\2\u01a9\u01ab\5\u009aN\2\u01aa\u01ac\5\22\n\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ae\7\23"+
		"\2\2\u01ae\u01b0\5\u00e4s\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b2\5$\23\2\u01b2!\3\2\2\2\u01b3\u01b7\7H\2\2\u01b4"+
		"\u01b6\5&\24\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bb\7I\2\2\u01bb#\3\2\2\2\u01bc\u01c0\7H\2\2\u01bd\u01bf\58\35\2\u01be"+
		"\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\7I\2\2\u01c4"+
		"%\3\2\2\2\u01c5\u01d2\7L\2\2\u01c6\u01c8\7(\2\2\u01c7\u01c6\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01d2\5\u0094K\2\u01ca\u01cc"+
		"\5\n\6\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d2\5("+
		"\25\2\u01d1\u01c5\3\2\2\2\u01d1\u01c7\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d2"+
		"\'\3\2\2\2\u01d3\u01de\5*\26\2\u01d4\u01de\5\60\31\2\u01d5\u01de\5\66"+
		"\34\2\u01d6\u01de\5\64\33\2\u01d7\u01de\5\62\32\2\u01d8\u01de\5 \21\2"+
		"\u01d9\u01de\5z>\2\u01da\u01de\5\20\t\2\u01db\u01de\5\30\r\2\u01dc\u01de"+
		"\5\u008aF\2\u01dd\u01d3\3\2\2\2\u01dd\u01d4\3\2\2\2\u01dd\u01d5\3\2\2"+
		"\2\u01dd\u01d6\3\2\2\2\u01dd\u01d7\3\2\2\2\u01dd\u01d8\3\2\2\2\u01dd\u01d9"+
		"\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de"+
		")\3\2\2\2\u01df\u01e0\5.\30\2\u01e0\u01e1\5\u009aN\2\u01e1\u01e6\5X-\2"+
		"\u01e2\u01e3\7J\2\2\u01e3\u01e5\7K\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e8"+
		"\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01eb\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e9\u01ea\7/\2\2\u01ea\u01ec\5V,\2\u01eb\u01e9\3\2\2"+
		"\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\5,\27\2\u01ee+"+
		"\3\2\2\2\u01ef\u01f2\5\u0094K\2\u01f0\u01f2\7L\2\2\u01f1\u01ef\3\2\2\2"+
		"\u01f1\u01f0\3\2\2\2\u01f2-\3\2\2\2\u01f3\u01f6\5\u00e6t\2\u01f4\u01f6"+
		"\7\62\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6/\3\2\2\2\u01f7"+
		"\u01f8\5\22\n\2\u01f8\u01f9\5*\26\2\u01f9\61\3\2\2\2\u01fa\u01fb\5\22"+
		"\n\2\u01fb\u01fc\5\64\33\2\u01fc\63\3\2\2\2\u01fd\u01fe\5\u009aN\2\u01fe"+
		"\u0201\5X-\2\u01ff\u0200\7/\2\2\u0200\u0202\5V,\2\u0201\u01ff\3\2\2\2"+
		"\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\5\u0094K\2\u0204"+
		"\65\3\2\2\2\u0205\u0206\5\u00e6t\2\u0206\u0207\5H%\2\u0207\u0208\7L\2"+
		"\2\u0208\67\3\2\2\2\u0209\u020b\5\n\6\2\u020a\u0209\3\2\2\2\u020b\u020e"+
		"\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020f\u0212\5:\36\2\u0210\u0212\7L\2\2\u0211\u020c\3\2"+
		"\2\2\u0211\u0210\3\2\2\2\u02129\3\2\2\2\u0213\u021c\5<\37\2\u0214\u021c"+
		"\5@!\2\u0215\u021c\5D#\2\u0216\u021c\5 \21\2\u0217\u021c\5z>\2\u0218\u021c"+
		"\5\20\t\2\u0219\u021c\5\30\r\2\u021a\u021c\5\u008aF\2\u021b\u0213\3\2"+
		"\2\2\u021b\u0214\3\2\2\2\u021b\u0215\3\2\2\2\u021b\u0216\3\2\2\2\u021b"+
		"\u0217\3\2\2\2\u021b\u0218\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2"+
		"\2\2\u021c;\3\2\2\2\u021d\u021e\5\u00e6t\2\u021e\u0223\5> \2\u021f\u0220"+
		"\7M\2\2\u0220\u0222\5> \2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0226\u0227\7L\2\2\u0227=\3\2\2\2\u0228\u022d\5\u009aN\2\u0229\u022a"+
		"\7J\2\2\u022a\u022c\7K\2\2\u022b\u0229\3\2\2\2\u022c\u022f\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u022d\3\2"+
		"\2\2\u0230\u0231\7O\2\2\u0231\u0232\5N(\2\u0232?\3\2\2\2\u0233\u0235\5"+
		"B\"\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\5F"+
		"$\2\u023aA\3\2\2\2\u023b\u0242\5p9\2\u023c\u0242\7%\2\2\u023d\u0242\7"+
		"\3\2\2\u023e\u0242\7\16\2\2\u023f\u0242\7(\2\2\u0240\u0242\7)\2\2\u0241"+
		"\u023b\3\2\2\2\u0241\u023c\3\2\2\2\u0241\u023d\3\2\2\2\u0241\u023e\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0241\u0240\3\2\2\2\u0242C\3\2\2\2\u0243\u0245"+
		"\5B\"\2\u0244\u0243\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024a\5\22"+
		"\n\2\u024a\u024b\5F$\2\u024bE\3\2\2\2\u024c\u024e\5p9\2\u024d\u024c\3"+
		"\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0252\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0253\5.\30\2\u0253\u0254\5\u009a"+
		"N\2\u0254\u0259\5X-\2\u0255\u0256\7J\2\2\u0256\u0258\7K\2\2\u0257\u0255"+
		"\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025e\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d\7/\2\2\u025d\u025f\5V,"+
		"\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261"+
		"\5,\27\2\u0261G\3\2\2\2\u0262\u0267\5J&\2\u0263\u0264\7M\2\2\u0264\u0266"+
		"\5J&\2\u0265\u0263\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268I\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026d\5L\'\2\u026b"+
		"\u026c\7O\2\2\u026c\u026e\5N(\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2"+
		"\2\u026eK\3\2\2\2\u026f\u0274\5\u009aN\2\u0270\u0271\7J\2\2\u0271\u0273"+
		"\7K\2\2\u0272\u0270\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275M\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u027a\5P)\2\u0278"+
		"\u027a\5\u00bc_\2\u0279\u0277\3\2\2\2\u0279\u0278\3\2\2\2\u027aO\3\2\2"+
		"\2\u027b\u0287\7H\2\2\u027c\u0281\5N(\2\u027d\u027e\7M\2\2\u027e\u0280"+
		"\5N(\2\u027f\u027d\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0286\7M"+
		"\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287"+
		"\u027c\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\7I"+
		"\2\2\u028aQ\3\2\2\2\u028b\u028d\5\u009aN\2\u028c\u028e\5\u00eav\2\u028d"+
		"\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0296\3\2\2\2\u028f\u0290\7N"+
		"\2\2\u0290\u0292\5\u009aN\2\u0291\u0293\5\u00eav\2\u0292\u0291\3\2\2\2"+
		"\u0292\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u028f\3\2\2\2\u0295\u0298"+
		"\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297S\3\2\2\2\u0298"+
		"\u0296\3\2\2\2\u0299\u02a6\5\u00e6t\2\u029a\u029c\5p9\2\u029b\u029a\3"+
		"\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u02a0\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a3\7T\2\2\u02a1\u02a2\t\2"+
		"\2\2\u02a2\u02a4\5\u00e6t\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a6\3\2\2\2\u02a5\u0299\3\2\2\2\u02a5\u029d\3\2\2\2\u02a6U\3\2\2\2"+
		"\u02a7\u02ac\5f\64\2\u02a8\u02a9\7M\2\2\u02a9\u02ab\5f\64\2\u02aa\u02a8"+
		"\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"W\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02bb\7F\2\2\u02b0\u02b2\5Z.\2\u02b1"+
		"\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02bc\3\2\2\2\u02b3\u02b6\5Z"+
		".\2\u02b4\u02b5\7M\2\2\u02b5\u02b7\5\\/\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7"+
		"\3\2\2\2\u02b7\u02bc\3\2\2\2\u02b8\u02ba\5\\/\2\u02b9\u02b8\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b1\3\2\2\2\u02bb\u02b3\3\2"+
		"\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\7G\2\2\u02be"+
		"Y\3\2\2\2\u02bf\u02c5\5\u00e6t\2\u02c0\u02c1\5\u009aN\2\u02c1\u02c2\7"+
		"N\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02c0\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5"+
		"\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2"+
		"\2\2\u02c8\u02c9\7-\2\2\u02c9[\3\2\2\2\u02ca\u02cf\5^\60\2\u02cb\u02cc"+
		"\7M\2\2\u02cc\u02ce\5^\60\2\u02cd\u02cb\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d4\3\2\2\2\u02d1\u02cf\3\2"+
		"\2\2\u02d2\u02d3\7M\2\2\u02d3\u02d5\5`\61\2\u02d4\u02d2\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d8\5`\61\2\u02d7\u02ca\3\2"+
		"\2\2\u02d7\u02d6\3\2\2\2\u02d8]\3\2\2\2\u02d9\u02db\5\16\b\2\u02da\u02d9"+
		"\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02df\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e0\5\u00e6t\2\u02e0\u02e1"+
		"\5L\'\2\u02e1_\3\2\2\2\u02e2\u02e4\5\16\b\2\u02e3\u02e2\3\2\2\2\u02e4"+
		"\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2"+
		"\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02ec\5\u00e6t\2\u02e9\u02eb\5p9\2\u02ea"+
		"\u02e9\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f0\7t\2\2\u02f0"+
		"\u02f1\5L\'\2\u02f1a\3\2\2\2\u02f2\u02f7\5d\63\2\u02f3\u02f4\7M\2\2\u02f4"+
		"\u02f6\5d\63\2\u02f5\u02f3\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2"+
		"\2\2\u02f7\u02f8\3\2\2\2\u02f8c\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fc"+
		"\5\16\b\2\u02fb\u02fa\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2"+
		"\u02fd\u02fe\3\2\2\2\u02fe\u0300\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0301"+
		"\7\65\2\2\u0301\u0302\5\u009aN\2\u0302e\3\2\2\2\u0303\u0308\5\u009aN\2"+
		"\u0304\u0305\7N\2\2\u0305\u0307\5\u009aN\2\u0306\u0304\3\2\2\2\u0307\u030a"+
		"\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309g\3\2\2\2\u030a"+
		"\u0308\3\2\2\2\u030b\u0313\5j\66\2\u030c\u0313\5l\67\2\u030d\u0313\7B"+
		"\2\2\u030e\u0313\7C\2\2\u030f\u0313\7A\2\2\u0310\u0313\7E\2\2\u0311\u0313"+
		"\7D\2\2\u0312\u030b\3\2\2\2\u0312\u030c\3\2\2\2\u0312\u030d\3\2\2\2\u0312"+
		"\u030e\3\2\2\2\u0312\u030f\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0311\3\2"+
		"\2\2\u0313i\3\2\2\2\u0314\u0315\t\3\2\2\u0315k\3\2\2\2\u0316\u0317\t\4"+
		"\2\2\u0317m\3\2\2\2\u0318\u0319\5\u009aN\2\u0319\u031a\7N\2\2\u031a\u031c"+
		"\3\2\2\2\u031b\u0318\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0321\7s"+
		"\2\2\u0321\u0322\5\u009aN\2\u0322o\3\2\2\2\u0323\u0324\7s\2\2\u0324\u0327"+
		"\5f\64\2\u0325\u0327\5n8\2\u0326\u0323\3\2\2\2\u0326\u0325\3\2\2\2\u0327"+
		"\u032e\3\2\2\2\u0328\u032b\7F\2\2\u0329\u032c\5r:\2\u032a\u032c\5v<\2"+
		"\u032b\u0329\3\2\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d"+
		"\3\2\2\2\u032d\u032f\7G\2\2\u032e\u0328\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"q\3\2\2\2\u0330\u0335\5t;\2\u0331\u0332\7M\2\2\u0332\u0334\5t;\2\u0333"+
		"\u0331\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2"+
		"\2\2\u0336s\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u0339\5\u009aN\2\u0339\u033a"+
		"\7O\2\2\u033a\u033b\5v<\2\u033bu\3\2\2\2\u033c\u0340\5\u00bc_\2\u033d"+
		"\u0340\5p9\2\u033e\u0340\5x=\2\u033f\u033c\3\2\2\2\u033f\u033d\3\2\2\2"+
		"\u033f\u033e\3\2\2\2\u0340w\3\2\2\2\u0341\u034a\7H\2\2\u0342\u0347\5v"+
		"<\2\u0343\u0344\7M\2\2\u0344\u0346\5v<\2\u0345\u0343\3\2\2\2\u0346\u0349"+
		"\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034b\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u034a\u0342\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d\3\2"+
		"\2\2\u034c\u034e\7M\2\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0350\7I\2\2\u0350y\3\2\2\2\u0351\u0352\7s\2\2\u0352"+
		"\u0353\7\36\2\2\u0353\u0354\5\u009aN\2\u0354\u0355\5|?\2\u0355{\3\2\2"+
		"\2\u0356\u035a\7H\2\2\u0357\u0359\5~@\2\u0358\u0357\3\2\2\2\u0359\u035c"+
		"\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c"+
		"\u035a\3\2\2\2\u035d\u035e\7I\2\2\u035e}\3\2\2\2\u035f\u0361\5\n\6\2\u0360"+
		"\u035f\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2"+
		"\2\2\u0363\u0365\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u0368\5\u0080A\2\u0366"+
		"\u0368\7L\2\2\u0367\u0362\3\2\2\2\u0367\u0366\3\2\2\2\u0368\177\3\2\2"+
		"\2\u0369\u036a\5\u00e6t\2\u036a\u036b\5\u0082B\2\u036b\u036c\7L\2\2\u036c"+
		"\u0382\3\2\2\2\u036d\u036f\5\20\t\2\u036e\u0370\7L\2\2\u036f\u036e\3\2"+
		"\2\2\u036f\u0370\3\2\2\2\u0370\u0382\3\2\2\2\u0371\u0373\5 \21\2\u0372"+
		"\u0374\7L\2\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0382\3\2"+
		"\2\2\u0375\u0377\5\30\r\2\u0376\u0378\7L\2\2\u0377\u0376\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378\u0382\3\2\2\2\u0379\u037b\5z>\2\u037a\u037c\7L\2"+
		"\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u0382\3\2\2\2\u037d\u037f"+
		"\5\u008aF\2\u037e\u0380\7L\2\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2"+
		"\u0380\u0382\3\2\2\2\u0381\u0369\3\2\2\2\u0381\u036d\3\2\2\2\u0381\u0371"+
		"\3\2\2\2\u0381\u0375\3\2\2\2\u0381\u0379\3\2\2\2\u0381\u037d\3\2\2\2\u0382"+
		"\u0081\3\2\2\2\u0383\u0386\5\u0084C\2\u0384\u0386\5\u0086D\2\u0385\u0383"+
		"\3\2\2\2\u0385\u0384\3\2\2\2\u0386\u0083\3\2\2\2\u0387\u0388\5\u009aN"+
		"\2\u0388\u0389\7F\2\2\u0389\u038b\7G\2\2\u038a\u038c\5\u0088E\2\u038b"+
		"\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u0085\3\2\2\2\u038d\u038e\5H"+
		"%\2\u038e\u0087\3\2\2\2\u038f\u0390\7\16\2\2\u0390\u0391\5v<\2\u0391\u0089"+
		"\3\2\2\2\u0392\u0393\7\67\2\2\u0393\u0395\5\u009aN\2\u0394\u0396\5\22"+
		"\n\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397"+
		"\u039a\5\u008cG\2\u0398\u0399\7\32\2\2\u0399\u039b\5\u00e4s\2\u039a\u0398"+
		"\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\5\u0092J"+
		"\2\u039d\u008b\3\2\2\2\u039e\u03a0\7F\2\2\u039f\u03a1\5\u008eH\2\u03a0"+
		"\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\7G"+
		"\2\2\u03a3\u008d\3\2\2\2\u03a4\u03a9\5\u0090I\2\u03a5\u03a6\7M\2\2\u03a6"+
		"\u03a8\5\u0090I\2\u03a7\u03a5\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7"+
		"\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u008f\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac"+
		"\u03ad\5\u00e6t\2\u03ad\u03ae\5\u009aN\2\u03ae\u0091\3\2\2\2\u03af\u03b3"+
		"\7H\2\2\u03b0\u03b2\5&\24\2\u03b1\u03b0\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3"+
		"\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03b3\3\2"+
		"\2\2\u03b6\u03b7\7I\2\2\u03b7\u0093\3\2\2\2\u03b8\u03bc\7H\2\2\u03b9\u03bb"+
		"\5\u0096L\2\u03ba\u03b9\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2\2"+
		"\2\u03bc\u03bd\3\2\2\2\u03bd\u03bf\3\2\2\2\u03be\u03bc\3\2\2\2\u03bf\u03c0"+
		"\7I\2\2\u03c0\u0095\3\2\2\2\u03c1\u03c2\5\u0098M\2\u03c2\u03c3\7L\2\2"+
		"\u03c3\u03c7\3\2\2\2\u03c4\u03c7\5\u009eP\2\u03c5\u03c7\5\u009cO\2\u03c6"+
		"\u03c1\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c5\3\2\2\2\u03c7\u0097\3\2"+
		"\2\2\u03c8\u03ca\5\16\b\2\u03c9\u03c8\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb"+
		"\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03d6\3\2\2\2\u03cd\u03cb\3\2"+
		"\2\2\u03ce\u03cf\5\u00e6t\2\u03cf\u03d0\5H%\2\u03d0\u03d7\3\2\2\2\u03d1"+
		"\u03d2\7\65\2\2\u03d2\u03d3\5\u009aN\2\u03d3\u03d4\7O\2\2\u03d4\u03d5"+
		"\5\u00bc_\2\u03d5\u03d7\3\2\2\2\u03d6\u03ce\3\2\2\2\u03d6\u03d1\3\2\2"+
		"\2\u03d7\u0099\3\2\2\2\u03d8\u03d9\t\5\2\2\u03d9\u009b\3\2\2\2\u03da\u03dc"+
		"\5\f\7\2\u03db\u03da\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd"+
		"\u03de\3\2\2\2\u03de\u03e3\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e4\5\20"+
		"\t\2\u03e1\u03e4\5 \21\2\u03e2\u03e4\5\u008aF\2\u03e3\u03e0\3\2\2\2\u03e3"+
		"\u03e1\3\2\2\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e7\7L"+
		"\2\2\u03e6\u03dd\3\2\2\2\u03e6\u03e5\3\2\2\2\u03e7\u009d\3\2\2\2\u03e8"+
		"\u045a\5\u0094K\2\u03e9\u03ea\7\4\2\2\u03ea\u03ed\5\u00bc_\2\u03eb\u03ec"+
		"\7U\2\2\u03ec\u03ee\5\u00bc_\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2"+
		"\u03ee\u03ef\3\2\2\2\u03ef\u03f0\7L\2\2\u03f0\u045a\3\2\2\2\u03f1\u03f2"+
		"\7\30\2\2\u03f2\u03f3\5\u00b6\\\2\u03f3\u03f6\5\u009eP\2\u03f4\u03f5\7"+
		"\21\2\2\u03f5\u03f7\5\u009eP\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2"+
		"\u03f7\u045a\3\2\2\2\u03f8\u03f9\7\27\2\2\u03f9\u03fa\7F\2\2\u03fa\u03fb"+
		"\5\u00b0Y\2\u03fb\u03fc\7G\2\2\u03fc\u03fd\5\u009eP\2\u03fd\u045a\3\2"+
		"\2\2\u03fe\u03ff\7\64\2\2\u03ff\u0400\5\u00b6\\\2\u0400\u0401\5\u009e"+
		"P\2\u0401\u045a\3\2\2\2\u0402\u0403\7\17\2\2\u0403\u0404\5\u009eP\2\u0404"+
		"\u0405\7\64\2\2\u0405\u0406\5\u00b6\\\2\u0406\u0407\7L\2\2\u0407\u045a"+
		"\3\2\2\2\u0408\u0409\7\61\2\2\u0409\u0413\5\u0094K\2\u040a\u040c\5\u00a0"+
		"Q\2\u040b\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040b\3\2\2\2\u040d"+
		"\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u0411\5\u00a4S\2\u0410\u040f"+
		"\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0414\5\u00a4S"+
		"\2\u0413\u040b\3\2\2\2\u0413\u0412\3\2\2\2\u0414\u045a\3\2\2\2\u0415\u0416"+
		"\7\61\2\2\u0416\u0417\5\u00a6T\2\u0417\u041b\5\u0094K\2\u0418\u041a\5"+
		"\u00a0Q\2\u0419\u0418\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2"+
		"\u041b\u041c\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u0420"+
		"\5\u00a4S\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u045a\3\2\2"+
		"\2\u0421\u0422\7+\2\2\u0422\u0423\5\u00b6\\\2\u0423\u0427\7H\2\2\u0424"+
		"\u0426\5\u00acW\2\u0425\u0424\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425"+
		"\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u042d\3\2\2\2\u0429\u0427\3\2\2\2\u042a"+
		"\u042c\5\u00aeX\2\u042b\u042a\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b"+
		"\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u0430\3\2\2\2\u042f\u042d\3\2\2\2\u0430"+
		"\u0431\7I\2\2\u0431\u045a\3\2\2\2\u0432\u0433\7,\2\2\u0433\u0434\5\u00b6"+
		"\\\2\u0434\u0435\5\u0094K\2\u0435\u045a\3\2\2\2\u0436\u0438\7&\2\2\u0437"+
		"\u0439\5\u00bc_\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a"+
		"\3\2\2\2\u043a\u045a\7L\2\2\u043b\u043c\7.\2\2\u043c\u043d\5\u00bc_\2"+
		"\u043d\u043e\7L\2\2\u043e\u045a\3\2\2\2\u043f\u0441\7\6\2\2\u0440\u0442"+
		"\5\u009aN\2\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2"+
		"\2\u0443\u045a\7L\2\2\u0444\u0446\7\r\2\2\u0445\u0447\5\u009aN\2\u0446"+
		"\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u045a\7L"+
		"\2\2\u0449\u044a\7\66\2\2\u044a\u044b\5\u00bc_\2\u044b\u044c\7L\2\2\u044c"+
		"\u045a\3\2\2\2\u044d\u045a\7L\2\2\u044e\u044f\5\u00bc_\2\u044f\u0450\7"+
		"L\2\2\u0450\u045a\3\2\2\2\u0451\u0453\5\u00c8e\2\u0452\u0454\7L\2\2\u0453"+
		"\u0452\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u045a\3\2\2\2\u0455\u0456\5\u009a"+
		"N\2\u0456\u0457\7U\2\2\u0457\u0458\5\u009eP\2\u0458\u045a\3\2\2\2\u0459"+
		"\u03e8\3\2\2\2\u0459\u03e9\3\2\2\2\u0459\u03f1\3\2\2\2\u0459\u03f8\3\2"+
		"\2\2\u0459\u03fe\3\2\2\2\u0459\u0402\3\2\2\2\u0459\u0408\3\2\2\2\u0459"+
		"\u0415\3\2\2\2\u0459\u0421\3\2\2\2\u0459\u0432\3\2\2\2\u0459\u0436\3\2"+
		"\2\2\u0459\u043b\3\2\2\2\u0459\u043f\3\2\2\2\u0459\u0444\3\2\2\2\u0459"+
		"\u0449\3\2\2\2\u0459\u044d\3\2\2\2\u0459\u044e\3\2\2\2\u0459\u0451\3\2"+
		"\2\2\u0459\u0455\3\2\2\2\u045a\u009f\3\2\2\2\u045b\u045c\7\t\2\2\u045c"+
		"\u0460\7F\2\2\u045d\u045f\5\16\b\2\u045e\u045d\3\2\2\2\u045f\u0462\3\2"+
		"\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0463\3\2\2\2\u0462"+
		"\u0460\3\2\2\2\u0463\u0464\5\u00a2R\2\u0464\u0465\5\u009aN\2\u0465\u0466"+
		"\7G\2\2\u0466\u0467\5\u0094K\2\u0467\u00a1\3\2\2\2\u0468\u046d\5f\64\2"+
		"\u0469\u046a\7c\2\2\u046a\u046c\5f\64\2\u046b\u0469\3\2\2\2\u046c\u046f"+
		"\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u00a3\3\2\2\2\u046f"+
		"\u046d\3\2\2\2\u0470\u0471\7\25\2\2\u0471\u0472\5\u0094K\2\u0472\u00a5"+
		"\3\2\2\2\u0473\u0474\7F\2\2\u0474\u0476\5\u00a8U\2\u0475\u0477\7L\2\2"+
		"\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479"+
		"\7G\2\2\u0479\u00a7\3\2\2\2\u047a\u047f\5\u00aaV\2\u047b\u047c\7L\2\2"+
		"\u047c\u047e\5\u00aaV\2\u047d\u047b\3\2\2\2\u047e\u0481\3\2\2\2\u047f"+
		"\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u00a9\3\2\2\2\u0481\u047f\3\2"+
		"\2\2\u0482\u0484\5\16\b\2\u0483\u0482\3\2\2\2\u0484\u0487\3\2\2\2\u0485"+
		"\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u048d\3\2\2\2\u0487\u0485\3\2"+
		"\2\2\u0488\u0489\5R*\2\u0489\u048a\5L\'\2\u048a\u048e\3\2\2\2\u048b\u048c"+
		"\7\65\2\2\u048c\u048e\5\u009aN\2\u048d\u0488\3\2\2\2\u048d\u048b\3\2\2"+
		"\2\u048e\u048f\3\2\2\2\u048f\u0490\7O\2\2\u0490\u0491\5\u00bc_\2\u0491"+
		"\u0494\3\2\2\2\u0492\u0494\5\u009aN\2\u0493\u0485\3\2\2\2\u0493\u0492"+
		"\3\2\2\2\u0494\u00ab\3\2\2\2\u0495\u0497\5\u00aeX\2\u0496\u0495\3\2\2"+
		"\2\u0497\u0498\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049b"+
		"\3\2\2\2\u049a\u049c\5\u0096L\2\u049b\u049a\3\2\2\2\u049c\u049d\3\2\2"+
		"\2\u049d\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u00ad\3\2\2\2\u049f\u04a5"+
		"\7\b\2\2\u04a0\u04a6\5\u00bc_\2\u04a1\u04a6\7x\2\2\u04a2\u04a3\5\u00e6"+
		"t\2\u04a3\u04a4\5\u009aN\2\u04a4\u04a6\3\2\2\2\u04a5\u04a0\3\2\2\2\u04a5"+
		"\u04a1\3\2\2\2\u04a5\u04a2\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04ab\7U"+
		"\2\2\u04a8\u04a9\7\16\2\2\u04a9\u04ab\7U\2\2\u04aa\u049f\3\2\2\2\u04aa"+
		"\u04a8\3\2\2\2\u04ab\u00af\3\2\2\2\u04ac\u04b9\5\u00b4[\2\u04ad\u04af"+
		"\5\u00b2Z\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2"+
		"\2\u04b0\u04b2\7L\2\2\u04b1\u04b3\5\u00bc_\2\u04b2\u04b1\3\2\2\2\u04b2"+
		"\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b6\7L\2\2\u04b5\u04b7\5\u00b8"+
		"]\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b9\3\2\2\2\u04b8"+
		"\u04ac\3\2\2\2\u04b8\u04ae\3\2\2\2\u04b9\u00b1\3\2\2\2\u04ba\u04bd\5\u0098"+
		"M\2\u04bb\u04bd\5\u00b8]\2\u04bc\u04ba\3\2\2\2\u04bc\u04bb\3\2\2\2\u04bd"+
		"\u00b3\3\2\2\2\u04be\u04c0\5\16\b\2\u04bf\u04be\3\2\2\2\u04c0\u04c3\3"+
		"\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c6\3\2\2\2\u04c3"+
		"\u04c1\3\2\2\2\u04c4\u04c7\5\u00e6t\2\u04c5\u04c7\7\65\2\2\u04c6\u04c4"+
		"\3\2\2\2\u04c6\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\5L\'\2\u04c9"+
		"\u04ca\7U\2\2\u04ca\u04cb\5\u00bc_\2\u04cb\u00b5\3\2\2\2\u04cc\u04cd\7"+
		"F\2\2\u04cd\u04ce\5\u00bc_\2\u04ce\u04cf\7G\2\2\u04cf\u00b7\3\2\2\2\u04d0"+
		"\u04d5\5\u00bc_\2\u04d1\u04d2\7M\2\2\u04d2\u04d4\5\u00bc_\2\u04d3\u04d1"+
		"\3\2\2\2\u04d4\u04d7\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6"+
		"\u00b9\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d8\u04da\5\u009aN\2\u04d9\u04db"+
		"\7R\2\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"+
		"\u04de\7F\2\2\u04dd\u04df\5\u00b8]\2\u04de\u04dd\3\2\2\2\u04de\u04df\3"+
		"\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\7G\2\2\u04e1\u04ef\3\2\2\2\u04e2"+
		"\u04e3\7-\2\2\u04e3\u04e5\7F\2\2\u04e4\u04e6\5\u00b8]\2\u04e5\u04e4\3"+
		"\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04ef\7G\2\2\u04e8"+
		"\u04e9\7*\2\2\u04e9\u04eb\7F\2\2\u04ea\u04ec\5\u00b8]\2\u04eb\u04ea\3"+
		"\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ef\7G\2\2\u04ee"+
		"\u04d8\3\2\2\2\u04ee\u04e2\3\2\2\2\u04ee\u04e8\3\2\2\2\u04ef\u00bb\3\2"+
		"\2\2\u04f0\u04f1\b_\1\2\u04f1\u051e\5\u00c6d\2\u04f2\u051e\5\u00ba^\2"+
		"\u04f3\u04f4\7!\2\2\u04f4\u051e\5\u00d2j\2\u04f5\u04f9\7F\2\2\u04f6\u04f8"+
		"\5p9\2\u04f7\u04f6\3\2\2\2\u04f8\u04fb\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9"+
		"\u04fa\3\2\2\2\u04fa\u04fc\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fc\u0501\5\u00e6"+
		"t\2\u04fd\u04fe\7b\2\2\u04fe\u0500\5\u00e6t\2\u04ff\u04fd\3\2\2\2\u0500"+
		"\u0503\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\3\2"+
		"\2\2\u0503\u0501\3\2\2\2\u0504\u0505\7G\2\2\u0505\u0506\5\u00bc_\30\u0506"+
		"\u051e\3\2\2\2\u0507\u0508\t\6\2\2\u0508\u051e\5\u00bc_\26\u0509\u050a"+
		"\t\7\2\2\u050a\u051e\5\u00bc_\25\u050b\u051e\5\u00c0a\2\u050c\u051e\5"+
		"\u00c8e\2\u050d\u050e\5\u00e6t\2\u050e\u0514\7r\2\2\u050f\u0511\5\u00ea"+
		"v\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"\u0515\5\u009aN\2\u0513\u0515\7!\2\2\u0514\u0510\3\2\2\2\u0514\u0513\3"+
		"\2\2\2\u0515\u051e\3\2\2\2\u0516\u0517\5\u00d0i\2\u0517\u0519\7r\2\2\u0518"+
		"\u051a\5\u00eav\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b"+
		"\3\2\2\2\u051b\u051c\7!\2\2\u051c\u051e\3\2\2\2\u051d\u04f0\3\2\2\2\u051d"+
		"\u04f2\3\2\2\2\u051d\u04f3\3\2\2\2\u051d\u04f5\3\2\2\2\u051d\u0507\3\2"+
		"\2\2\u051d\u0509\3\2\2\2\u051d\u050b\3\2\2\2\u051d\u050c\3\2\2\2\u051d"+
		"\u050d\3\2\2\2\u051d\u0516\3\2\2\2\u051e\u0572\3\2\2\2\u051f\u0520\f\24"+
		"\2\2\u0520\u0521\t\b\2\2\u0521\u0571\5\u00bc_\25\u0522\u0523\f\23\2\2"+
		"\u0523\u0524\t\t\2\2\u0524\u0571\5\u00bc_\24\u0525\u052d\f\22\2\2\u0526"+
		"\u0527\7Q\2\2\u0527\u052e\7Q\2\2\u0528\u0529\7P\2\2\u0529\u052a\7P\2\2"+
		"\u052a\u052e\7P\2\2\u052b\u052c\7P\2\2\u052c\u052e\7P\2\2\u052d\u0526"+
		"\3\2\2\2\u052d\u0528\3\2\2\2\u052d\u052b\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0571\5\u00bc_\23\u0530\u0531\f\21\2\2\u0531\u0532\t\n\2\2\u0532\u0571"+
		"\5\u00bc_\22\u0533\u0534\f\17\2\2\u0534\u0535\t\13\2\2\u0535\u0571\5\u00bc"+
		"_\20\u0536\u0537\f\16\2\2\u0537\u0538\7b\2\2\u0538\u0571\5\u00bc_\17\u0539"+
		"\u053a\f\r\2\2\u053a\u053b\7d\2\2\u053b\u0571\5\u00bc_\16\u053c\u053d"+
		"\f\f\2\2\u053d\u053e\7c\2\2\u053e\u0571\5\u00bc_\r\u053f\u0540\f\13\2"+
		"\2\u0540\u0541\7Z\2\2\u0541\u0571\5\u00bc_\f\u0542\u0543\f\n\2\2\u0543"+
		"\u0544\7[\2\2\u0544\u0571\5\u00bc_\13\u0545\u0546\f\t\2\2\u0546\u0547"+
		"\7T\2\2\u0547\u0548\5\u00bc_\2\u0548\u0549\7U\2\2\u0549\u054a\5\u00bc"+
		"_\t\u054a\u0571\3\2\2\2\u054b\u054c\f\b\2\2\u054c\u054d\t\f\2\2\u054d"+
		"\u0571\5\u00bc_\b\u054e\u054f\f\34\2\2\u054f\u055b\7N\2\2\u0550\u055c"+
		"\5\u009aN\2\u0551\u055c\5\u00ba^\2\u0552\u055c\7-\2\2\u0553\u0555\7!\2"+
		"\2\u0554\u0556\5\u00e2r\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u0557\3\2\2\2\u0557\u055c\5\u00d6l\2\u0558\u0559\7*\2\2\u0559\u055c\5"+
		"\u00ecw\2\u055a\u055c\5\u00dco\2\u055b\u0550\3\2\2\2\u055b\u0551\3\2\2"+
		"\2\u055b\u0552\3\2\2\2\u055b\u0553\3\2\2\2\u055b\u0558\3\2\2\2\u055b\u055a"+
		"\3\2\2\2\u055c\u0571\3\2\2\2\u055d\u055e\f\33\2\2\u055e\u055f\7J\2\2\u055f"+
		"\u0560\5\u00bc_\2\u0560\u0561\7K\2\2\u0561\u0571\3\2\2\2\u0562\u0563\f"+
		"\27\2\2\u0563\u0571\t\r\2\2\u0564\u0565\f\20\2\2\u0565\u0568\7\34\2\2"+
		"\u0566\u0569\5\u00e6t\2\u0567\u0569\5\u00be`\2\u0568\u0566\3\2\2\2\u0568"+
		"\u0567\3\2\2\2\u0569\u0571\3\2\2\2\u056a\u056b\f\5\2\2\u056b\u056d\7r"+
		"\2\2\u056c\u056e\5\u00eav\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e"+
		"\u056f\3\2\2\2\u056f\u0571\5\u009aN\2\u0570\u051f\3\2\2\2\u0570\u0522"+
		"\3\2\2\2\u0570\u0525\3\2\2\2\u0570\u0530\3\2\2\2\u0570\u0533\3\2\2\2\u0570"+
		"\u0536\3\2\2\2\u0570\u0539\3\2\2\2\u0570\u053c\3\2\2\2\u0570\u053f\3\2"+
		"\2\2\u0570\u0542\3\2\2\2\u0570\u0545\3\2\2\2\u0570\u054b\3\2\2\2\u0570"+
		"\u054e\3\2\2\2\u0570\u055d\3\2\2\2\u0570\u0562\3\2\2\2\u0570\u0564\3\2"+
		"\2\2\u0570\u056a\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570\3\2\2\2\u0572"+
		"\u0573\3\2\2\2\u0573\u00bd\3\2\2\2\u0574\u0572\3\2\2\2\u0575\u0577\5\16"+
		"\b\2\u0576\u0575\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578"+
		"\u0579\3\2\2\2\u0579\u057b\3\2\2\2\u057a\u0578\3\2\2\2\u057b\u057f\5\u00e6"+
		"t\2\u057c\u057e\5p9\2\u057d\u057c\3\2\2\2\u057e\u0581\3\2\2\2\u057f\u057d"+
		"\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2\2\u0581\u057f\3\2\2\2\u0582"+
		"\u0583\5\u009aN\2\u0583\u00bf\3\2\2\2\u0584\u0585\5\u00c2b\2\u0585\u0586"+
		"\7q\2\2\u0586\u0587\5\u00c4c\2\u0587\u00c1\3\2\2\2\u0588\u059f\5\u009a"+
		"N\2\u0589\u058b\7F\2\2\u058a\u058c\5\\/\2\u058b\u058a\3\2\2\2\u058b\u058c"+
		"\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u059f\7G\2\2\u058e\u058f\7F\2\2\u058f"+
		"\u0594\5\u009aN\2\u0590\u0591\7M\2\2\u0591\u0593\5\u009aN\2\u0592\u0590"+
		"\3\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
		"\u0597\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0598\7G\2\2\u0598\u059f\3\2"+
		"\2\2\u0599\u059b\7F\2\2\u059a\u059c\5b\62\2\u059b\u059a\3\2\2\2\u059b"+
		"\u059c\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f\7G\2\2\u059e\u0588\3\2"+
		"\2\2\u059e\u0589\3\2\2\2\u059e\u058e\3\2\2\2\u059e\u0599\3\2\2\2\u059f"+
		"\u00c3\3\2\2\2\u05a0\u05a3\5\u00bc_\2\u05a1\u05a3\5\u0094K\2\u05a2\u05a0"+
		"\3\2\2\2\u05a2\u05a1\3\2\2\2\u05a3\u00c5\3\2\2\2\u05a4\u05a5\7F\2\2\u05a5"+
		"\u05a6\5\u00bc_\2\u05a6\u05a7\7G\2\2\u05a7\u05b7\3\2\2\2\u05a8\u05b7\7"+
		"-\2\2\u05a9\u05b7\7*\2\2\u05aa\u05b7\5h\65\2\u05ab\u05b7\5\u009aN\2\u05ac"+
		"\u05ad\5.\30\2\u05ad\u05ae\7N\2\2\u05ae\u05af\7\13\2\2\u05af\u05b7\3\2"+
		"\2\2\u05b0\u05b4\5\u00e2r\2\u05b1\u05b5\5\u00eex\2\u05b2\u05b3\7-\2\2"+
		"\u05b3\u05b5\5\u00f0y\2\u05b4\u05b1\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5"+
		"\u05b7\3\2\2\2\u05b6\u05a4\3\2\2\2\u05b6\u05a8\3\2\2\2\u05b6\u05a9\3\2"+
		"\2\2\u05b6\u05aa\3\2\2\2\u05b6\u05ab\3\2\2\2\u05b6\u05ac\3\2\2\2\u05b6"+
		"\u05b0\3\2\2\2\u05b7\u00c7\3\2\2\2\u05b8\u05b9\7+\2\2\u05b9\u05ba\5\u00b6"+
		"\\\2\u05ba\u05be\7H\2\2\u05bb\u05bd\5\u00caf\2\u05bc\u05bb\3\2\2\2\u05bd"+
		"\u05c0\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1\3\2"+
		"\2\2\u05c0\u05be\3\2\2\2\u05c1\u05c2\7I\2\2\u05c2\u00c9\3\2\2\2\u05c3"+
		"\u05c7\7\b\2\2\u05c4\u05c8\5\u00b8]\2\u05c5\u05c8\7E\2\2\u05c6\u05c8\5"+
		"\u00ccg\2\u05c7\u05c4\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c7\u05c6\3\2\2\2"+
		"\u05c8\u05c9\3\2\2\2\u05c9\u05ca\t\16\2\2\u05ca\u05cf\5\u00ceh\2\u05cb"+
		"\u05cc\7\16\2\2\u05cc\u05cd\t\16\2\2\u05cd\u05cf\5\u00ceh\2\u05ce\u05c3"+
		"\3\2\2\2\u05ce\u05cb\3\2\2\2\u05cf\u00cb\3\2\2\2\u05d0\u05d1\bg\1\2\u05d1"+
		"\u05d2\7F\2\2\u05d2\u05d3\5\u00ccg\2\u05d3\u05d4\7G\2\2\u05d4\u05eb\3"+
		"\2\2\2\u05d5\u05d7\5\16\b\2\u05d6\u05d5\3\2\2\2\u05d7\u05da\3\2\2\2\u05d8"+
		"\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05db\3\2\2\2\u05da\u05d8\3\2"+
		"\2\2\u05db\u05df\5\u00e6t\2\u05dc\u05de\5p9\2\u05dd\u05dc\3\2\2\2\u05de"+
		"\u05e1\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e2\3\2"+
		"\2\2\u05e1\u05df\3\2\2\2\u05e2\u05e7\5\u009aN\2\u05e3\u05e4\7Z\2\2\u05e4"+
		"\u05e6\5\u00bc_\2\u05e5\u05e3\3\2\2\2\u05e6\u05e9\3\2\2\2\u05e7\u05e5"+
		"\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05eb\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea"+
		"\u05d0\3\2\2\2\u05ea\u05d8\3\2\2\2\u05eb\u05f1\3\2\2\2\u05ec\u05ed\f\3"+
		"\2\2\u05ed\u05ee\7Z\2\2\u05ee\u05f0\5\u00bc_\2\u05ef\u05ec\3\2\2\2\u05f0"+
		"\u05f3\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u00cd\3\2"+
		"\2\2\u05f3\u05f1\3\2\2\2\u05f4\u05fc\5\u0094K\2\u05f5\u05f7\5\u0096L\2"+
		"\u05f6\u05f5\3\2\2\2\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9"+
		"\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05f4\3\2\2\2\u05fb"+
		"\u05f8\3\2\2\2\u05fc\u00cf\3\2\2\2\u05fd\u05fe\5R*\2\u05fe\u05ff\7N\2"+
		"\2\u05ff\u0601\3\2\2\2\u0600\u05fd\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0605"+
		"\3\2\2\2\u0602\u0604\5p9\2\u0603\u0602\3\2\2\2\u0604\u0607\3\2\2\2\u0605"+
		"\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607\u0605\3\2"+
		"\2\2\u0608\u060a\5\u009aN\2\u0609\u060b\5\u00eav\2\u060a\u0609\3\2\2\2"+
		"\u060a\u060b\3\2\2\2\u060b\u00d1\3\2\2\2\u060c\u060d\5\u00e2r\2\u060d"+
		"\u060e\5\u00d4k\2\u060e\u060f\5\u00dan\2\u060f\u0616\3\2\2\2\u0610\u0613"+
		"\5\u00d4k\2\u0611\u0614\5\u00d8m\2\u0612\u0614\5\u00dan\2\u0613\u0611"+
		"\3\2\2\2\u0613\u0612\3\2\2\2\u0614\u0616\3\2\2\2\u0615\u060c\3\2\2\2\u0615"+
		"\u0610\3\2\2\2\u0616\u00d3\3\2\2\2\u0617\u0619\5\u009aN\2\u0618\u061a"+
		"\5\u00dep\2\u0619\u0618\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u0622\3\2\2"+
		"\2\u061b\u061c\7N\2\2\u061c\u061e\5\u009aN\2\u061d\u061f\5\u00dep\2\u061e"+
		"\u061d\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0621\3\2\2\2\u0620\u061b\3\2"+
		"\2\2\u0621\u0624\3\2\2\2\u0622\u0620\3\2\2\2\u0622\u0623\3\2\2\2\u0623"+
		"\u0627\3\2\2\2\u0624\u0622\3\2\2\2\u0625\u0627\5\u00e8u\2\u0626\u0617"+
		"\3\2\2\2\u0626\u0625\3\2\2\2\u0627\u00d5\3\2\2\2\u0628\u062a\5\u009aN"+
		"\2\u0629\u062b\5\u00e0q\2\u062a\u0629\3\2\2\2\u062a\u062b\3\2\2\2\u062b"+
		"\u062c\3\2\2\2\u062c\u062d\5\u00dan\2\u062d\u00d7\3\2\2\2\u062e\u064a"+
		"\7J\2\2\u062f\u0634\7K\2\2\u0630\u0631\7J\2\2\u0631\u0633\7K\2\2\u0632"+
		"\u0630\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0632\3\2\2\2\u0634\u0635\3\2"+
		"\2\2\u0635\u0637\3\2\2\2\u0636\u0634\3\2\2\2\u0637\u064b\5P)\2\u0638\u0639"+
		"\5\u00bc_\2\u0639\u0640\7K\2\2\u063a\u063b\7J\2\2\u063b\u063c\5\u00bc"+
		"_\2\u063c\u063d\7K\2\2\u063d\u063f\3\2\2\2\u063e\u063a\3\2\2\2\u063f\u0642"+
		"\3\2\2\2\u0640\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0647\3\2\2\2\u0642"+
		"\u0640\3\2\2\2\u0643\u0644\7J\2\2\u0644\u0646\7K\2\2\u0645\u0643\3\2\2"+
		"\2\u0646\u0649\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u064b"+
		"\3\2\2\2\u0649\u0647\3\2\2\2\u064a\u062f\3\2\2\2\u064a\u0638\3\2\2\2\u064b"+
		"\u00d9\3\2\2\2\u064c\u064e\5\u00f0y\2\u064d\u064f\5\"\22\2\u064e\u064d"+
		"\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u00db\3\2\2\2\u0650\u0651\5\u00e2r"+
		"\2\u0651\u0652\5\u00eex\2\u0652\u00dd\3\2\2\2\u0653\u0654\7Q\2\2\u0654"+
		"\u0657\7P\2\2\u0655\u0657\5\u00eav\2\u0656\u0653\3\2\2\2\u0656\u0655\3"+
		"\2\2\2\u0657\u00df\3\2\2\2\u0658\u0659\7Q\2\2\u0659\u065c\7P\2\2\u065a"+
		"\u065c\5\u00e2r\2\u065b\u0658\3\2\2\2\u065b\u065a\3\2\2\2\u065c\u00e1"+
		"\3\2\2\2\u065d\u065e\7Q\2\2\u065e\u065f\5\u00e4s\2\u065f\u0660\7P\2\2"+
		"\u0660\u00e3\3\2\2\2\u0661\u0666\5\u00e6t\2\u0662\u0663\7M\2\2\u0663\u0665"+
		"\5\u00e6t\2\u0664\u0662\3\2\2\2\u0665\u0668\3\2\2\2\u0666\u0664\3\2\2"+
		"\2\u0666\u0667\3\2\2\2\u0667\u00e5\3\2\2\2\u0668\u0666\3\2\2\2\u0669\u066b"+
		"\7b\2\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066f\3\2\2\2\u066c"+
		"\u066e\5p9\2\u066d\u066c\3\2\2\2\u066e\u0671\3\2\2\2\u066f\u066d\3\2\2"+
		"\2\u066f\u0670\3\2\2\2\u0670\u0674\3\2\2\2\u0671\u066f\3\2\2\2\u0672\u0675"+
		"\5R*\2\u0673\u0675\5\u00e8u\2\u0674\u0672\3\2\2\2\u0674\u0673\3\2\2\2"+
		"\u0675\u0680\3\2\2\2\u0676\u0678\5p9\2\u0677\u0676\3\2\2\2\u0678\u067b"+
		"\3\2\2\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067c\3\2\2\2\u067b"+
		"\u0679\3\2\2\2\u067c\u067d\7J\2\2\u067d\u067f\7K\2\2\u067e\u0679\3\2\2"+
		"\2\u067f\u0682\3\2\2\2\u0680\u067e\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u00e7"+
		"\3\2\2\2\u0682\u0680\3\2\2\2\u0683\u0684\t\17\2\2\u0684\u00e9\3\2\2\2"+
		"\u0685\u0686\7Q\2\2\u0686\u068b\5T+\2\u0687\u0688\7M\2\2\u0688\u068a\5"+
		"T+\2\u0689\u0687\3\2\2\2\u068a\u068d\3\2\2\2\u068b\u0689\3\2\2\2\u068b"+
		"\u068c\3\2\2\2\u068c\u068e\3\2\2\2\u068d\u068b\3\2\2\2\u068e\u068f\7P"+
		"\2\2\u068f\u00eb\3\2\2\2\u0690\u069a\5\u00f0y\2\u0691\u0693\7N\2\2\u0692"+
		"\u0694\5\u00eav\2\u0693\u0692\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695"+
		"\3\2\2\2\u0695\u0697\5\u009aN\2\u0696\u0698\5\u00f0y\2\u0697\u0696\3\2"+
		"\2\2\u0697\u0698\3\2\2\2\u0698\u069a\3\2\2\2\u0699\u0690\3\2\2\2\u0699"+
		"\u0691\3\2\2\2\u069a\u00ed\3\2\2\2\u069b\u069c\7*\2\2\u069c\u06a1\5\u00ec"+
		"w\2\u069d\u069e\5\u009aN\2\u069e\u069f\5\u00f0y\2\u069f\u06a1\3\2\2\2"+
		"\u06a0\u069b\3\2\2\2\u06a0\u069d\3\2\2\2\u06a1\u00ef\3\2\2\2\u06a2\u06a4"+
		"\7F\2\2\u06a3\u06a5\5\u00b8]\2\u06a4\u06a3\3\2\2\2\u06a4\u06a5\3\2\2\2"+
		"\u06a5\u06a6\3\2\2\2\u06a6\u06a7\7G\2\2\u06a7\u00f1\3\2\2\2\u00d9\u00f3"+
		"\u00f8\u00fe\u0104\u010a\u0113\u0118\u011f\u0127\u012a\u0131\u013d\u0141"+
		"\u0146\u014a\u014e\u0152\u015c\u0164\u016c\u0170\u0177\u017e\u0182\u0185"+
		"\u0188\u0191\u0197\u019c\u019f\u01a5\u01ab\u01af\u01b7\u01c0\u01c7\u01cd"+
		"\u01d1\u01dd\u01e6\u01eb\u01f1\u01f5\u0201\u020c\u0211\u021b\u0223\u022d"+
		"\u0236\u0241\u0246\u024f\u0259\u025e\u0267\u026d\u0274\u0279\u0281\u0285"+
		"\u0287\u028d\u0292\u0296\u029d\u02a3\u02a5\u02ac\u02b1\u02b6\u02b9\u02bb"+
		"\u02c5\u02cf\u02d4\u02d7\u02dc\u02e5\u02ec\u02f7\u02fd\u0308\u0312\u031d"+
		"\u0326\u032b\u032e\u0335\u033f\u0347\u034a\u034d\u035a\u0362\u0367\u036f"+
		"\u0373\u0377\u037b\u037f\u0381\u0385\u038b\u0395\u039a\u03a0\u03a9\u03b3"+
		"\u03bc\u03c6\u03cb\u03d6\u03dd\u03e3\u03e6\u03ed\u03f6\u040d\u0410\u0413"+
		"\u041b\u041f\u0427\u042d\u0438\u0441\u0446\u0453\u0459\u0460\u046d\u0476"+
		"\u047f\u0485\u048d\u0493\u0498\u049d\u04a5\u04aa\u04ae\u04b2\u04b6\u04b8"+
		"\u04bc\u04c1\u04c6\u04d5\u04da\u04de\u04e5\u04eb\u04ee\u04f9\u0501\u0510"+
		"\u0514\u0519\u051d\u052d\u0555\u055b\u0568\u056d\u0570\u0572\u0578\u057f"+
		"\u058b\u0594\u059b\u059e\u05a2\u05b4\u05b6\u05be\u05c7\u05ce\u05d8\u05df"+
		"\u05e7\u05ea\u05f1\u05f8\u05fb\u0600\u0605\u060a\u0613\u0615\u0619\u061e"+
		"\u0622\u0626\u062a\u0634\u0640\u0647\u064a\u064e\u0656\u065b\u0666\u066a"+
		"\u066f\u0674\u0679\u0680\u068b\u0693\u0697\u0699\u06a0\u06a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from RuvaParser.g4 by ANTLR 4.9.3

 package me.hydos.ruva.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuvaParser}.
 */
public interface RuvaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuvaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(RuvaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(RuvaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(RuvaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(RuvaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(RuvaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(RuvaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(RuvaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(RuvaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(RuvaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(RuvaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(RuvaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(RuvaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(RuvaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(RuvaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(RuvaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(RuvaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(RuvaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(RuvaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(RuvaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(RuvaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(RuvaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(RuvaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(RuvaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(RuvaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(RuvaParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(RuvaParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(RuvaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(RuvaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(RuvaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(RuvaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(RuvaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(RuvaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(RuvaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(RuvaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(RuvaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(RuvaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(RuvaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(RuvaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(RuvaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(RuvaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(RuvaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(RuvaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(RuvaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(RuvaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(RuvaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(RuvaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(RuvaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(RuvaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(RuvaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(RuvaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(RuvaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(RuvaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(RuvaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(RuvaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(RuvaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(RuvaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(RuvaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(RuvaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(RuvaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(RuvaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(RuvaParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(RuvaParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(RuvaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(RuvaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(RuvaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(RuvaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(RuvaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(RuvaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceCommonBodyDeclaration(RuvaParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceCommonBodyDeclaration(RuvaParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(RuvaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(RuvaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(RuvaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(RuvaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(RuvaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(RuvaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(RuvaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(RuvaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(RuvaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(RuvaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(RuvaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(RuvaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(RuvaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(RuvaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(RuvaParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(RuvaParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(RuvaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(RuvaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(RuvaParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(RuvaParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(RuvaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(RuvaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(RuvaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(RuvaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(RuvaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(RuvaParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIList(RuvaParser.LambdaLVTIListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIList(RuvaParser.LambdaLVTIListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIParameter(RuvaParser.LambdaLVTIParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIParameter(RuvaParser.LambdaLVTIParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(RuvaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(RuvaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(RuvaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(RuvaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(RuvaParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(RuvaParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(RuvaParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(RuvaParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAltAnnotationQualifiedName(RuvaParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAltAnnotationQualifiedName(RuvaParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(RuvaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(RuvaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(RuvaParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(RuvaParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(RuvaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(RuvaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(RuvaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(RuvaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(RuvaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(RuvaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(RuvaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(RuvaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(RuvaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(RuvaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(RuvaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(RuvaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(RuvaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(RuvaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(RuvaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(RuvaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(RuvaParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(RuvaParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(RuvaParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(RuvaParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(RuvaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(RuvaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(RuvaParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(RuvaParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void enterRecordHeader(RuvaParser.RecordHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void exitRecordHeader(RuvaParser.RecordHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponentList(RuvaParser.RecordComponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponentList(RuvaParser.RecordComponentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponent(RuvaParser.RecordComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponent(RuvaParser.RecordComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void enterRecordBody(RuvaParser.RecordBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void exitRecordBody(RuvaParser.RecordBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RuvaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RuvaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(RuvaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(RuvaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(RuvaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(RuvaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(RuvaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(RuvaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(RuvaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(RuvaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RuvaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RuvaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(RuvaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(RuvaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(RuvaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(RuvaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(RuvaParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(RuvaParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(RuvaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(RuvaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(RuvaParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(RuvaParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(RuvaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(RuvaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(RuvaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(RuvaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(RuvaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(RuvaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(RuvaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(RuvaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(RuvaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(RuvaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(RuvaParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(RuvaParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(RuvaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(RuvaParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(RuvaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(RuvaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(RuvaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(RuvaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RuvaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RuvaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(RuvaParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(RuvaParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(RuvaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(RuvaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(RuvaParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(RuvaParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(RuvaParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(RuvaParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(RuvaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(RuvaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpression(RuvaParser.SwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpression(RuvaParser.SwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabeledRule(RuvaParser.SwitchLabeledRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabeledRule(RuvaParser.SwitchLabeledRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void enterGuardedPattern(RuvaParser.GuardedPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void exitGuardedPattern(RuvaParser.GuardedPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void enterSwitchRuleOutcome(RuvaParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void exitSwitchRuleOutcome(RuvaParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(RuvaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(RuvaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(RuvaParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(RuvaParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(RuvaParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(RuvaParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(RuvaParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(RuvaParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(RuvaParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(RuvaParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(RuvaParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(RuvaParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(RuvaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(RuvaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(RuvaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(RuvaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(RuvaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(RuvaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(RuvaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(RuvaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(RuvaParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(RuvaParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(RuvaParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(RuvaParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(RuvaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(RuvaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(RuvaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(RuvaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(RuvaParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(RuvaParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(RuvaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(RuvaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuvaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(RuvaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuvaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(RuvaParser.ArgumentsContext ctx);
}
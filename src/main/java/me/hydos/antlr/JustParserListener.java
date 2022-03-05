// Generated from JustParser.g4 by ANTLR 4.9.3

 package me.hydos.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JustParser}.
 */
public interface JustParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JustParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JustParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JustParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JustParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JustParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JustParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JustParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JustParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JustParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JustParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JustParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(JustParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(JustParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JustParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JustParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JustParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JustParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JustParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JustParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JustParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JustParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JustParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JustParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JustParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JustParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(JustParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(JustParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JustParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JustParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JustParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JustParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JustParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JustParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JustParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JustParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JustParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JustParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JustParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JustParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JustParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JustParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JustParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JustParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JustParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JustParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(JustParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(JustParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(JustParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(JustParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(JustParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(JustParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JustParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JustParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JustParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JustParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(JustParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(JustParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JustParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JustParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(JustParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(JustParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(JustParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(JustParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JustParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JustParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JustParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JustParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(JustParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(JustParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceCommonBodyDeclaration(JustParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceCommonBodyDeclaration(JustParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JustParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JustParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JustParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JustParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JustParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JustParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JustParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JustParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JustParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JustParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JustParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JustParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JustParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JustParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(JustParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(JustParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JustParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JustParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JustParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JustParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JustParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JustParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JustParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JustParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JustParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JustParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIList(JustParser.LambdaLVTIListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIList(JustParser.LambdaLVTIListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIParameter(JustParser.LambdaLVTIParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIParameter(JustParser.LambdaLVTIParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JustParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JustParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JustParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JustParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JustParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JustParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(JustParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(JustParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAltAnnotationQualifiedName(JustParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAltAnnotationQualifiedName(JustParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JustParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JustParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(JustParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(JustParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JustParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JustParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JustParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JustParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JustParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JustParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JustParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JustParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JustParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JustParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JustParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JustParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(JustParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(JustParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(JustParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(JustParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(JustParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(JustParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(JustParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(JustParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JustParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JustParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(JustParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(JustParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void enterRecordHeader(JustParser.RecordHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void exitRecordHeader(JustParser.RecordHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponentList(JustParser.RecordComponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponentList(JustParser.RecordComponentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponent(JustParser.RecordComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponent(JustParser.RecordComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void enterRecordBody(JustParser.RecordBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void exitRecordBody(JustParser.RecordBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JustParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JustParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JustParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JustParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JustParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JustParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JustParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JustParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(JustParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(JustParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JustParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JustParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JustParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JustParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JustParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JustParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(JustParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(JustParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JustParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JustParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(JustParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(JustParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JustParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JustParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JustParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JustParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JustParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JustParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JustParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JustParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JustParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JustParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(JustParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(JustParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JustParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JustParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JustParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JustParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JustParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JustParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JustParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JustParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(JustParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(JustParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JustParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JustParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JustParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JustParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JustParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JustParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JustParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JustParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpression(JustParser.SwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpression(JustParser.SwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabeledRule(JustParser.SwitchLabeledRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabeledRule(JustParser.SwitchLabeledRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void enterGuardedPattern(JustParser.GuardedPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void exitGuardedPattern(JustParser.GuardedPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void enterSwitchRuleOutcome(JustParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void exitSwitchRuleOutcome(JustParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JustParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JustParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JustParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JustParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(JustParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(JustParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(JustParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(JustParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(JustParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(JustParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(JustParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(JustParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(JustParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(JustParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JustParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JustParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(JustParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(JustParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(JustParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(JustParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(JustParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(JustParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(JustParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(JustParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JustParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JustParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JustParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JustParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(JustParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(JustParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(JustParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(JustParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JustParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JustParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JustParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JustParser.ArgumentsContext ctx);
}
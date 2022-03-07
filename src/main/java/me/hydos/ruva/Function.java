package me.hydos.ruva;

import me.hydos.ruva.statements.Statement;
import me.hydos.ruva.visitor.Visibility;

import java.util.List;

public record Function(String name, Type returnType, Visibility visibility, List<MethodParameter> parameters, List<Statement> statements) {
}

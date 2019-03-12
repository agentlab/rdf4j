/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
/* Generated By:JJTree: Do not edit this line. ASTCount.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.eclipse.rdf4j.query.parser.sparql.ast;

public class ASTCount extends ASTAggregate {

	private boolean wildcard;

	public ASTCount(int id) {
		super(id);
	}

	public ASTCount(SyntaxTreeBuilder p, int id) {
		super(p, id);
	}

	/** Accept the visitor. **/
	@Override
	public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
		return visitor.visit(this, data);
	}

	/**
	 * @param b
	 */
	public void setWildcard(boolean b) {
		wildcard = b;
	}

	public boolean isWildcard() {
		return wildcard;

	}
}
/* JavaCC - OriginalChecksum=4565aae057280a44dedd645dc357eba0 (do not edit this line) */

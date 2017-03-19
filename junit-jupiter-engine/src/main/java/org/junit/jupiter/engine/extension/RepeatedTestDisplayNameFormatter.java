/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.jupiter.engine.extension;

/**
 * @since 5.0
 */
class RepeatedTestDisplayNameFormatter {

	private final String namePattern;

	RepeatedTestDisplayNameFormatter(String namePattern) {
		this.namePattern = namePattern;
	}

	String format(String displayName, int invocationIndex) {
		String result = namePattern.replace("{index}", String.valueOf(invocationIndex));
		return result.replace("{displayName}", displayName);
	}

}

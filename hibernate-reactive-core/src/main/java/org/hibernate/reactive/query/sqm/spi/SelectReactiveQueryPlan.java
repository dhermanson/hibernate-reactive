/* Hibernate, Relational Persistence for Idiomatic Java
 *
 * SPDX-License-Identifier: Apache-2.0
 * Copyright: Red Hat Inc. and Hibernate Authors
 */
package org.hibernate.reactive.query.sqm.spi;

import java.util.List;
import java.util.concurrent.CompletionStage;

import org.hibernate.query.spi.DomainQueryExecutionContext;
import org.hibernate.query.spi.SelectQueryPlan;

/**
 * @see org.hibernate.query.spi.SelectQueryPlan
 */
public interface SelectReactiveQueryPlan<R> extends SelectQueryPlan<R> {
	/**
	 * Perform (execute) the query returning a List
	 */
	CompletionStage<List<R>> performReactiveList(DomainQueryExecutionContext executionContext);
}
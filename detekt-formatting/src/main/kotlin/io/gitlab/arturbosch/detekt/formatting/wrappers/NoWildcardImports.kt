package io.gitlab.arturbosch.detekt.formatting.wrappers

import com.github.shyiko.ktlint.ruleset.standard.NoWildcardImportsRule
import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.formatting.FormattingRule

/**
 * See https://ktlint.github.io for documentation.
 *
 * @author Artur Bosch
 */
class NoWildcardImports(config: Config) : FormattingRule(config) {

	override val wrapping = NoWildcardImportsRule()
	override val issue = issueFor("Detects wildcast import usages")
}

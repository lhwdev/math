package com.lhwdev.math.logic.propositional


interface Conditional : Proposition {
	val antecedent: Proposition
	val consequent: Proposition
}


/**
 * Represents [Material conditional](https://en.wikipedia.org/wiki/Material_conditional), which is conditional you
 * likely are most familiar.
 */
class MaterialConditional(override val antecedent: Proposition, override val consequent: Proposition) : Conditional {
}

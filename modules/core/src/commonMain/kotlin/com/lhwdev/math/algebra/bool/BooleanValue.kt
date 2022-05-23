package com.lhwdev.math.algebra.bool

import com.lhwdev.math.algebra.AlgebraSet


interface BooleanValue : AlgebraValue {
	override val algebraSet: AlgebraSet
		get() = BooleanSet
}

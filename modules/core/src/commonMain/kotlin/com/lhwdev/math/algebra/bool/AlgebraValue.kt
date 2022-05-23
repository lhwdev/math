package com.lhwdev.math.algebra.bool

import com.lhwdev.math.algebra.AlgebraSet
import com.lhwdev.math.core.MathValue


interface AlgebraValue : MathValue {
	val algebraSet: AlgebraSet
}

import com.lhwdev.build.*


plugins {
	kotlin("multiplatform")
	
	id("common-plugin") // must be applied after Kotlin/Android plugins
}

kotlin {
	library()
}


dependencies {
	
}

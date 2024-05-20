// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins{
    alias(libs.plugins.android.application) apply false

}
ext{
    val appCompatVersion = "1.5.1"
    val constraintLayoutVersion = "2.1.4"
    val coreTestingVersion = "2.1.0"
    val lifecycleVersion = "2.3.1"
    val materialVersion = "1.3.0"
    val roomVersion = "2.3.0"
    // testing
    val junitVersion = "4.13.2"
    val espressoVersion = "3.4.0"
    val androidxJunitVersion = "1.1.2"
}
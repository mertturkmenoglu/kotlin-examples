import java.nio.file.Paths

object Resources {
    val path = Paths.get(
            System.getProperty("user.dir"),
            "kotlinExamples",
            "src",
            "examples",
            "build",
            "resources",
            "main"
    ).toString()
}
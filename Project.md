# Project Structure
***
```
    | -> src
        | -> examples
            | -> build
            | -> gradle
            | -> src
                | -> main
                    | -> java
                    | -> kotlin
                        | -> algorithms
                        | -> basics
                        | -> collections
                            | -> general
                            | -> list
                            | -> map
                            | -> set
                            | -> treemap
                        | -> coroutines
                        | -> datetime
                        | -> db
                        | -> delegates
                        | -> designPatterns
                        | -> dsl
                        | -> enums
                        | -> fileIO
                        | -> functional
                        | -> gui
                            | -> swing
                            | -> tornadofx
                        | -> jvm
                        | -> networking
                        | -> oop
                        | -> other
                        | -> practice
                            | -> imageProcessing
                            | -> problemSolving
                        | -> reflection
                        | -> regex
                        | -> serialization
                        | -> smartCast
                    | -> resources
                        | -> img
                        | -> text
                | -> test
```
***
* `src`: Sources folder. It is the root folder of all project files.
    * `examples`: Subpackage of src. It is the root folder of the Gradle module.
        * `build`: Contains Gradle build files.
        * `gradle`: Contains Gradle tool files.
        * `src`: Source folder of the Gradle module.
            * `main`: Contains all code files.
                * `java`: It is an empty folder for Gradle. Java example codes are in different folder.
                * `kotlin`: Contains all Kotlin examples and codes.
                * `resources`: Contains project resources like image, text, database files, etc.
                    * `img`: Image resource folder.
                    * `text`: Text resource folder.
            * `test`: Contains unit test files.
***
# Kotlin Folder
***
* `algorithms`: Different types of algorithm implementations.
* `basics`: Language basics. Syntax and basic operation/function examples.
* `collections`: Contains collections library examples.
    * `general`: Examples about all types of collections..
    * `list`: List / Mutable List / Array List collection examples.
    * `map`: Map / Mutable Map / Hash Map collection examples.
    * `set`: Set / Mutable Set / Hash Set collection examples.
    * `treemap`: TreeMap collection examples.
* `coroutines`: Kotlinx coroutine library examples. Contains examples about asynchronous event handling. 
* `datetime`: Date and time format, get, set examples.
* `db`: Database connection examples for SQLite 3 and PostgreSQL.
* `delegates`: Kotlin delegated properties examples.
* `designPatterns`: OOP Design Patterns implementations.
* `dsl`: Domain Specific Language examples.
* `enums`: Enum data type examples.
* `fileIO`: File IO operation (read / write) examples.
* `functional`: Functional programming concepts examples.
* `gui`:
    * `swing`: Swing library examples.
    * `tornadofx`: TornadoFX and JavaFX libraries examples.
* `jvm`: Java interoperability and Kotlin-JVM relation examples.
* `networking`: Networking, HTTP requests, JSON examples.
* `oop`: OOP concepts examples.
* `other`: Miscellaneous programming examples.
* `practice`:
    * `imageProcessing`: Basic image processing examples with TornadoFX library.
    * `problemSolving`: Different types of problem solving exercises.
* `reflection`: Kotlin Reflection library examples.
* `regex`: Regular Expression examples.
* `serialization`: JVM Serialization examples.
* `smartCast`: Smart Cast feature examples.
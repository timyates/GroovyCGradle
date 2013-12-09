## Description:

A Gradle 1.9 project that compiles some C code to a shared library, some groovy
code that loads that library via JNA and a Spock test to make sure it works.

Gradle 1.9 introduced the incubating `c` plugin, so names no longer appear to be
mangled.

## Known Issues

 - <s>I believe Gradle is using g++ for the compilation, and I can't work out how
   to avoid name mangling (ie:  The `add` method has to be called `_Z3addii`)
   in Groovy.</s>
 - <s>On OS X, you can use `nm libGroovyCProject.dylib` to find the mangled name of
   your functions.</s>
 - Not tried this project on Windows or Linux ;-)
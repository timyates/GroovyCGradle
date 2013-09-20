package com.bloidonia.groovycpp

import com.sun.jna.Library
import com.sun.jna.Native

class Example {
    static myMath = Native.loadLibrary( 'GroovyCGradle', IMath )

    int add( int a, int b ) {
        myMath._Z3addii( a, b )
    }
}
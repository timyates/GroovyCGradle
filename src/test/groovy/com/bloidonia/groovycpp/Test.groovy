package com.bloidonia.groovycpp

import spock.lang.*

class Test extends Specification {

    def "Functionality check"() {
        given:
            def m = new Example()

        expect:
            m.add( a, b ) == result

        where:
            a  |  b  |  result
             1 |  1  |  2
            -1 |  1  |  0
             2 |  0  |  2
    }
}  
package com.bloidonia.groovycpp

import com.sun.jna.Library

interface IMath extends Library {
  int _Z3addii( int a, int b )
}
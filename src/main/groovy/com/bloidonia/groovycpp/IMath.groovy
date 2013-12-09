package com.bloidonia.groovycpp

import com.sun.jna.Library

interface IMath extends Library {
  int add( int a, int b )
}
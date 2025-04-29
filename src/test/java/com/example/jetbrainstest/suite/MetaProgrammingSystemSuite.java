package com.example.jetbrainstest.suite;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.example.jetbrainstest.tests")
@IncludeTags("AnotherCheck")
public class MetaProgrammingSystemSuite {
}

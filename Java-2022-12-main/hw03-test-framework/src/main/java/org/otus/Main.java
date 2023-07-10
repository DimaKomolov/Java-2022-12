
package org.otus;


import org.otus.Test.TestRunner;

public class Main {
    public static void main(String... args) throws Exception {
        TestRunner testRunner = new TestRunner();
        testRunner.runTests("org.otus.Test.TestClass");
    }
}

RelProxy
========

News
------

- 2014-02-11 v0.8 Released! First release.

Download Binaries and Docs
------

Last version: v0.8

[Download](https://sourceforge.net/projects/relproxy/files/)

Distribution file includes binaries, manual and javadocs.

Overview
------

RelProxy is a simple Java and Groovy hot class reloader for Java and Groovy providing transparent compilation and class reload on the fly, and scripting support and shell of pure Java code

In case of Java "scripting", there is no a new language, is pure Java code with compilation on the fly.

In spite of RelProxy is a general purpose tool it was heavily inspired in ItsNat web framework to provide hot class reload in development time... and if you want also in production.

Take a look to the source code of RelProxy and [ItsNat Experiments](https://github.com/jmarranz/itsnat/tree/master/inexperiments) for Maven and Ant configurations (for NetBeans) and code examples of how to use with ItsNat (Java and Groovy code) and standalone shell. ItsNat examples are just an example of use case of RelProxy, RelProxy has no dependency on ItsNat and is not part of ItsNat.

As bonus, RelProxy provides a shell scripting environment to execute:

1) A pure Java archive packaged like a shell script file with no need of previous compilation, compilation is done on the fly and optionally .class can be saved in a 
cache to provide the fastest "scripting" language of the world. Code in the initial archive can call to other normal Java files, again with compilation on the fly 
and optional compilation caching as .class files. [Example 1](https://github.com/jmarranz/relproxy/blob/master/src/test/resources/example_java_shell) 
and [example 2](https://github.com/jmarranz/relproxy/blob/master/src/test/resources/example_java_shell_complete_class) or just
a conventional [Java source file](https://github.com/jmarranz/relproxy/blob/master/src/test/resources/example_normal_class.java) (yes you can execute a conventional
JavaSE application from source code).

2) Execution of Java code snippets in command line (no need of packaging in an archive). [Example](https://github.com/jmarranz/relproxy/blob/master/test_cmd/test_java_shell_snippet_launcher.sh).

3) Interactive console to edit and execute Java code (ever compilation on the fly). [Example of launcher](https://github.com/jmarranz/relproxy/blob/master/test_cmd/test_java_shell_interactive_launcher.sh)

Finally RelProxy implements the official JSR-223 [Java Scripting API](http://docs.oracle.com/javase/6/docs/technotes/guides/scripting/programmer_guide/index.html) as found in Java 1.6 for "Java" language.

Yes, Java is also a dynamic and scripting language with no need of manual compilation and extremely fast and robust.

Online Docs Last Version
------

[Manual](http://relproxy.sourceforge.net/docs/manual.html)

[JavaDocs](http://relproxy.sourceforge.net/docs/javadoc/)



Questions and discussions
------

There is a [Google Group](https://groups.google.com/forum/#!forum/relproxy) for RelProxy.

Bug Reporting
------

Use this GitHub project.


Latest Doc
------

You can read the [in progress latest documentation here](https://github.com/jmarranz/relproxy/blob/master/src/main/asciidoc/manual.asciidoc)

Articles/Presentations
------

[v0.8 announce at JavaHispano](http://www.javahispano.org/portada/2014/2/12/publicado-relproxy-v08-hot-class-reloader-y-scripting-para-j.html)

[v0.8 announce at JavaLobby](http://java.dzone.com/articles/presenting-relproxy-hot-class)


# DemoMulitThreading
In this demo, we explore how multi-threading works in Java.

Author: Dr. YUHANG ZHAO

One way to implement thread is to extend the class "Thread",
and it has to contain a method "run()".
Note the method name must be "run()" which contains the codes for doing something.
The thread instance uses "start()" to invoke, which implicitly calls run().
 
The other way is to implement the interface "Runnable",
which has to contain a method "run()".
The Runnable instance is used as the parameter for a thread instance.
Then the thread instance uses "start()" to invoke, which implicitly calls the Runnable method run().

Other features of multi-threading including naming, priority, isAlive, sleep, join.

Reference: MultiThreading in Java Theory, by Telusko
https://www.youtube.com/watch?v=L95658yXRgI&list=PLsyeobzWxl7rmuFYRpkqLanwoG4pQQ7oW
 

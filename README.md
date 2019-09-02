# DemoMulitThreading
In this demo, we explore how multi-threading works in Java.

Author: Dr. YUHANG ZHAO

One way to implement thread is to extend the class "Thread"
and it has to contain a method "run()".
Note the method name must be "run()" which contains codes do something.
The thread uses "start()" to invoke, which implicitly calls run().
 
The other way is to implement interface "Runnable",
which has to contain a method "run()".
The Runnable object is used as the parameter for a thread object.
Then the thread uses "start()" to invoke, which implicitly calls Runnable method run().

Other features of thread including name, priority, isAlive, sleep, join.
 

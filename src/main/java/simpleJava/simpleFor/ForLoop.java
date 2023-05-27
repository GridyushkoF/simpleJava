package simpleJava.simpleFor;

public class ForLoop {
    /*
     This for loop is designed to shorten the code,
     and now instead of for (int i = 0;i < 100;i++) {body}
     you can just do the following:
     1. Refer to the ForLoop class (ForLoop.)
     2. Call the run method (ForLoop.run())
     3. Write the first index and the index to which iterates (ForLoop.run(1,100,))
     4. Implement the LoopAction interface (for example, use a lambda expression) (ForLoop.run(1,100,i -> System.out.println(i+1)))
     5. Done, now you can use it in your code and make it simpler and more concise!
     6.important: if src > dst then for cycle will look like this: for (int i = 100;i > 0;i--) and the second parameter is not inclusive!!!
        And the ForLoop handles with exceptions, so you do not need to write try-catch
            For example: ForLoop.run(10,0, i -> {
            System.out.println(i);
            Thread.sleep(1000);
        });
     */
    public void run(int src, int dst, LoopAction loopAction) {
        try {
            if (src < dst) {
                for (int i = src; i < dst; i++) {
                    loopAction.execute(i);
                }
            } else if (src > dst) {
                for (int i = src; i > dst; i--) {
                    loopAction.execute(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void runStep(int src, int dst, int step, LoopAction loopAction){
        try {
            if (src < dst) {
                for (int i = src; i < dst; i += step) {
                    loopAction.execute(i);
                }
            } else if (src > dst) {
                for (int i = src; i > dst; i -= step) {
                    loopAction.execute(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}